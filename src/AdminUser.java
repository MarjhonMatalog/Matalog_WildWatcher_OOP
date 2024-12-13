class AdminUser extends UserAccount {
    public AdminUser(String username, String password) {
        super(username, password);
    }
    // DISPLAY ADMIN
    @Override
    public void showDashboard() {
        System.out.println("Admin Dashboard: Manage Users and Data.");
    }
    //DELETE ALL ANIMAL SIGHTING
    public void deleteAllSightings() {
        WildWatcher.sightings.clear();
        System.out.println("All sightings deleted by admin.");
    }
}
