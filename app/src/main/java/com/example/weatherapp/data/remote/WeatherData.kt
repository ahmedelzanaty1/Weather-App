import com.google.gson.annotations.SerializedName

data class WeatherData(
	@SerializedName("elevation")
	val elevation: Double? = null,

	@SerializedName("hourly_units")
	val hourlyUnits: HourlyUnits? = null,

	@SerializedName("generationtime_ms")
	val generationTimeMs: Double? = null,

	@SerializedName("timezone_abbreviation")
	val timezoneAbbreviation: String? = null,

	@SerializedName("timezone")
	val timezone: String? = null,

	@SerializedName("latitude")
	val latitude: Double? = null,

	@SerializedName("utc_offset_seconds")
	val utcOffsetSeconds: Int? = null,

	@SerializedName("hourly")
	val hourly: Hourly? = null,

	@SerializedName("longitude")
	val longitude: Double? = null
)

data class HourlyUnits(
	@SerializedName("temperature_2m")
	val temperature2m: String? = null,

	@SerializedName("time")
	val time: String? = null
)

data class Hourly(
	@SerializedName("temperature_2m")
	val temperature2m: List<Double?>? = null,  // غيرت Any? إلى Double?

	@SerializedName("time")
	val time: List<String>? = null  // لا داعي أن تكون String?
)
