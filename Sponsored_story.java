class InstaStory {

    protected int storyViews = 500;
}

class SponsoredStory extends InstaStory {

    void showViews() {
        System.out.println("Story Views: " + storyViews);
    }

    public static void main(String[] args) {

        SponsoredStory s = new SponsoredStory();

        s.showViews();
    }
}
