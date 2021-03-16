package easy;

public class ACMICPCTeam {
    static int[] acmTeam(String[] topic) {
        int[] topicsPerTeam = new int[topic.length * (topic.length - 1) / 2];
        int teamIndex = 0;
        for (int i = 0; i < topic.length; i++) {
            for (int j = i + 1; j < topic.length; j++) {
                int topicsKnown = 0;
                for (int k = 0; k < topic[i].length(); k++) {
                    if (topic[i].charAt(k) == '1' || topic[j].charAt(k) == '1') {
                        topicsKnown++;
                    }
                }
                topicsPerTeam[teamIndex++] = topicsKnown;
            }
        }

        int maximumTopics = 0;
        for (int topicsKnown : topicsPerTeam) {
            if (topicsKnown > maximumTopics) {
                maximumTopics = topicsKnown;
            }
        }

        int maximumTopicTeams = 0;
        for (int topicsKnown : topicsPerTeam) {
            if (topicsKnown == maximumTopics) {
                maximumTopicTeams++;
            }
        }

        return new int[]{maximumTopics, maximumTopicTeams};
    }
}
