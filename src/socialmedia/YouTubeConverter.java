
class YouTubeConverter implements SocialMediaEntry {
    private YouTubeVideo y;
	
	public YouTubeConverter(YouTubeVideo you) {
		y = you;
	}
	
	private YouTubeConverter() {
		// do nothing you scallywag
	}
	
	// the functions that the interface requires
	public String getUser() {
		return y.getAuthor();
	}
	
    public String getPostText() {
		String whatYouWant = y.getTitle() + " - " + y.getDescription();
		return whatYouWant;
	}
	
}