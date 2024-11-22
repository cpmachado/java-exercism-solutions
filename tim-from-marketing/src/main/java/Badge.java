class Badge {
    public String print(Integer id, String name, String department) {
        StringBuilder res = new StringBuilder();
        if (id != null) {
            res.append("[" + id.toString() + "] - ");
        }
        res.append(name);
        res.append(" - ");
        if (department != null) {
            res.append(department.toUpperCase());
        } else {
            res.append("OWNER");
        }
        return res.toString();
    }
}
