package hudson.plugins.performance;

import org.kohsuke.stapler.Stapler;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;

/**
 * Abstract class for classes with size, error, mean, average, 90 line, min and max attributes
 */
public abstract class AbstractReport {

  private NumberFormat percentFormat;
  private NumberFormat dataFormat;

  abstract public int countErrors();

  abstract public double errorPercent();

  public AbstractReport() {
    if (Stapler.getCurrentRequest() != null) {
      Locale.setDefault(Stapler.getCurrentRequest().getLocale());
    }
    percentFormat = new DecimalFormat("0.0");
    dataFormat = new DecimalFormat("#,###");
  }

  public String errorPercentFormated() {
    Stapler.getCurrentRequest().getLocale();
    return percentFormat.format(errorPercent());
  }

  abstract public long getAverage();

  public String getAverageFormated() {
    return dataFormat.format(getAverage());
  }

  abstract public long getMedian();

  public String getMeanFormated() {
    return dataFormat.format(getMedian());
  }

  abstract public long get999Line();

  public String get999LineFormated() {
    return dataFormat.format(get999Line());
  }

  abstract public long get99Line();

  public String get99LineFormated() {
	  return dataFormat.format(get99Line());
  }

  abstract public long get98Line();

  public String get98LineFormated() {
	  return dataFormat.format(get98Line());
  }

  abstract public long get95Line();

  public String get95LineFormated() {
	  return dataFormat.format(get95Line());
  }

  abstract public long get90Line();

  public String get90LineFormated() {
	  return dataFormat.format(get90Line());
  }

  abstract public long get75Line();

  public String get75LineFormated() {
	  return dataFormat.format(get75Line());
  }

  abstract public long get60Line();

  public String get60LineFormated() {
	  return dataFormat.format(get60Line());
  }

  abstract public long get50Line();

  public String get50LineFormated() {
	  return dataFormat.format(get50Line());
  }

  abstract public long get40Line();

  public String get40LineFormated() {
	  return dataFormat.format(get40Line());
  }

  abstract public long get30Line();

  public String get30LineFormated() {
	  return dataFormat.format(get30Line());
  }

  abstract public long get20Line();

  public String get20LineFormated() {
	  return dataFormat.format(get20Line());
  }

  abstract public long get10Line();

  public String get10LineFormated() {
	  return dataFormat.format(get10Line());
  }

  abstract public long getMax();

  public String getMaxFormated() {
    return dataFormat.format(getMax());
  }

  abstract public long getMin();

  abstract public int size();

  abstract public String getHttpCode();

  abstract public long getAverageDiff();

  abstract public long getMedianDiff();

  abstract public double getErrorPercentDiff();

  abstract public String getLastBuildHttpCodeIfChanged();

  abstract public int getSizeDiff();

  abstract public double getTps();

  abstract public int getThreadNum();
}
