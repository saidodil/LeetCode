/**
 * 1507. Reformat Date
 * 
 * Given a date string in the form Day Month Year, where:
 *  1. Day is in the set {"1st", "2nd", "3rd", "4th", ..., "30th", "31st"}.
 *  2. Month is in the set {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"}.
 *  3. Year is in the range [1900, 2100].
 * Convert the date string to the format YYYY-MM-DD, where:
 *  1. YYYY denotes the 4 digit year.
 *  2. MM denotes the 2 digit month.
 *  3. DD denotes the 2 digit day.
 */

class ReformatDate {
  public String reformatDate(String theDate) {
      String[] parts = theDate.split(" ");

      String day = parts[0].substring(0, parts[0].length() - 2);
      String month = parts[1];
      String year = parts[2];

      // Map month names to month numbers
      Map<String, String> monthMap = new HashMap<>();
      monthMap.put("Jan", "01");
      monthMap.put("Feb", "02");
      monthMap.put("Mar", "03");
      monthMap.put("Apr", "04");
      monthMap.put("May", "05");
      monthMap.put("Jun", "06");
      monthMap.put("Jul", "07");
      monthMap.put("Aug", "08");
      monthMap.put("Sep", "09");
      monthMap.put("Oct", "10");
      monthMap.put("Nov", "11");
      monthMap.put("Dec", "12");

      // Format day with leading zero if necessary
      if (day.length() == 1)
          day = "0" + day;

      return year + "-" + monthMap.get(month) + "-" + day;
  }
}
