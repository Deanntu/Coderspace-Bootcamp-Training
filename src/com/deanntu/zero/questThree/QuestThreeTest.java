package com.deanntu.zero.questThree;

import java.util.ArrayList;

public class QuestThreeTest {
	
	public static void main(String[] args) {
		
		//league
		League league=new League(01,"Superlig");
		league.setTeamList(new ArrayList<>());
		
		//teamA
		Team teamA=new Team(01,"Deanntu Spor");
		teamA.setPlayerList(new ArrayList<>());
		
		Player player1=new Player(01,"Tugra Demirel",9.67);
		player1.setTeam(teamA);	
		teamA.getPlayerList().add(player1);
		
		Player player2=new Player(02,"Admin Admin",7.89);
		player2.setTeam(teamA);	
		teamA.getPlayerList().add(player2);
		
		Player player3=new Player(03,"Test Test",6.61);
		player3.setTeam(teamA);	
		teamA.getPlayerList().add(player3);
		
		league.getTeamList().add(teamA);

		//teamB
		Team teamB=new Team(02,"Tuande Spor");
		teamB.setPlayerList(new ArrayList<>());
		
		Player player4=new Player(04,"Neset Gurses",2.93);
		player4.setTeam(teamB);	
		teamB.getPlayerList().add(player4);
		
		Player player5=new Player(05,"Muslum Ertas",8.11);
		player5.setTeam(teamB);	
		teamB.getPlayerList().add(player5);

		league.getTeamList().add(teamB);
		
		System.out.println(league.getLeagueId()+" "+league.getLeagueName());
		for (Team team : league.getTeamList()) {
			
			System.out.println("\t"+team.getTeamId()+" "+team.getTeamName());

			for (Player player : team.getPlayerList()) {
				System.out.println( "\t\t"+ player.getPlayerId()+" "
										+player.getPlayerName()+" "
										+player.getAverageScore());
			}
		}	
	}
	
}
