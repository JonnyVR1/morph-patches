package p153l;

import android.annotation.SuppressLint;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.location.Location;
import android.media.MediaDataSource;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.system.OsConstants;
import android.util.Log;
import android.util.Pair;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import com.clevertap.android.sdk.Constants;
import com.google.android.gms.common.api.Api;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.tencent.could.huiyansdk.overseas.HuiYanResultSender;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.TimeZone;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.CRC32;
import org.apache.commons.codec.CharEncoding;
import org.apache.commons.sudcompress.archivers.zip.UnixStat;
import org.eclipse.jetty.http.HttpStatus;
import org.eclipse.jetty.http.HttpTokens;
import org.fourthline.cling.support.model.dlna.DLNAProfiles;
import org.slf4j.Marker;
import org.spongycastle.math.p135ec.Tnaf;

/* JADX INFO: loaded from: classes.dex */
public class p7f {
    public static final short ALTITUDE_ABOVE_SEA_LEVEL = 0;
    public static final short ALTITUDE_BELOW_SEA_LEVEL = 1;
    static final Charset ASCII;
    static final short BYTE_ALIGN_II = 18761;
    static final short BYTE_ALIGN_MM = 19789;
    public static final int COLOR_SPACE_S_RGB = 1;
    public static final int COLOR_SPACE_UNCALIBRATED = 65535;
    public static final short CONTRAST_HARD = 2;
    public static final short CONTRAST_NORMAL = 0;
    public static final short CONTRAST_SOFT = 1;
    public static final int DATA_DEFLATE_ZIP = 8;
    public static final int DATA_HUFFMAN_COMPRESSED = 2;
    public static final int DATA_JPEG = 6;
    public static final int DATA_JPEG_COMPRESSED = 7;
    public static final int DATA_LOSSY_JPEG = 34892;
    public static final int DATA_PACK_BITS_COMPRESSED = 32773;
    public static final int DATA_UNCOMPRESSED = 1;
    private static final Pattern DATETIME_PRIMARY_FORMAT_PATTERN;
    private static final Pattern DATETIME_SECONDARY_FORMAT_PATTERN;
    private static final int DATETIME_VALUE_STRING_LENGTH = 19;
    private static final C19317e[] EXIF_POINTER_TAGS;
    static final C19317e[][] EXIF_TAGS;
    public static final short EXPOSURE_MODE_AUTO = 0;
    public static final short EXPOSURE_MODE_AUTO_BRACKET = 2;
    public static final short EXPOSURE_MODE_MANUAL = 1;
    public static final short EXPOSURE_PROGRAM_ACTION = 6;
    public static final short EXPOSURE_PROGRAM_APERTURE_PRIORITY = 3;
    public static final short EXPOSURE_PROGRAM_CREATIVE = 5;
    public static final short EXPOSURE_PROGRAM_LANDSCAPE_MODE = 8;
    public static final short EXPOSURE_PROGRAM_MANUAL = 1;
    public static final short EXPOSURE_PROGRAM_NORMAL = 2;
    public static final short EXPOSURE_PROGRAM_NOT_DEFINED = 0;
    public static final short EXPOSURE_PROGRAM_PORTRAIT_MODE = 7;
    public static final short EXPOSURE_PROGRAM_SHUTTER_PRIORITY = 4;
    public static final short FILE_SOURCE_DSC = 3;
    public static final short FILE_SOURCE_OTHER = 0;
    public static final short FILE_SOURCE_REFLEX_SCANNER = 2;
    public static final short FILE_SOURCE_TRANSPARENT_SCANNER = 1;
    public static final short FLAG_FLASH_FIRED = 1;
    public static final short FLAG_FLASH_MODE_AUTO = 24;
    public static final short FLAG_FLASH_MODE_COMPULSORY_FIRING = 8;
    public static final short FLAG_FLASH_MODE_COMPULSORY_SUPPRESSION = 16;
    public static final short FLAG_FLASH_NO_FLASH_FUNCTION = 32;
    public static final short FLAG_FLASH_RED_EYE_SUPPORTED = 64;
    public static final short FLAG_FLASH_RETURN_LIGHT_DETECTED = 6;
    public static final short FLAG_FLASH_RETURN_LIGHT_NOT_DETECTED = 4;
    public static final short FORMAT_CHUNKY = 1;
    public static final short FORMAT_PLANAR = 2;
    public static final short GAIN_CONTROL_HIGH_GAIN_DOWN = 4;
    public static final short GAIN_CONTROL_HIGH_GAIN_UP = 2;
    public static final short GAIN_CONTROL_LOW_GAIN_DOWN = 3;
    public static final short GAIN_CONTROL_LOW_GAIN_UP = 1;
    public static final short GAIN_CONTROL_NONE = 0;
    public static final String GPS_DIRECTION_MAGNETIC = "M";
    public static final String GPS_DIRECTION_TRUE = "T";
    public static final String GPS_DISTANCE_KILOMETERS = "K";
    public static final String GPS_DISTANCE_MILES = "M";
    public static final String GPS_DISTANCE_NAUTICAL_MILES = "N";
    public static final String GPS_MEASUREMENT_2D = "2";
    public static final String GPS_MEASUREMENT_3D = "3";
    public static final short GPS_MEASUREMENT_DIFFERENTIAL_CORRECTED = 1;
    public static final String GPS_MEASUREMENT_INTERRUPTED = "V";
    public static final String GPS_MEASUREMENT_IN_PROGRESS = "A";
    public static final short GPS_MEASUREMENT_NO_DIFFERENTIAL = 0;
    public static final String GPS_SPEED_KILOMETERS_PER_HOUR = "K";
    public static final String GPS_SPEED_KNOTS = "N";
    public static final String GPS_SPEED_MILES_PER_HOUR = "M";
    private static final Pattern GPS_TIMESTAMP_PATTERN;
    static final byte[] IDENTIFIER_EXIF_APP1;
    private static final byte[] IDENTIFIER_XMP_APP1;
    private static final C19317e[] IFD_EXIF_TAGS;
    private static final int IFD_FORMAT_BYTE = 1;
    private static final int IFD_FORMAT_DOUBLE = 12;
    private static final int IFD_FORMAT_IFD = 13;
    private static final int IFD_FORMAT_SBYTE = 6;
    private static final int IFD_FORMAT_SINGLE = 11;
    private static final int IFD_FORMAT_SLONG = 9;
    private static final int IFD_FORMAT_SRATIONAL = 10;
    private static final int IFD_FORMAT_SSHORT = 8;
    private static final int IFD_FORMAT_STRING = 2;
    private static final int IFD_FORMAT_ULONG = 4;
    private static final int IFD_FORMAT_UNDEFINED = 7;
    private static final int IFD_FORMAT_URATIONAL = 5;
    private static final int IFD_FORMAT_USHORT = 3;
    private static final C19317e[] IFD_GPS_TAGS;
    private static final C19317e[] IFD_INTEROPERABILITY_TAGS;
    private static final int IFD_OFFSET = 8;
    private static final C19317e[] IFD_THUMBNAIL_TAGS;
    private static final C19317e[] IFD_TIFF_TAGS;
    private static final int IFD_TYPE_EXIF = 1;
    private static final int IFD_TYPE_GPS = 2;
    private static final int IFD_TYPE_INTEROPERABILITY = 3;
    private static final int IFD_TYPE_ORF_CAMERA_SETTINGS = 7;
    private static final int IFD_TYPE_ORF_IMAGE_PROCESSING = 8;
    private static final int IFD_TYPE_ORF_MAKER_NOTE = 6;
    private static final int IFD_TYPE_PEF = 9;
    static final int IFD_TYPE_PREVIEW = 5;
    static final int IFD_TYPE_PRIMARY = 0;
    static final int IFD_TYPE_THUMBNAIL = 4;
    static final int IMAGE_TYPE_ARW = 1;
    static final int IMAGE_TYPE_CR2 = 2;
    static final int IMAGE_TYPE_DNG = 3;
    static final int IMAGE_TYPE_HEIF = 12;
    static final int IMAGE_TYPE_JPEG = 4;
    static final int IMAGE_TYPE_NEF = 5;
    static final int IMAGE_TYPE_NRW = 6;
    static final int IMAGE_TYPE_ORF = 7;
    static final int IMAGE_TYPE_PEF = 8;
    static final int IMAGE_TYPE_PNG = 13;
    static final int IMAGE_TYPE_RAF = 9;
    static final int IMAGE_TYPE_RW2 = 10;
    static final int IMAGE_TYPE_SRW = 11;
    static final int IMAGE_TYPE_UNKNOWN = 0;
    static final int IMAGE_TYPE_WEBP = 14;
    public static final String LATITUDE_NORTH = "N";
    public static final String LATITUDE_SOUTH = "S";
    public static final short LIGHT_SOURCE_CLOUDY_WEATHER = 10;
    public static final short LIGHT_SOURCE_COOL_WHITE_FLUORESCENT = 14;
    public static final short LIGHT_SOURCE_D50 = 23;
    public static final short LIGHT_SOURCE_D55 = 20;
    public static final short LIGHT_SOURCE_D65 = 21;
    public static final short LIGHT_SOURCE_D75 = 22;
    public static final short LIGHT_SOURCE_DAYLIGHT = 1;
    public static final short LIGHT_SOURCE_DAYLIGHT_FLUORESCENT = 12;
    public static final short LIGHT_SOURCE_DAY_WHITE_FLUORESCENT = 13;
    public static final short LIGHT_SOURCE_FINE_WEATHER = 9;
    public static final short LIGHT_SOURCE_FLASH = 4;
    public static final short LIGHT_SOURCE_FLUORESCENT = 2;
    public static final short LIGHT_SOURCE_ISO_STUDIO_TUNGSTEN = 24;
    public static final short LIGHT_SOURCE_OTHER = 255;
    public static final short LIGHT_SOURCE_SHADE = 11;
    public static final short LIGHT_SOURCE_STANDARD_LIGHT_A = 17;
    public static final short LIGHT_SOURCE_STANDARD_LIGHT_B = 18;
    public static final short LIGHT_SOURCE_STANDARD_LIGHT_C = 19;
    public static final short LIGHT_SOURCE_TUNGSTEN = 3;
    public static final short LIGHT_SOURCE_UNKNOWN = 0;
    public static final short LIGHT_SOURCE_WARM_WHITE_FLUORESCENT = 16;
    public static final short LIGHT_SOURCE_WHITE_FLUORESCENT = 15;
    public static final String LONGITUDE_EAST = "E";
    public static final String LONGITUDE_WEST = "W";
    static final byte MARKER_APP1 = -31;
    private static final byte MARKER_COM = -2;
    static final byte MARKER_EOI = -39;
    private static final byte MARKER_SOF0 = -64;
    private static final byte MARKER_SOF1 = -63;
    private static final byte MARKER_SOF10 = -54;
    private static final byte MARKER_SOF11 = -53;
    private static final byte MARKER_SOF13 = -51;
    private static final byte MARKER_SOF14 = -50;
    private static final byte MARKER_SOF15 = -49;
    private static final byte MARKER_SOF2 = -62;
    private static final byte MARKER_SOF3 = -61;
    private static final byte MARKER_SOF5 = -59;
    private static final byte MARKER_SOF6 = -58;
    private static final byte MARKER_SOF7 = -57;
    private static final byte MARKER_SOF9 = -55;
    private static final byte MARKER_SOS = -38;
    private static final int MAX_THUMBNAIL_SIZE = 512;
    public static final short METERING_MODE_AVERAGE = 1;
    public static final short METERING_MODE_CENTER_WEIGHT_AVERAGE = 2;
    public static final short METERING_MODE_MULTI_SPOT = 4;
    public static final short METERING_MODE_OTHER = 255;
    public static final short METERING_MODE_PARTIAL = 6;
    public static final short METERING_MODE_PATTERN = 5;
    public static final short METERING_MODE_SPOT = 3;
    public static final short METERING_MODE_UNKNOWN = 0;
    private static final Pattern NON_ZERO_TIME_PATTERN;
    private static final C19317e[] ORF_CAMERA_SETTINGS_TAGS;
    private static final C19317e[] ORF_IMAGE_PROCESSING_TAGS;
    private static final int ORF_MAKER_NOTE_HEADER_1_SIZE = 8;
    private static final int ORF_MAKER_NOTE_HEADER_2_SIZE = 12;
    private static final C19317e[] ORF_MAKER_NOTE_TAGS;
    private static final short ORF_SIGNATURE_1 = 20306;
    private static final short ORF_SIGNATURE_2 = 21330;
    public static final int ORIENTATION_FLIP_HORIZONTAL = 2;
    public static final int ORIENTATION_FLIP_VERTICAL = 4;
    public static final int ORIENTATION_NORMAL = 1;
    public static final int ORIENTATION_ROTATE_180 = 3;
    public static final int ORIENTATION_ROTATE_270 = 8;
    public static final int ORIENTATION_ROTATE_90 = 6;
    public static final int ORIENTATION_TRANSPOSE = 5;
    public static final int ORIENTATION_TRANSVERSE = 7;
    public static final int ORIENTATION_UNDEFINED = 0;
    public static final int ORIGINAL_RESOLUTION_IMAGE = 0;
    private static final int PEF_MAKER_NOTE_SKIP_SIZE = 6;
    private static final String PEF_SIGNATURE = "PENTAX";
    private static final C19317e[] PEF_TAGS;
    public static final int PHOTOMETRIC_INTERPRETATION_BLACK_IS_ZERO = 1;
    public static final int PHOTOMETRIC_INTERPRETATION_RGB = 2;
    public static final int PHOTOMETRIC_INTERPRETATION_WHITE_IS_ZERO = 0;
    public static final int PHOTOMETRIC_INTERPRETATION_YCBCR = 6;
    private static final int PNG_CHUNK_CRC_BYTE_LENGTH = 4;
    private static final int PNG_CHUNK_TYPE_BYTE_LENGTH = 4;
    private static final int RAF_OFFSET_TO_JPEG_IMAGE_OFFSET = 84;
    private static final String RAF_SIGNATURE = "FUJIFILMCCD-RAW";
    public static final int REDUCED_RESOLUTION_IMAGE = 1;
    public static final short RENDERED_PROCESS_CUSTOM = 1;
    public static final short RENDERED_PROCESS_NORMAL = 0;
    public static final short RESOLUTION_UNIT_CENTIMETERS = 3;
    public static final short RESOLUTION_UNIT_INCHES = 2;
    private static final short RW2_SIGNATURE = 85;
    public static final short SATURATION_HIGH = 0;
    public static final short SATURATION_LOW = 0;
    public static final short SATURATION_NORMAL = 0;
    public static final short SCENE_CAPTURE_TYPE_LANDSCAPE = 1;
    public static final short SCENE_CAPTURE_TYPE_NIGHT = 3;
    public static final short SCENE_CAPTURE_TYPE_PORTRAIT = 2;
    public static final short SCENE_CAPTURE_TYPE_STANDARD = 0;
    public static final short SCENE_TYPE_DIRECTLY_PHOTOGRAPHED = 1;
    public static final short SENSITIVITY_TYPE_ISO_SPEED = 3;
    public static final short SENSITIVITY_TYPE_REI = 2;
    public static final short SENSITIVITY_TYPE_REI_AND_ISO = 6;
    public static final short SENSITIVITY_TYPE_SOS = 1;
    public static final short SENSITIVITY_TYPE_SOS_AND_ISO = 5;
    public static final short SENSITIVITY_TYPE_SOS_AND_REI = 4;
    public static final short SENSITIVITY_TYPE_SOS_AND_REI_AND_ISO = 7;
    public static final short SENSITIVITY_TYPE_UNKNOWN = 0;
    public static final short SENSOR_TYPE_COLOR_SEQUENTIAL = 5;
    public static final short SENSOR_TYPE_COLOR_SEQUENTIAL_LINEAR = 8;
    public static final short SENSOR_TYPE_NOT_DEFINED = 1;
    public static final short SENSOR_TYPE_ONE_CHIP = 2;
    public static final short SENSOR_TYPE_THREE_CHIP = 4;
    public static final short SENSOR_TYPE_TRILINEAR = 7;
    public static final short SENSOR_TYPE_TWO_CHIP = 3;
    public static final short SHARPNESS_HARD = 2;
    public static final short SHARPNESS_NORMAL = 0;
    public static final short SHARPNESS_SOFT = 1;
    private static final int SIGNATURE_CHECK_SIZE = 5000;
    private static final int SKIP_BUFFER_SIZE = 8192;
    public static final int STREAM_TYPE_EXIF_DATA_ONLY = 1;
    public static final int STREAM_TYPE_FULL_IMAGE_DATA = 0;
    public static final short SUBJECT_DISTANCE_RANGE_CLOSE_VIEW = 2;
    public static final short SUBJECT_DISTANCE_RANGE_DISTANT_VIEW = 3;
    public static final short SUBJECT_DISTANCE_RANGE_MACRO = 1;
    public static final short SUBJECT_DISTANCE_RANGE_UNKNOWN = 0;
    public static final String TAG_APERTURE_VALUE = "ApertureValue";
    public static final String TAG_ARTIST = "Artist";
    public static final String TAG_BITS_PER_SAMPLE = "BitsPerSample";
    public static final String TAG_BODY_SERIAL_NUMBER = "BodySerialNumber";
    public static final String TAG_BRIGHTNESS_VALUE = "BrightnessValue";

    @Deprecated
    public static final String TAG_CAMARA_OWNER_NAME = "CameraOwnerName";
    public static final String TAG_CAMERA_OWNER_NAME = "CameraOwnerName";
    public static final String TAG_CFA_PATTERN = "CFAPattern";
    public static final String TAG_COLOR_SPACE = "ColorSpace";
    public static final String TAG_COMPONENTS_CONFIGURATION = "ComponentsConfiguration";
    public static final String TAG_COMPRESSED_BITS_PER_PIXEL = "CompressedBitsPerPixel";
    public static final String TAG_COMPRESSION = "Compression";
    public static final String TAG_CONTRAST = "Contrast";
    public static final String TAG_COPYRIGHT = "Copyright";
    public static final String TAG_CUSTOM_RENDERED = "CustomRendered";
    public static final String TAG_DATETIME = "DateTime";
    public static final String TAG_DATETIME_DIGITIZED = "DateTimeDigitized";
    public static final String TAG_DATETIME_ORIGINAL = "DateTimeOriginal";
    public static final String TAG_DEFAULT_CROP_SIZE = "DefaultCropSize";
    public static final String TAG_DEVICE_SETTING_DESCRIPTION = "DeviceSettingDescription";
    public static final String TAG_DIGITAL_ZOOM_RATIO = "DigitalZoomRatio";
    public static final String TAG_DNG_VERSION = "DNGVersion";
    private static final String TAG_EXIF_IFD_POINTER = "ExifIFDPointer";
    public static final String TAG_EXIF_VERSION = "ExifVersion";
    public static final String TAG_EXPOSURE_BIAS_VALUE = "ExposureBiasValue";
    public static final String TAG_EXPOSURE_INDEX = "ExposureIndex";
    public static final String TAG_EXPOSURE_MODE = "ExposureMode";
    public static final String TAG_EXPOSURE_PROGRAM = "ExposureProgram";
    public static final String TAG_EXPOSURE_TIME = "ExposureTime";
    public static final String TAG_FILE_SOURCE = "FileSource";
    public static final String TAG_FLASH = "Flash";
    public static final String TAG_FLASHPIX_VERSION = "FlashpixVersion";
    public static final String TAG_FLASH_ENERGY = "FlashEnergy";
    public static final String TAG_FOCAL_LENGTH = "FocalLength";
    public static final String TAG_FOCAL_LENGTH_IN_35MM_FILM = "FocalLengthIn35mmFilm";
    public static final String TAG_FOCAL_PLANE_RESOLUTION_UNIT = "FocalPlaneResolutionUnit";
    public static final String TAG_FOCAL_PLANE_X_RESOLUTION = "FocalPlaneXResolution";
    public static final String TAG_FOCAL_PLANE_Y_RESOLUTION = "FocalPlaneYResolution";
    public static final String TAG_F_NUMBER = "FNumber";
    public static final String TAG_GAIN_CONTROL = "GainControl";
    public static final String TAG_GAMMA = "Gamma";
    public static final String TAG_GPS_ALTITUDE = "GPSAltitude";
    public static final String TAG_GPS_ALTITUDE_REF = "GPSAltitudeRef";
    public static final String TAG_GPS_AREA_INFORMATION = "GPSAreaInformation";
    public static final String TAG_GPS_DATESTAMP = "GPSDateStamp";
    public static final String TAG_GPS_DEST_BEARING = "GPSDestBearing";
    public static final String TAG_GPS_DEST_BEARING_REF = "GPSDestBearingRef";
    public static final String TAG_GPS_DEST_DISTANCE = "GPSDestDistance";
    public static final String TAG_GPS_DEST_DISTANCE_REF = "GPSDestDistanceRef";
    public static final String TAG_GPS_DEST_LATITUDE = "GPSDestLatitude";
    public static final String TAG_GPS_DEST_LATITUDE_REF = "GPSDestLatitudeRef";
    public static final String TAG_GPS_DEST_LONGITUDE = "GPSDestLongitude";
    public static final String TAG_GPS_DEST_LONGITUDE_REF = "GPSDestLongitudeRef";
    public static final String TAG_GPS_DIFFERENTIAL = "GPSDifferential";
    public static final String TAG_GPS_DOP = "GPSDOP";
    public static final String TAG_GPS_H_POSITIONING_ERROR = "GPSHPositioningError";
    public static final String TAG_GPS_IMG_DIRECTION = "GPSImgDirection";
    public static final String TAG_GPS_IMG_DIRECTION_REF = "GPSImgDirectionRef";
    private static final String TAG_GPS_INFO_IFD_POINTER = "GPSInfoIFDPointer";
    public static final String TAG_GPS_LATITUDE = "GPSLatitude";
    public static final String TAG_GPS_LATITUDE_REF = "GPSLatitudeRef";
    public static final String TAG_GPS_LONGITUDE = "GPSLongitude";
    public static final String TAG_GPS_LONGITUDE_REF = "GPSLongitudeRef";
    public static final String TAG_GPS_MAP_DATUM = "GPSMapDatum";
    public static final String TAG_GPS_MEASURE_MODE = "GPSMeasureMode";
    public static final String TAG_GPS_PROCESSING_METHOD = "GPSProcessingMethod";
    public static final String TAG_GPS_SATELLITES = "GPSSatellites";
    public static final String TAG_GPS_SPEED = "GPSSpeed";
    public static final String TAG_GPS_SPEED_REF = "GPSSpeedRef";
    public static final String TAG_GPS_STATUS = "GPSStatus";
    public static final String TAG_GPS_TIMESTAMP = "GPSTimeStamp";
    public static final String TAG_GPS_TRACK = "GPSTrack";
    public static final String TAG_GPS_TRACK_REF = "GPSTrackRef";
    public static final String TAG_GPS_VERSION_ID = "GPSVersionID";
    public static final String TAG_IMAGE_DESCRIPTION = "ImageDescription";
    public static final String TAG_IMAGE_LENGTH = "ImageLength";
    public static final String TAG_IMAGE_UNIQUE_ID = "ImageUniqueID";
    public static final String TAG_IMAGE_WIDTH = "ImageWidth";
    private static final String TAG_INTEROPERABILITY_IFD_POINTER = "InteroperabilityIFDPointer";
    public static final String TAG_INTEROPERABILITY_INDEX = "InteroperabilityIndex";
    public static final String TAG_ISO_SPEED = "ISOSpeed";
    public static final String TAG_ISO_SPEED_LATITUDE_YYY = "ISOSpeedLatitudeyyy";
    public static final String TAG_ISO_SPEED_LATITUDE_ZZZ = "ISOSpeedLatitudezzz";

    @Deprecated
    public static final String TAG_ISO_SPEED_RATINGS = "ISOSpeedRatings";
    public static final String TAG_JPEG_INTERCHANGE_FORMAT = "JPEGInterchangeFormat";
    public static final String TAG_JPEG_INTERCHANGE_FORMAT_LENGTH = "JPEGInterchangeFormatLength";
    public static final String TAG_LENS_MAKE = "LensMake";
    public static final String TAG_LENS_MODEL = "LensModel";
    public static final String TAG_LENS_SERIAL_NUMBER = "LensSerialNumber";
    public static final String TAG_LENS_SPECIFICATION = "LensSpecification";
    public static final String TAG_LIGHT_SOURCE = "LightSource";
    public static final String TAG_MAKE = "Make";
    public static final String TAG_MAKER_NOTE = "MakerNote";
    public static final String TAG_MAX_APERTURE_VALUE = "MaxApertureValue";
    public static final String TAG_METERING_MODE = "MeteringMode";
    public static final String TAG_MODEL = "Model";
    public static final String TAG_NEW_SUBFILE_TYPE = "NewSubfileType";
    public static final String TAG_OECF = "OECF";
    public static final String TAG_OFFSET_TIME = "OffsetTime";
    public static final String TAG_OFFSET_TIME_DIGITIZED = "OffsetTimeDigitized";
    public static final String TAG_OFFSET_TIME_ORIGINAL = "OffsetTimeOriginal";
    public static final String TAG_ORF_ASPECT_FRAME = "AspectFrame";
    private static final String TAG_ORF_CAMERA_SETTINGS_IFD_POINTER = "CameraSettingsIFDPointer";
    private static final String TAG_ORF_IMAGE_PROCESSING_IFD_POINTER = "ImageProcessingIFDPointer";
    public static final String TAG_ORF_PREVIEW_IMAGE_LENGTH = "PreviewImageLength";
    public static final String TAG_ORF_PREVIEW_IMAGE_START = "PreviewImageStart";
    public static final String TAG_ORF_THUMBNAIL_IMAGE = "ThumbnailImage";
    public static final String TAG_ORIENTATION = "Orientation";
    public static final String TAG_PHOTOGRAPHIC_SENSITIVITY = "PhotographicSensitivity";
    public static final String TAG_PHOTOMETRIC_INTERPRETATION = "PhotometricInterpretation";
    public static final String TAG_PIXEL_X_DIMENSION = "PixelXDimension";
    public static final String TAG_PIXEL_Y_DIMENSION = "PixelYDimension";
    public static final String TAG_PLANAR_CONFIGURATION = "PlanarConfiguration";
    public static final String TAG_PRIMARY_CHROMATICITIES = "PrimaryChromaticities";
    private static final C19317e TAG_RAF_IMAGE_SIZE;
    public static final String TAG_RECOMMENDED_EXPOSURE_INDEX = "RecommendedExposureIndex";
    public static final String TAG_REFERENCE_BLACK_WHITE = "ReferenceBlackWhite";
    public static final String TAG_RELATED_SOUND_FILE = "RelatedSoundFile";
    public static final String TAG_RESOLUTION_UNIT = "ResolutionUnit";
    public static final String TAG_ROWS_PER_STRIP = "RowsPerStrip";
    public static final String TAG_RW2_ISO = "ISO";
    public static final String TAG_RW2_JPG_FROM_RAW = "JpgFromRaw";
    public static final String TAG_RW2_SENSOR_BOTTOM_BORDER = "SensorBottomBorder";
    public static final String TAG_RW2_SENSOR_LEFT_BORDER = "SensorLeftBorder";
    public static final String TAG_RW2_SENSOR_RIGHT_BORDER = "SensorRightBorder";
    public static final String TAG_RW2_SENSOR_TOP_BORDER = "SensorTopBorder";
    public static final String TAG_SAMPLES_PER_PIXEL = "SamplesPerPixel";
    public static final String TAG_SATURATION = "Saturation";
    public static final String TAG_SCENE_CAPTURE_TYPE = "SceneCaptureType";
    public static final String TAG_SCENE_TYPE = "SceneType";
    public static final String TAG_SENSING_METHOD = "SensingMethod";
    public static final String TAG_SENSITIVITY_TYPE = "SensitivityType";
    public static final String TAG_SHARPNESS = "Sharpness";
    public static final String TAG_SHUTTER_SPEED_VALUE = "ShutterSpeedValue";
    public static final String TAG_SOFTWARE = "Software";
    public static final String TAG_SPATIAL_FREQUENCY_RESPONSE = "SpatialFrequencyResponse";
    public static final String TAG_SPECTRAL_SENSITIVITY = "SpectralSensitivity";
    public static final String TAG_STANDARD_OUTPUT_SENSITIVITY = "StandardOutputSensitivity";
    public static final String TAG_STRIP_BYTE_COUNTS = "StripByteCounts";
    public static final String TAG_STRIP_OFFSETS = "StripOffsets";
    public static final String TAG_SUBFILE_TYPE = "SubfileType";
    public static final String TAG_SUBJECT_AREA = "SubjectArea";
    public static final String TAG_SUBJECT_DISTANCE = "SubjectDistance";
    public static final String TAG_SUBJECT_DISTANCE_RANGE = "SubjectDistanceRange";
    public static final String TAG_SUBJECT_LOCATION = "SubjectLocation";
    public static final String TAG_SUBSEC_TIME = "SubSecTime";
    public static final String TAG_SUBSEC_TIME_DIGITIZED = "SubSecTimeDigitized";
    public static final String TAG_SUBSEC_TIME_ORIGINAL = "SubSecTimeOriginal";
    private static final String TAG_SUB_IFD_POINTER = "SubIFDPointer";
    public static final String TAG_THUMBNAIL_IMAGE_LENGTH = "ThumbnailImageLength";
    public static final String TAG_THUMBNAIL_IMAGE_WIDTH = "ThumbnailImageWidth";

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static final String TAG_THUMBNAIL_ORIENTATION = "ThumbnailOrientation";
    public static final String TAG_TRANSFER_FUNCTION = "TransferFunction";
    public static final String TAG_USER_COMMENT = "UserComment";
    public static final String TAG_WHITE_BALANCE = "WhiteBalance";
    public static final String TAG_WHITE_POINT = "WhitePoint";
    public static final String TAG_XMP = "Xmp";
    public static final String TAG_X_RESOLUTION = "XResolution";
    public static final String TAG_Y_CB_CR_COEFFICIENTS = "YCbCrCoefficients";
    public static final String TAG_Y_CB_CR_POSITIONING = "YCbCrPositioning";
    public static final String TAG_Y_CB_CR_SUB_SAMPLING = "YCbCrSubSampling";
    public static final String TAG_Y_RESOLUTION = "YResolution";
    private static final int WEBP_CHUNK_SIZE_BYTE_LENGTH = 4;
    private static final int WEBP_CHUNK_TYPE_BYTE_LENGTH = 4;
    private static final int WEBP_CHUNK_TYPE_VP8X_DEFAULT_LENGTH = 10;
    private static final int WEBP_FILE_SIZE_BYTE_LENGTH = 4;
    private static final byte WEBP_VP8L_SIGNATURE = 47;

    @Deprecated
    public static final int WHITEBALANCE_AUTO = 0;

    @Deprecated
    public static final int WHITEBALANCE_MANUAL = 1;
    public static final short WHITE_BALANCE_AUTO = 0;
    public static final short WHITE_BALANCE_MANUAL = 1;
    public static final short Y_CB_CR_POSITIONING_CENTERED = 1;
    public static final short Y_CB_CR_POSITIONING_CO_SITED = 2;
    private static final HashMap<Integer, Integer> sExifPointerTagMap;
    private static final HashMap<Integer, C19317e>[] sExifTagMapsForReading;
    private static final HashMap<String, C19317e>[] sExifTagMapsForWriting;
    private static SimpleDateFormat sFormatterPrimary;
    private static SimpleDateFormat sFormatterSecondary;
    private static final HashSet<String> sTagSetForCompatibility;
    private boolean mAreThumbnailStripsConsecutive;
    private AssetManager.AssetInputStream mAssetInputStream;
    private final HashMap<String, C19316d>[] mAttributes;
    private Set<Integer> mAttributesOffsets;
    private ByteOrder mExifByteOrder;
    private String mFilename;
    private boolean mHasThumbnail;
    private boolean mHasThumbnailStrips;
    private boolean mIsExifDataOnly;
    private int mMimeType;
    private boolean mModified;
    private int mOffsetToExifData;
    private int mOrfMakerNoteOffset;
    private int mOrfThumbnailLength;
    private int mOrfThumbnailOffset;
    private FileDescriptor mSeekableFileDescriptor;
    private byte[] mThumbnailBytes;
    private int mThumbnailCompression;
    private int mThumbnailLength;
    private int mThumbnailOffset;
    private boolean mXmpIsFromSeparateMarker;
    private static final String TAG = "ExifInterface";
    private static final boolean DEBUG = Log.isLoggable(TAG, 3);
    private static final List<Integer> ROTATION_ORDER = Arrays.asList(1, 6, 3, 8);
    private static final List<Integer> FLIPPED_ROTATION_ORDER = Arrays.asList(2, 7, 4, 5);
    public static final int[] BITS_PER_SAMPLE_RGB = {8, 8, 8};
    public static final int[] BITS_PER_SAMPLE_GREYSCALE_1 = {4};
    public static final int[] BITS_PER_SAMPLE_GREYSCALE_2 = {8};
    static final byte MARKER = -1;
    private static final byte MARKER_SOI = -40;
    static final byte[] JPEG_SIGNATURE = {MARKER, MARKER_SOI, MARKER};
    private static final byte[] HEIF_TYPE_FTYP = {102, 116, 121, 112};
    private static final byte[] HEIF_BRAND_MIF1 = {109, 105, 102, 49};
    private static final byte[] HEIF_BRAND_HEIC = {104, 101, 105, 99};
    private static final byte[] ORF_MAKER_NOTE_HEADER_1 = {79, 76, 89, 77, 80, 0};
    private static final byte[] ORF_MAKER_NOTE_HEADER_2 = {79, 76, 89, 77, 80, 85, 83, 0, 73, 73};
    private static final byte[] PNG_SIGNATURE = {-119, 80, 78, 71, HttpTokens.CARRIAGE_RETURN, 10, 26, 10};
    private static final byte[] PNG_CHUNK_TYPE_EXIF = {101, 88, 73, 102};
    private static final byte[] PNG_CHUNK_TYPE_IHDR = {73, 72, 68, 82};
    private static final byte[] PNG_CHUNK_TYPE_IEND = {73, 69, 78, 68};
    private static final byte[] WEBP_SIGNATURE_1 = {82, 73, 70, 70};
    private static final byte[] WEBP_SIGNATURE_2 = {87, 69, 66, 80};
    private static final byte[] WEBP_CHUNK_TYPE_EXIF = {69, 88, 73, 70};
    static final byte START_CODE = 42;
    private static final byte[] WEBP_VP8_SIGNATURE = {-99, 1, START_CODE};
    private static final byte[] WEBP_CHUNK_TYPE_VP8X = "VP8X".getBytes(Charset.defaultCharset());
    private static final byte[] WEBP_CHUNK_TYPE_VP8L = "VP8L".getBytes(Charset.defaultCharset());
    private static final byte[] WEBP_CHUNK_TYPE_VP8 = "VP8 ".getBytes(Charset.defaultCharset());
    private static final byte[] WEBP_CHUNK_TYPE_ANIM = "ANIM".getBytes(Charset.defaultCharset());
    private static final byte[] WEBP_CHUNK_TYPE_ANMF = "ANMF".getBytes(Charset.defaultCharset());
    static final String[] IFD_FORMAT_NAMES = {"", "BYTE", "STRING", "USHORT", "ULONG", "URATIONAL", "SBYTE", "UNDEFINED", "SSHORT", "SLONG", "SRATIONAL", "SINGLE", "DOUBLE", "IFD"};
    static final int[] IFD_FORMAT_BYTES_PER_FORMAT = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8, 1};
    static final byte[] EXIF_ASCII_PREFIX = {65, 83, 67, 73, 73, 0, 0, 0};

    static {
        C19317e[] c19317eArr = {new C19317e(TAG_NEW_SUBFILE_TYPE, 254, 4), new C19317e(TAG_SUBFILE_TYPE, 255, 4), new C19317e(TAG_IMAGE_WIDTH, 256, 3, 4), new C19317e(TAG_IMAGE_LENGTH, 257, 3, 4), new C19317e(TAG_BITS_PER_SAMPLE, 258, 3), new C19317e(TAG_COMPRESSION, 259, 3), new C19317e(TAG_PHOTOMETRIC_INTERPRETATION, 262, 3), new C19317e(TAG_IMAGE_DESCRIPTION, 270, 2), new C19317e(TAG_MAKE, 271, 2), new C19317e(TAG_MODEL, 272, 2), new C19317e(TAG_STRIP_OFFSETS, 273, 3, 4), new C19317e(TAG_ORIENTATION, 274, 3), new C19317e(TAG_SAMPLES_PER_PIXEL, 277, 3), new C19317e(TAG_ROWS_PER_STRIP, 278, 3, 4), new C19317e(TAG_STRIP_BYTE_COUNTS, 279, 3, 4), new C19317e(TAG_X_RESOLUTION, 282, 5), new C19317e(TAG_Y_RESOLUTION, 283, 5), new C19317e(TAG_PLANAR_CONFIGURATION, 284, 3), new C19317e(TAG_RESOLUTION_UNIT, 296, 3), new C19317e(TAG_TRANSFER_FUNCTION, 301, 3), new C19317e(TAG_SOFTWARE, HttpStatus.USE_PROXY_305, 2), new C19317e(TAG_DATETIME, 306, 2), new C19317e(TAG_ARTIST, 315, 2), new C19317e(TAG_WHITE_POINT, 318, 5), new C19317e(TAG_PRIMARY_CHROMATICITIES, 319, 5), new C19317e(TAG_SUB_IFD_POINTER, 330, 4), new C19317e(TAG_JPEG_INTERCHANGE_FORMAT, 513, 4), new C19317e(TAG_JPEG_INTERCHANGE_FORMAT_LENGTH, 514, 4), new C19317e(TAG_Y_CB_CR_COEFFICIENTS, 529, 5), new C19317e(TAG_Y_CB_CR_SUB_SAMPLING, 530, 3), new C19317e(TAG_Y_CB_CR_POSITIONING, 531, 3), new C19317e(TAG_REFERENCE_BLACK_WHITE, 532, 5), new C19317e(TAG_COPYRIGHT, 33432, 2), new C19317e(TAG_EXIF_IFD_POINTER, 34665, 4), new C19317e(TAG_GPS_INFO_IFD_POINTER, 34853, 4), new C19317e(TAG_RW2_SENSOR_TOP_BORDER, 4, 4), new C19317e(TAG_RW2_SENSOR_LEFT_BORDER, 5, 4), new C19317e(TAG_RW2_SENSOR_BOTTOM_BORDER, 6, 4), new C19317e(TAG_RW2_SENSOR_RIGHT_BORDER, 7, 4), new C19317e(TAG_RW2_ISO, 23, 3), new C19317e(TAG_RW2_JPG_FROM_RAW, 46, 7), new C19317e(TAG_XMP, 700, 1)};
        IFD_TIFF_TAGS = c19317eArr;
        C19317e[] c19317eArr2 = {new C19317e(TAG_EXPOSURE_TIME, 33434, 5), new C19317e(TAG_F_NUMBER, 33437, 5), new C19317e(TAG_EXPOSURE_PROGRAM, 34850, 3), new C19317e(TAG_SPECTRAL_SENSITIVITY, 34852, 2), new C19317e(TAG_PHOTOGRAPHIC_SENSITIVITY, 34855, 3), new C19317e(TAG_OECF, 34856, 7), new C19317e(TAG_SENSITIVITY_TYPE, 34864, 3), new C19317e(TAG_STANDARD_OUTPUT_SENSITIVITY, 34865, 4), new C19317e(TAG_RECOMMENDED_EXPOSURE_INDEX, 34866, 4), new C19317e(TAG_ISO_SPEED, 34867, 4), new C19317e(TAG_ISO_SPEED_LATITUDE_YYY, 34868, 4), new C19317e(TAG_ISO_SPEED_LATITUDE_ZZZ, 34869, 4), new C19317e(TAG_EXIF_VERSION, 36864, 2), new C19317e(TAG_DATETIME_ORIGINAL, 36867, 2), new C19317e(TAG_DATETIME_DIGITIZED, 36868, 2), new C19317e(TAG_OFFSET_TIME, 36880, 2), new C19317e(TAG_OFFSET_TIME_ORIGINAL, 36881, 2), new C19317e(TAG_OFFSET_TIME_DIGITIZED, 36882, 2), new C19317e(TAG_COMPONENTS_CONFIGURATION, 37121, 7), new C19317e(TAG_COMPRESSED_BITS_PER_PIXEL, 37122, 5), new C19317e(TAG_SHUTTER_SPEED_VALUE, 37377, 10), new C19317e(TAG_APERTURE_VALUE, 37378, 5), new C19317e(TAG_BRIGHTNESS_VALUE, 37379, 10), new C19317e(TAG_EXPOSURE_BIAS_VALUE, 37380, 10), new C19317e(TAG_MAX_APERTURE_VALUE, 37381, 5), new C19317e(TAG_SUBJECT_DISTANCE, 37382, 5), new C19317e(TAG_METERING_MODE, 37383, 3), new C19317e(TAG_LIGHT_SOURCE, 37384, 3), new C19317e(TAG_FLASH, 37385, 3), new C19317e(TAG_FOCAL_LENGTH, 37386, 5), new C19317e(TAG_SUBJECT_AREA, 37396, 3), new C19317e(TAG_MAKER_NOTE, 37500, 7), new C19317e(TAG_USER_COMMENT, 37510, 7), new C19317e(TAG_SUBSEC_TIME, 37520, 2), new C19317e(TAG_SUBSEC_TIME_ORIGINAL, 37521, 2), new C19317e(TAG_SUBSEC_TIME_DIGITIZED, 37522, 2), new C19317e(TAG_FLASHPIX_VERSION, UnixStat.LINK_FLAG, 7), new C19317e(TAG_COLOR_SPACE, 40961, 3), new C19317e(TAG_PIXEL_X_DIMENSION, 40962, 3, 4), new C19317e(TAG_PIXEL_Y_DIMENSION, 40963, 3, 4), new C19317e(TAG_RELATED_SOUND_FILE, 40964, 2), new C19317e(TAG_INTEROPERABILITY_IFD_POINTER, 40965, 4), new C19317e(TAG_FLASH_ENERGY, 41483, 5), new C19317e(TAG_SPATIAL_FREQUENCY_RESPONSE, 41484, 7), new C19317e(TAG_FOCAL_PLANE_X_RESOLUTION, 41486, 5), new C19317e(TAG_FOCAL_PLANE_Y_RESOLUTION, 41487, 5), new C19317e(TAG_FOCAL_PLANE_RESOLUTION_UNIT, 41488, 3), new C19317e(TAG_SUBJECT_LOCATION, 41492, 3), new C19317e(TAG_EXPOSURE_INDEX, 41493, 5), new C19317e(TAG_SENSING_METHOD, 41495, 3), new C19317e(TAG_FILE_SOURCE, 41728, 7), new C19317e(TAG_SCENE_TYPE, 41729, 7), new C19317e(TAG_CFA_PATTERN, 41730, 7), new C19317e(TAG_CUSTOM_RENDERED, 41985, 3), new C19317e(TAG_EXPOSURE_MODE, 41986, 3), new C19317e(TAG_WHITE_BALANCE, 41987, 3), new C19317e(TAG_DIGITAL_ZOOM_RATIO, 41988, 5), new C19317e(TAG_FOCAL_LENGTH_IN_35MM_FILM, 41989, 3), new C19317e(TAG_SCENE_CAPTURE_TYPE, 41990, 3), new C19317e(TAG_GAIN_CONTROL, 41991, 3), new C19317e(TAG_CONTRAST, 41992, 3), new C19317e(TAG_SATURATION, 41993, 3), new C19317e(TAG_SHARPNESS, 41994, 3), new C19317e(TAG_DEVICE_SETTING_DESCRIPTION, 41995, 7), new C19317e(TAG_SUBJECT_DISTANCE_RANGE, 41996, 3), new C19317e(TAG_IMAGE_UNIQUE_ID, 42016, 2), new C19317e("CameraOwnerName", 42032, 2), new C19317e(TAG_BODY_SERIAL_NUMBER, 42033, 2), new C19317e(TAG_LENS_SPECIFICATION, 42034, 5), new C19317e(TAG_LENS_MAKE, 42035, 2), new C19317e(TAG_LENS_MODEL, 42036, 2), new C19317e(TAG_GAMMA, 42240, 5), new C19317e(TAG_DNG_VERSION, 50706, 1), new C19317e(TAG_DEFAULT_CROP_SIZE, 50720, 3, 4)};
        IFD_EXIF_TAGS = c19317eArr2;
        C19317e[] c19317eArr3 = {new C19317e(TAG_GPS_VERSION_ID, 0, 1), new C19317e(TAG_GPS_LATITUDE_REF, 1, 2), new C19317e(TAG_GPS_LATITUDE, 2, 5, 10), new C19317e(TAG_GPS_LONGITUDE_REF, 3, 2), new C19317e(TAG_GPS_LONGITUDE, 4, 5, 10), new C19317e(TAG_GPS_ALTITUDE_REF, 5, 1), new C19317e(TAG_GPS_ALTITUDE, 6, 5), new C19317e(TAG_GPS_TIMESTAMP, 7, 5), new C19317e(TAG_GPS_SATELLITES, 8, 2), new C19317e(TAG_GPS_STATUS, 9, 2), new C19317e(TAG_GPS_MEASURE_MODE, 10, 2), new C19317e(TAG_GPS_DOP, 11, 5), new C19317e(TAG_GPS_SPEED_REF, 12, 2), new C19317e(TAG_GPS_SPEED, 13, 5), new C19317e(TAG_GPS_TRACK_REF, 14, 2), new C19317e(TAG_GPS_TRACK, 15, 5), new C19317e(TAG_GPS_IMG_DIRECTION_REF, 16, 2), new C19317e(TAG_GPS_IMG_DIRECTION, 17, 5), new C19317e(TAG_GPS_MAP_DATUM, 18, 2), new C19317e(TAG_GPS_DEST_LATITUDE_REF, 19, 2), new C19317e(TAG_GPS_DEST_LATITUDE, 20, 5), new C19317e(TAG_GPS_DEST_LONGITUDE_REF, 21, 2), new C19317e(TAG_GPS_DEST_LONGITUDE, 22, 5), new C19317e(TAG_GPS_DEST_BEARING_REF, 23, 2), new C19317e(TAG_GPS_DEST_BEARING, 24, 5), new C19317e(TAG_GPS_DEST_DISTANCE_REF, 25, 2), new C19317e(TAG_GPS_DEST_DISTANCE, 26, 5), new C19317e(TAG_GPS_PROCESSING_METHOD, 27, 7), new C19317e(TAG_GPS_AREA_INFORMATION, 28, 7), new C19317e(TAG_GPS_DATESTAMP, 29, 2), new C19317e(TAG_GPS_DIFFERENTIAL, 30, 3), new C19317e(TAG_GPS_H_POSITIONING_ERROR, 31, 5)};
        IFD_GPS_TAGS = c19317eArr3;
        C19317e[] c19317eArr4 = {new C19317e(TAG_INTEROPERABILITY_INDEX, 1, 2)};
        IFD_INTEROPERABILITY_TAGS = c19317eArr4;
        C19317e[] c19317eArr5 = {new C19317e(TAG_NEW_SUBFILE_TYPE, 254, 4), new C19317e(TAG_SUBFILE_TYPE, 255, 4), new C19317e(TAG_THUMBNAIL_IMAGE_WIDTH, 256, 3, 4), new C19317e(TAG_THUMBNAIL_IMAGE_LENGTH, 257, 3, 4), new C19317e(TAG_BITS_PER_SAMPLE, 258, 3), new C19317e(TAG_COMPRESSION, 259, 3), new C19317e(TAG_PHOTOMETRIC_INTERPRETATION, 262, 3), new C19317e(TAG_IMAGE_DESCRIPTION, 270, 2), new C19317e(TAG_MAKE, 271, 2), new C19317e(TAG_MODEL, 272, 2), new C19317e(TAG_STRIP_OFFSETS, 273, 3, 4), new C19317e(TAG_THUMBNAIL_ORIENTATION, 274, 3), new C19317e(TAG_SAMPLES_PER_PIXEL, 277, 3), new C19317e(TAG_ROWS_PER_STRIP, 278, 3, 4), new C19317e(TAG_STRIP_BYTE_COUNTS, 279, 3, 4), new C19317e(TAG_X_RESOLUTION, 282, 5), new C19317e(TAG_Y_RESOLUTION, 283, 5), new C19317e(TAG_PLANAR_CONFIGURATION, 284, 3), new C19317e(TAG_RESOLUTION_UNIT, 296, 3), new C19317e(TAG_TRANSFER_FUNCTION, 301, 3), new C19317e(TAG_SOFTWARE, HttpStatus.USE_PROXY_305, 2), new C19317e(TAG_DATETIME, 306, 2), new C19317e(TAG_ARTIST, 315, 2), new C19317e(TAG_WHITE_POINT, 318, 5), new C19317e(TAG_PRIMARY_CHROMATICITIES, 319, 5), new C19317e(TAG_SUB_IFD_POINTER, 330, 4), new C19317e(TAG_JPEG_INTERCHANGE_FORMAT, 513, 4), new C19317e(TAG_JPEG_INTERCHANGE_FORMAT_LENGTH, 514, 4), new C19317e(TAG_Y_CB_CR_COEFFICIENTS, 529, 5), new C19317e(TAG_Y_CB_CR_SUB_SAMPLING, 530, 3), new C19317e(TAG_Y_CB_CR_POSITIONING, 531, 3), new C19317e(TAG_REFERENCE_BLACK_WHITE, 532, 5), new C19317e(TAG_XMP, 700, 1), new C19317e(TAG_COPYRIGHT, 33432, 2), new C19317e(TAG_EXIF_IFD_POINTER, 34665, 4), new C19317e(TAG_GPS_INFO_IFD_POINTER, 34853, 4), new C19317e(TAG_DNG_VERSION, 50706, 1), new C19317e(TAG_DEFAULT_CROP_SIZE, 50720, 3, 4)};
        IFD_THUMBNAIL_TAGS = c19317eArr5;
        TAG_RAF_IMAGE_SIZE = new C19317e(TAG_STRIP_OFFSETS, 273, 3);
        C19317e[] c19317eArr6 = {new C19317e(TAG_ORF_THUMBNAIL_IMAGE, 256, 7), new C19317e(TAG_ORF_CAMERA_SETTINGS_IFD_POINTER, 8224, 4), new C19317e(TAG_ORF_IMAGE_PROCESSING_IFD_POINTER, 8256, 4)};
        ORF_MAKER_NOTE_TAGS = c19317eArr6;
        C19317e[] c19317eArr7 = {new C19317e(TAG_ORF_PREVIEW_IMAGE_START, 257, 4), new C19317e(TAG_ORF_PREVIEW_IMAGE_LENGTH, 258, 4)};
        ORF_CAMERA_SETTINGS_TAGS = c19317eArr7;
        C19317e[] c19317eArr8 = {new C19317e(TAG_ORF_ASPECT_FRAME, 4371, 3)};
        ORF_IMAGE_PROCESSING_TAGS = c19317eArr8;
        C19317e[] c19317eArr9 = {new C19317e(TAG_COLOR_SPACE, 55, 3)};
        PEF_TAGS = c19317eArr9;
        C19317e[][] c19317eArr10 = {c19317eArr, c19317eArr2, c19317eArr3, c19317eArr4, c19317eArr5, c19317eArr, c19317eArr6, c19317eArr7, c19317eArr8, c19317eArr9};
        EXIF_TAGS = c19317eArr10;
        EXIF_POINTER_TAGS = new C19317e[]{new C19317e(TAG_SUB_IFD_POINTER, 330, 4), new C19317e(TAG_EXIF_IFD_POINTER, 34665, 4), new C19317e(TAG_GPS_INFO_IFD_POINTER, 34853, 4), new C19317e(TAG_INTEROPERABILITY_IFD_POINTER, 40965, 4), new C19317e(TAG_ORF_CAMERA_SETTINGS_IFD_POINTER, 8224, 1), new C19317e(TAG_ORF_IMAGE_PROCESSING_IFD_POINTER, 8256, 1)};
        sExifTagMapsForReading = new HashMap[c19317eArr10.length];
        sExifTagMapsForWriting = new HashMap[c19317eArr10.length];
        sTagSetForCompatibility = new HashSet<>(Arrays.asList(TAG_F_NUMBER, TAG_DIGITAL_ZOOM_RATIO, TAG_EXPOSURE_TIME, TAG_SUBJECT_DISTANCE, TAG_GPS_TIMESTAMP));
        sExifPointerTagMap = new HashMap<>();
        Charset charsetForName = Charset.forName(CharEncoding.US_ASCII);
        ASCII = charsetForName;
        IDENTIFIER_EXIF_APP1 = "Exif\u0000\u0000".getBytes(charsetForName);
        IDENTIFIER_XMP_APP1 = "http://ns.adobe.com/xap/1.0/\u0000".getBytes(charsetForName);
        Locale locale = Locale.US;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy:MM:dd HH:mm:ss", locale);
        sFormatterPrimary = simpleDateFormat;
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", locale);
        sFormatterSecondary = simpleDateFormat2;
        simpleDateFormat2.setTimeZone(TimeZone.getTimeZone("UTC"));
        int i = 0;
        while (true) {
            C19317e[][] c19317eArr11 = EXIF_TAGS;
            if (i >= c19317eArr11.length) {
                HashMap<Integer, Integer> map = sExifPointerTagMap;
                C19317e[] c19317eArr12 = EXIF_POINTER_TAGS;
                map.put(Integer.valueOf(c19317eArr12[0].f150930a), 5);
                map.put(Integer.valueOf(c19317eArr12[1].f150930a), 1);
                map.put(Integer.valueOf(c19317eArr12[2].f150930a), 2);
                map.put(Integer.valueOf(c19317eArr12[3].f150930a), 3);
                map.put(Integer.valueOf(c19317eArr12[4].f150930a), 7);
                map.put(Integer.valueOf(c19317eArr12[5].f150930a), 8);
                NON_ZERO_TIME_PATTERN = Pattern.compile(".*[1-9].*");
                GPS_TIMESTAMP_PATTERN = Pattern.compile("^(\\d{2}):(\\d{2}):(\\d{2})$");
                DATETIME_PRIMARY_FORMAT_PATTERN = Pattern.compile("^(\\d{4}):(\\d{2}):(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                DATETIME_SECONDARY_FORMAT_PATTERN = Pattern.compile("^(\\d{4})-(\\d{2})-(\\d{2})\\s(\\d{2}):(\\d{2}):(\\d{2})$");
                return;
            }
            sExifTagMapsForReading[i] = new HashMap<>();
            sExifTagMapsForWriting[i] = new HashMap<>();
            for (C19317e c19317e : c19317eArr11[i]) {
                sExifTagMapsForReading[i].put(Integer.valueOf(c19317e.f150930a), c19317e);
                sExifTagMapsForWriting[i].put(c19317e.f150931b, c19317e);
            }
            i++;
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x005b  */
    public p7f(@NonNull InputStream inputStream, int i) throws Throwable {
        C19317e[][] c19317eArr = EXIF_TAGS;
        this.mAttributes = new HashMap[c19317eArr.length];
        this.mAttributesOffsets = new HashSet(c19317eArr.length);
        this.mExifByteOrder = ByteOrder.BIG_ENDIAN;
        if (inputStream == null) {
            mnd0.m159157a("inputStream cannot be null");
            throw null;
        }
        this.mFilename = null;
        if (i == 1) {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream, IDENTIFIER_EXIF_APP1.length);
            if (!isExifDataOnly(bufferedInputStream)) {
                return;
            }
            this.mIsExifDataOnly = true;
            this.mAssetInputStream = null;
            this.mSeekableFileDescriptor = null;
            inputStream = bufferedInputStream;
        } else if (inputStream instanceof AssetManager.AssetInputStream) {
            this.mAssetInputStream = (AssetManager.AssetInputStream) inputStream;
            this.mSeekableFileDescriptor = null;
        } else if (inputStream instanceof FileInputStream) {
            FileInputStream fileInputStream = (FileInputStream) inputStream;
            if (isSeekableFD(fileInputStream.getFD())) {
                this.mAssetInputStream = null;
                this.mSeekableFileDescriptor = fileInputStream.getFD();
            } else {
                this.mAssetInputStream = null;
                this.mSeekableFileDescriptor = null;
            }
        } else {
            this.mAssetInputStream = null;
            this.mSeekableFileDescriptor = null;
        }
        loadAttributes(inputStream);
    }

    private void addDefaultValuesForCompatibility() {
        String attribute = getAttribute(TAG_DATETIME_ORIGINAL);
        if (attribute != null && getAttribute(TAG_DATETIME) == null) {
            this.mAttributes[0].put(TAG_DATETIME, C19316d.m171116e(attribute));
        }
        if (getAttribute(TAG_IMAGE_WIDTH) == null) {
            this.mAttributes[0].put(TAG_IMAGE_WIDTH, C19316d.m171117f(0L, this.mExifByteOrder));
        }
        if (getAttribute(TAG_IMAGE_LENGTH) == null) {
            this.mAttributes[0].put(TAG_IMAGE_LENGTH, C19316d.m171117f(0L, this.mExifByteOrder));
        }
        if (getAttribute(TAG_ORIENTATION) == null) {
            this.mAttributes[0].put(TAG_ORIENTATION, C19316d.m171117f(0L, this.mExifByteOrder));
        }
        if (getAttribute(TAG_LIGHT_SOURCE) == null) {
            this.mAttributes[1].put(TAG_LIGHT_SOURCE, C19316d.m171117f(0L, this.mExifByteOrder));
        }
    }

    private String convertDecimalDegree(double d) {
        long j = (long) d;
        double d2 = d - j;
        long j2 = (long) (d2 * 60.0d);
        return j + "/1," + j2 + "/1," + Math.round((d2 - (j2 / 60.0d)) * 3600.0d * 1.0E7d) + "/10000000";
    }

    private static double convertRationalLatLonToDouble(String str, String str2) {
        try {
            String[] strArrSplit = str.split(Constants.SEPARATOR_COMMA, -1);
            String[] strArrSplit2 = strArrSplit[0].split("/", -1);
            double d = Double.parseDouble(strArrSplit2[0].trim()) / Double.parseDouble(strArrSplit2[1].trim());
            String[] strArrSplit3 = strArrSplit[1].split("/", -1);
            double d2 = Double.parseDouble(strArrSplit3[0].trim()) / Double.parseDouble(strArrSplit3[1].trim());
            String[] strArrSplit4 = strArrSplit[2].split("/", -1);
            double d3 = d + (d2 / 60.0d) + ((Double.parseDouble(strArrSplit4[0].trim()) / Double.parseDouble(strArrSplit4[1].trim())) / 3600.0d);
            if (!str2.equals(LATITUDE_SOUTH) && !str2.equals("W")) {
                if (!str2.equals("N") && !str2.equals("E")) {
                    throw new IllegalArgumentException();
                }
                return d3;
            }
            return -d3;
        } catch (ArrayIndexOutOfBoundsException | NumberFormatException unused) {
            fig0.m125680a();
            return FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
        }
    }

    private void copyChunksUpToGivenChunkType(C19314b c19314b, C19315c c19315c, byte[] bArr, byte[] bArr2) throws IOException {
        while (true) {
            byte[] bArr3 = new byte[4];
            if (c19314b.read(bArr3) != 4) {
                StringBuilder sb = new StringBuilder("Encountered invalid length while copying WebP chunks up tochunk type ");
                Charset charset = ASCII;
                sb.append(new String(bArr, charset));
                sb.append(bArr2 == null ? "" : " or ".concat(new String(bArr2, charset)));
                throw new IOException(sb.toString());
            }
            copyWebPChunk(c19314b, c19315c, bArr3);
            if (Arrays.equals(bArr3, bArr)) {
                return;
            }
            if (bArr2 != null && Arrays.equals(bArr3, bArr2)) {
                return;
            }
        }
    }

    private void copyWebPChunk(C19314b c19314b, C19315c c19315c, byte[] bArr) throws IOException {
        int i = c19314b.readInt();
        c19315c.write(bArr);
        c19315c.m171108e(i);
        if (i % 2 == 1) {
            i++;
        }
        r7f.m180134f(c19314b, c19315c, i);
    }

    @Nullable
    private C19316d getExifAttribute(@NonNull String str) {
        if (str == null) {
            mnd0.m159157a("tag shouldn't be null");
            return null;
        }
        if (TAG_ISO_SPEED_RATINGS.equals(str)) {
            str = TAG_PHOTOGRAPHIC_SENSITIVITY;
        }
        for (int i = 0; i < EXIF_TAGS.length; i++) {
            C19316d c19316d = this.mAttributes[i].get(str);
            if (c19316d != null) {
                return c19316d;
            }
        }
        return null;
    }

    private void getHeifAttributes(C19319g c19319g) throws IOException {
        String strExtractMetadata;
        String strExtractMetadata2;
        String strExtractMetadata3;
        int i;
        if (Build.VERSION.SDK_INT < 28) {
            pr3.m173429a("Reading EXIF from HEIF files is supported from SDK 28 and above");
            return;
        }
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            try {
                r7f.C19786b.m180140a(mediaMetadataRetriever, new C19313a(c19319g));
                String strExtractMetadata4 = mediaMetadataRetriever.extractMetadata(33);
                String strExtractMetadata5 = mediaMetadataRetriever.extractMetadata(34);
                String strExtractMetadata6 = mediaMetadataRetriever.extractMetadata(26);
                String strExtractMetadata7 = mediaMetadataRetriever.extractMetadata(17);
                if ("yes".equals(strExtractMetadata6)) {
                    strExtractMetadata = mediaMetadataRetriever.extractMetadata(29);
                    strExtractMetadata2 = mediaMetadataRetriever.extractMetadata(30);
                    strExtractMetadata3 = mediaMetadataRetriever.extractMetadata(31);
                } else if ("yes".equals(strExtractMetadata7)) {
                    strExtractMetadata = mediaMetadataRetriever.extractMetadata(18);
                    strExtractMetadata2 = mediaMetadataRetriever.extractMetadata(19);
                    strExtractMetadata3 = mediaMetadataRetriever.extractMetadata(24);
                } else {
                    strExtractMetadata = null;
                    strExtractMetadata2 = null;
                    strExtractMetadata3 = null;
                }
                if (strExtractMetadata != null) {
                    this.mAttributes[0].put(TAG_IMAGE_WIDTH, C19316d.m171121j(Integer.parseInt(strExtractMetadata), this.mExifByteOrder));
                }
                if (strExtractMetadata2 != null) {
                    this.mAttributes[0].put(TAG_IMAGE_LENGTH, C19316d.m171121j(Integer.parseInt(strExtractMetadata2), this.mExifByteOrder));
                }
                if (strExtractMetadata3 != null) {
                    int i2 = Integer.parseInt(strExtractMetadata3);
                    if (i2 == 90) {
                        i = 6;
                    } else if (i2 != 180) {
                        i = i2 != 270 ? 1 : 8;
                    } else {
                        i = 3;
                    }
                    this.mAttributes[0].put(TAG_ORIENTATION, C19316d.m171121j(i, this.mExifByteOrder));
                }
                if (strExtractMetadata4 != null && strExtractMetadata5 != null) {
                    int i3 = Integer.parseInt(strExtractMetadata4);
                    int i4 = Integer.parseInt(strExtractMetadata5);
                    if (i4 <= 6) {
                        throw new IOException("Invalid exif length");
                    }
                    c19319g.m171130t(i3);
                    byte[] bArr = new byte[6];
                    if (c19319g.read(bArr) != 6) {
                        throw new IOException("Can't read identifier");
                    }
                    int i5 = i3 + 6;
                    int i6 = i4 - 6;
                    if (!Arrays.equals(bArr, IDENTIFIER_EXIF_APP1)) {
                        throw new IOException("Invalid identifier");
                    }
                    byte[] bArr2 = new byte[i6];
                    if (c19319g.read(bArr2) != i6) {
                        throw new IOException("Can't read exif");
                    }
                    this.mOffsetToExifData = i5;
                    readExifSegment(bArr2, 0);
                }
                mediaMetadataRetriever.release();
            } catch (RuntimeException unused) {
                throw new UnsupportedOperationException("Failed to read EXIF from HEIF file. Given stream is either malformed or unsupported.");
            }
        } catch (Throwable th) {
            mediaMetadataRetriever.release();
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:34:0x006d A[FALL_THROUGH] */
    /* JADX WARN: Code duplicated, block: B:36:0x0076  */
    /* JADX WARN: Code duplicated, block: B:37:0x0079  */
    /* JADX WARN: Code duplicated, block: B:40:0x008f  */
    /* JADX WARN: Code duplicated, block: B:41:0x0092  */
    /* JADX WARN: Code duplicated, block: B:63:0x012b A[LOOP:0: B:10:0x0024->B:63:0x012b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:81:0x0132 A[SYNTHETIC] */
    /*  JADX ERROR: UnsupportedOperationException in pass: RegionMakerVisitor
        java.lang.UnsupportedOperationException
        	at java.base/java.util.Collections$UnmodifiableCollection.add(Collections.java:1095)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker$1.leaveRegion(SwitchRegionMaker.java:419)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:91)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:31)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaksForCase(SwitchRegionMaker.java:399)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaks(SwitchRegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.leaveRegion(PostProcessRegions.java:31)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:91)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.process(PostProcessRegions.java:21)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:31)
        */
    private void getJpegAttributes(p153l.p7f.C19314b r21, int r22, int r23) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 396
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p153l.p7f.getJpegAttributes(l.p7f$b, int, int):void");
    }

    private int getMimeType(BufferedInputStream bufferedInputStream) throws IOException {
        bufferedInputStream.mark(5000);
        byte[] bArr = new byte[5000];
        bufferedInputStream.read(bArr);
        bufferedInputStream.reset();
        if (isJpegFormat(bArr)) {
            return 4;
        }
        if (isRafFormat(bArr)) {
            return 9;
        }
        if (isHeifFormat(bArr)) {
            return 12;
        }
        if (isOrfFormat(bArr)) {
            return 7;
        }
        if (isRw2Format(bArr)) {
            return 10;
        }
        if (isPngFormat(bArr)) {
            return 13;
        }
        return isWebpFormat(bArr) ? 14 : 0;
    }

    private void getOrfAttributes(C19319g c19319g) throws Throwable {
        int i;
        int i2;
        getRawAttributes(c19319g);
        C19316d c19316d = this.mAttributes[1].get(TAG_MAKER_NOTE);
        if (c19316d != null) {
            C19319g c19319g2 = new C19319g(c19316d.f150929d);
            c19319g2.m171104n(this.mExifByteOrder);
            byte[] bArr = ORF_MAKER_NOTE_HEADER_1;
            byte[] bArr2 = new byte[bArr.length];
            c19319g2.readFully(bArr2);
            c19319g2.m171130t(0L);
            byte[] bArr3 = ORF_MAKER_NOTE_HEADER_2;
            byte[] bArr4 = new byte[bArr3.length];
            c19319g2.readFully(bArr4);
            if (Arrays.equals(bArr2, bArr)) {
                c19319g2.m171130t(8L);
            } else if (Arrays.equals(bArr4, bArr3)) {
                c19319g2.m171130t(12L);
            }
            readImageFileDirectory(c19319g2, 6);
            C19316d c19316d2 = this.mAttributes[7].get(TAG_ORF_PREVIEW_IMAGE_START);
            C19316d c19316d3 = this.mAttributes[7].get(TAG_ORF_PREVIEW_IMAGE_LENGTH);
            if (c19316d2 != null && c19316d3 != null) {
                this.mAttributes[5].put(TAG_JPEG_INTERCHANGE_FORMAT, c19316d2);
                this.mAttributes[5].put(TAG_JPEG_INTERCHANGE_FORMAT_LENGTH, c19316d3);
            }
            C19316d c19316d4 = this.mAttributes[8].get(TAG_ORF_ASPECT_FRAME);
            if (c19316d4 != null) {
                int[] iArr = (int[]) c19316d4.m171126o(this.mExifByteOrder);
                if (iArr == null || iArr.length != 4) {
                    Arrays.toString(iArr);
                    return;
                }
                int i3 = iArr[2];
                int i4 = iArr[0];
                if (i3 <= i4 || (i = iArr[3]) <= (i2 = iArr[1])) {
                    return;
                }
                int i5 = (i3 - i4) + 1;
                int i6 = (i - i2) + 1;
                if (i5 < i6) {
                    int i7 = i5 + i6;
                    i6 = i7 - i6;
                    i5 = i7 - i6;
                }
                C19316d c19316dM171121j = C19316d.m171121j(i5, this.mExifByteOrder);
                C19316d c19316dM171121j2 = C19316d.m171121j(i6, this.mExifByteOrder);
                this.mAttributes[0].put(TAG_IMAGE_WIDTH, c19316dM171121j);
                this.mAttributes[0].put(TAG_IMAGE_LENGTH, c19316dM171121j2);
            }
        }
    }

    private void getPngAttributes(C19314b c19314b) throws Throwable {
        if (DEBUG) {
            Objects.toString(c19314b);
        }
        c19314b.m171104n(ByteOrder.BIG_ENDIAN);
        byte[] bArr = PNG_SIGNATURE;
        c19314b.m171105q(bArr.length);
        int length = bArr.length;
        while (true) {
            try {
                int i = c19314b.readInt();
                byte[] bArr2 = new byte[4];
                if (c19314b.read(bArr2) != 4) {
                    throw new IOException("Encountered invalid length while parsing PNG chunktype");
                }
                int i2 = length + 8;
                if (i2 == 16 && !Arrays.equals(bArr2, PNG_CHUNK_TYPE_IHDR)) {
                    throw new IOException("Encountered invalid PNG file--IHDR chunk should appearas the first chunk");
                }
                if (Arrays.equals(bArr2, PNG_CHUNK_TYPE_IEND)) {
                    return;
                }
                if (Arrays.equals(bArr2, PNG_CHUNK_TYPE_EXIF)) {
                    byte[] bArr3 = new byte[i];
                    if (c19314b.read(bArr3) != i) {
                        throw new IOException("Failed to read given length for given PNG chunk type: " + r7f.m180129a(bArr2));
                    }
                    int i3 = c19314b.readInt();
                    CRC32 crc32 = new CRC32();
                    crc32.update(bArr2);
                    crc32.update(bArr3);
                    if (((int) crc32.getValue()) == i3) {
                        this.mOffsetToExifData = i2;
                        readExifSegment(bArr3, 0);
                        validateImages();
                        setThumbnailData(new C19314b(bArr3));
                        return;
                    }
                    throw new IOException("Encountered invalid CRC value for PNG-EXIF chunk.\n recorded CRC value: " + i3 + ", calculated CRC value: " + crc32.getValue());
                }
                int i4 = i + 4;
                c19314b.m171105q(i4);
                length = i2 + i4;
            } catch (EOFException unused) {
                zpg0.m220844a("Encountered corrupt PNG file.");
                return;
            }
        }
    }

    private void getRafAttributes(C19314b c19314b) throws Throwable {
        if (DEBUG) {
            Objects.toString(c19314b);
        }
        c19314b.m171105q(84);
        byte[] bArr = new byte[4];
        byte[] bArr2 = new byte[4];
        byte[] bArr3 = new byte[4];
        c19314b.read(bArr);
        c19314b.read(bArr2);
        c19314b.read(bArr3);
        int i = ByteBuffer.wrap(bArr).getInt();
        int i2 = ByteBuffer.wrap(bArr2).getInt();
        int i3 = ByteBuffer.wrap(bArr3).getInt();
        byte[] bArr4 = new byte[i2];
        c19314b.m171105q(i - c19314b.m171102k());
        c19314b.read(bArr4);
        getJpegAttributes(new C19314b(bArr4), i, 5);
        c19314b.m171105q(i3 - c19314b.m171102k());
        c19314b.m171104n(ByteOrder.BIG_ENDIAN);
        int i4 = c19314b.readInt();
        for (int i5 = 0; i5 < i4; i5++) {
            int unsignedShort = c19314b.readUnsignedShort();
            int unsignedShort2 = c19314b.readUnsignedShort();
            if (unsignedShort == TAG_RAF_IMAGE_SIZE.f150930a) {
                short s = c19314b.readShort();
                short s2 = c19314b.readShort();
                C19316d c19316dM171121j = C19316d.m171121j(s, this.mExifByteOrder);
                C19316d c19316dM171121j2 = C19316d.m171121j(s2, this.mExifByteOrder);
                this.mAttributes[0].put(TAG_IMAGE_LENGTH, c19316dM171121j);
                this.mAttributes[0].put(TAG_IMAGE_WIDTH, c19316dM171121j2);
                return;
            }
            c19314b.m171105q(unsignedShort2);
        }
    }

    private void getRawAttributes(C19319g c19319g) throws Throwable {
        C19316d c19316d;
        parseTiffHeaders(c19319g);
        readImageFileDirectory(c19319g, 0);
        updateImageSizeValues(c19319g, 0);
        updateImageSizeValues(c19319g, 5);
        updateImageSizeValues(c19319g, 4);
        validateImages();
        if (this.mMimeType != 8 || (c19316d = this.mAttributes[1].get(TAG_MAKER_NOTE)) == null) {
            return;
        }
        C19319g c19319g2 = new C19319g(c19316d.f150929d);
        c19319g2.m171104n(this.mExifByteOrder);
        c19319g2.m171105q(6);
        readImageFileDirectory(c19319g2, 9);
        C19316d c19316d2 = this.mAttributes[9].get(TAG_COLOR_SPACE);
        if (c19316d2 != null) {
            this.mAttributes[1].put(TAG_COLOR_SPACE, c19316d2);
        }
    }

    private void getRw2Attributes(C19319g c19319g) throws Throwable {
        if (DEBUG) {
            Objects.toString(c19319g);
        }
        getRawAttributes(c19319g);
        C19316d c19316d = this.mAttributes[0].get(TAG_RW2_JPG_FROM_RAW);
        if (c19316d != null) {
            getJpegAttributes(new C19314b(c19316d.f150929d), (int) c19316d.f150928c, 5);
        }
        C19316d c19316d2 = this.mAttributes[0].get(TAG_RW2_ISO);
        C19316d c19316d3 = this.mAttributes[1].get(TAG_PHOTOGRAPHIC_SENSITIVITY);
        if (c19316d2 == null || c19316d3 != null) {
            return;
        }
        this.mAttributes[1].put(TAG_PHOTOGRAPHIC_SENSITIVITY, c19316d2);
    }

    private void getStandaloneAttributes(C19319g c19319g) throws IOException {
        byte[] bArr = IDENTIFIER_EXIF_APP1;
        c19319g.m171105q(bArr.length);
        byte[] bArr2 = new byte[c19319g.available()];
        c19319g.readFully(bArr2);
        this.mOffsetToExifData = bArr.length;
        readExifSegment(bArr2, 0);
    }

    private void getWebpAttributes(C19314b c19314b) throws Throwable {
        if (DEBUG) {
            Objects.toString(c19314b);
        }
        c19314b.m171104n(ByteOrder.LITTLE_ENDIAN);
        c19314b.m171105q(WEBP_SIGNATURE_1.length);
        int i = c19314b.readInt() + 8;
        byte[] bArr = WEBP_SIGNATURE_2;
        c19314b.m171105q(bArr.length);
        int length = bArr.length + 8;
        while (true) {
            try {
                byte[] bArr2 = new byte[4];
                if (c19314b.read(bArr2) != 4) {
                    throw new IOException("Encountered invalid length while parsing WebP chunktype");
                }
                int i2 = c19314b.readInt();
                int i3 = length + 8;
                if (Arrays.equals(WEBP_CHUNK_TYPE_EXIF, bArr2)) {
                    byte[] bArr3 = new byte[i2];
                    if (c19314b.read(bArr3) == i2) {
                        this.mOffsetToExifData = i3;
                        readExifSegment(bArr3, 0);
                        setThumbnailData(new C19314b(bArr3));
                        return;
                    } else {
                        throw new IOException("Failed to read given length for given PNG chunk type: " + r7f.m180129a(bArr2));
                    }
                }
                if (i2 % 2 == 1) {
                    i2++;
                }
                length = i3 + i2;
                if (length == i) {
                    return;
                }
                if (length > i) {
                    throw new IOException("Encountered WebP file with invalid chunk size");
                }
                c19314b.m171105q(i2);
            } catch (EOFException unused) {
                zpg0.m220844a("Encountered corrupt WebP file.");
                return;
            }
        }
    }

    private static Pair<Integer, Integer> guessDataFormat(String str) {
        if (str.contains(Constants.SEPARATOR_COMMA)) {
            String[] strArrSplit = str.split(Constants.SEPARATOR_COMMA, -1);
            Pair<Integer, Integer> pairGuessDataFormat = guessDataFormat(strArrSplit[0]);
            if (((Integer) pairGuessDataFormat.first).intValue() == 2) {
                return pairGuessDataFormat;
            }
            for (int i = 1; i < strArrSplit.length; i++) {
                Pair<Integer, Integer> pairGuessDataFormat2 = guessDataFormat(strArrSplit[i]);
                int iIntValue = (((Integer) pairGuessDataFormat2.first).equals(pairGuessDataFormat.first) || ((Integer) pairGuessDataFormat2.second).equals(pairGuessDataFormat.first)) ? ((Integer) pairGuessDataFormat.first).intValue() : -1;
                int iIntValue2 = (((Integer) pairGuessDataFormat.second).intValue() == -1 || !(((Integer) pairGuessDataFormat2.first).equals(pairGuessDataFormat.second) || ((Integer) pairGuessDataFormat2.second).equals(pairGuessDataFormat.second))) ? -1 : ((Integer) pairGuessDataFormat.second).intValue();
                if (iIntValue == -1 && iIntValue2 == -1) {
                    return new Pair<>(2, -1);
                }
                if (iIntValue == -1) {
                    pairGuessDataFormat = new Pair<>(Integer.valueOf(iIntValue2), -1);
                } else if (iIntValue2 == -1) {
                    pairGuessDataFormat = new Pair<>(Integer.valueOf(iIntValue), -1);
                }
            }
            return pairGuessDataFormat;
        }
        if (!str.contains("/")) {
            try {
                try {
                    long j = Long.parseLong(str);
                    if (j < 0 || j > 65535) {
                        return j < 0 ? new Pair<>(9, -1) : new Pair<>(4, -1);
                    }
                    return new Pair<>(3, 4);
                } catch (NumberFormatException unused) {
                    return new Pair<>(2, -1);
                }
            } catch (NumberFormatException unused2) {
                Double.parseDouble(str);
                return new Pair<>(12, -1);
            }
        }
        String[] strArrSplit2 = str.split("/", -1);
        if (strArrSplit2.length == 2) {
            try {
                long j2 = (long) Double.parseDouble(strArrSplit2[0]);
                long j3 = (long) Double.parseDouble(strArrSplit2[1]);
                if (j2 >= 0 && j3 >= 0) {
                    if (j2 <= 2147483647L && j3 <= 2147483647L) {
                        return new Pair<>(10, 5);
                    }
                    return new Pair<>(5, -1);
                }
                return new Pair<>(10, -1);
            } catch (NumberFormatException unused3) {
            }
        }
        return new Pair<>(2, -1);
    }

    private void handleThumbnailFromJfif(C19314b c19314b, HashMap map) throws Throwable {
        C19316d c19316d = (C19316d) map.get(TAG_JPEG_INTERCHANGE_FORMAT);
        C19316d c19316d2 = (C19316d) map.get(TAG_JPEG_INTERCHANGE_FORMAT_LENGTH);
        if (c19316d == null || c19316d2 == null) {
            return;
        }
        int iM171124m = c19316d.m171124m(this.mExifByteOrder);
        int iM171124m2 = c19316d2.m171124m(this.mExifByteOrder);
        if (this.mMimeType == 7) {
            iM171124m += this.mOrfMakerNoteOffset;
        }
        if (iM171124m <= 0 || iM171124m2 <= 0) {
            return;
        }
        this.mHasThumbnail = true;
        if (this.mFilename == null && this.mAssetInputStream == null && this.mSeekableFileDescriptor == null) {
            byte[] bArr = new byte[iM171124m2];
            c19314b.skip(iM171124m);
            c19314b.read(bArr);
            this.mThumbnailBytes = bArr;
        }
        this.mThumbnailOffset = iM171124m;
        this.mThumbnailLength = iM171124m2;
    }

    private void handleThumbnailFromStrips(C19314b c19314b, HashMap map) throws IOException {
        C19316d c19316d = (C19316d) map.get(TAG_STRIP_OFFSETS);
        C19316d c19316d2 = (C19316d) map.get(TAG_STRIP_BYTE_COUNTS);
        if (c19316d == null || c19316d2 == null) {
            return;
        }
        long[] jArrM180132d = r7f.m180132d(c19316d.m171126o(this.mExifByteOrder));
        long[] jArrM180132d2 = r7f.m180132d(c19316d2.m171126o(this.mExifByteOrder));
        if (jArrM180132d == null || jArrM180132d.length == 0 || jArrM180132d2 == null || jArrM180132d2.length == 0 || jArrM180132d.length != jArrM180132d2.length) {
            return;
        }
        long j = 0;
        for (long j2 : jArrM180132d2) {
            j += j2;
        }
        int i = (int) j;
        byte[] bArr = new byte[i];
        this.mAreThumbnailStripsConsecutive = true;
        this.mHasThumbnailStrips = true;
        this.mHasThumbnail = true;
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < jArrM180132d.length; i4++) {
            int i5 = (int) jArrM180132d[i4];
            int i6 = (int) jArrM180132d2[i4];
            if (i4 < jArrM180132d.length - 1 && i5 + i6 != jArrM180132d[i4 + 1]) {
                this.mAreThumbnailStripsConsecutive = false;
            }
            int i7 = i5 - i2;
            if (i7 < 0) {
                return;
            }
            long j3 = i7;
            if (c19314b.skip(j3) != j3) {
                return;
            }
            int i8 = i2 + i7;
            byte[] bArr2 = new byte[i6];
            if (c19314b.read(bArr2) != i6) {
                return;
            }
            i2 = i8 + i6;
            System.arraycopy(bArr2, 0, bArr, i3, i6);
            i3 += i6;
        }
        this.mThumbnailBytes = bArr;
        if (this.mAreThumbnailStripsConsecutive) {
            this.mThumbnailOffset = (int) jArrM180132d[0];
            this.mThumbnailLength = i;
        }
    }

    private void initForFilename(String str) throws Throwable {
        if (str == null) {
            mnd0.m159157a("filename cannot be null");
            return;
        }
        FileInputStream fileInputStream = null;
        this.mAssetInputStream = null;
        this.mFilename = str;
        try {
            FileInputStream fileInputStream2 = new FileInputStream(str);
            try {
                if (isSeekableFD(fileInputStream2.getFD())) {
                    this.mSeekableFileDescriptor = fileInputStream2.getFD();
                } else {
                    this.mSeekableFileDescriptor = null;
                }
                loadAttributes(fileInputStream2);
                r7f.m180131c(fileInputStream2);
            } catch (Throwable th) {
                th = th;
                fileInputStream = fileInputStream2;
                r7f.m180131c(fileInputStream);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    private static boolean isExifDataOnly(BufferedInputStream bufferedInputStream) throws IOException {
        byte[] bArr = IDENTIFIER_EXIF_APP1;
        bufferedInputStream.mark(bArr.length);
        byte[] bArr2 = new byte[bArr.length];
        bufferedInputStream.read(bArr2);
        bufferedInputStream.reset();
        int i = 0;
        while (true) {
            byte[] bArr3 = IDENTIFIER_EXIF_APP1;
            if (i >= bArr3.length) {
                return true;
            }
            if (bArr2[i] != bArr3[i]) {
                return false;
            }
            i++;
        }
    }

    private boolean isHeifFormat(byte[] bArr) throws Throwable {
        long j;
        C19314b c19314b = null;
        try {
            C19314b c19314b2 = new C19314b(bArr);
            try {
                long length = c19314b2.readInt();
                byte[] bArr2 = new byte[4];
                c19314b2.read(bArr2);
                if (!Arrays.equals(bArr2, HEIF_TYPE_FTYP)) {
                    c19314b2.close();
                    return false;
                }
                if (length == 1) {
                    length = c19314b2.readLong();
                    j = 16;
                    if (length < 16) {
                        c19314b2.close();
                        return false;
                    }
                } else {
                    j = 8;
                }
                if (length > bArr.length) {
                    length = bArr.length;
                }
                long j2 = length - j;
                if (j2 < 8) {
                    c19314b2.close();
                    return false;
                }
                byte[] bArr3 = new byte[4];
                boolean z = false;
                boolean z2 = false;
                for (long j3 = 0; j3 < j2 / 4; j3++) {
                    if (c19314b2.read(bArr3) != 4) {
                        c19314b2.close();
                        return false;
                    }
                    if (j3 != 1) {
                        if (Arrays.equals(bArr3, HEIF_BRAND_MIF1)) {
                            z = true;
                        } else if (Arrays.equals(bArr3, HEIF_BRAND_HEIC)) {
                            z2 = true;
                        }
                        if (z && z2) {
                            c19314b2.close();
                            return true;
                        }
                    }
                }
                c19314b2.close();
            } catch (Exception unused) {
                c19314b = c19314b2;
                if (c19314b != null) {
                    c19314b.close();
                }
            } catch (Throwable th) {
                th = th;
                c19314b = c19314b2;
                if (c19314b != null) {
                    c19314b.close();
                }
                throw th;
            }
        } catch (Exception unused2) {
        } catch (Throwable th2) {
            th = th2;
        }
        return false;
    }

    private static boolean isJpegFormat(byte[] bArr) throws IOException {
        int i = 0;
        while (true) {
            byte[] bArr2 = JPEG_SIGNATURE;
            if (i >= bArr2.length) {
                return true;
            }
            if (bArr[i] != bArr2[i]) {
                return false;
            }
            i++;
        }
    }

    private boolean isOrfFormat(byte[] bArr) throws Throwable {
        C19314b c19314b = null;
        try {
            C19314b c19314b2 = new C19314b(bArr);
            try {
                ByteOrder byteOrder = readByteOrder(c19314b2);
                this.mExifByteOrder = byteOrder;
                c19314b2.m171104n(byteOrder);
                short s = c19314b2.readShort();
                boolean z = s == 20306 || s == 21330;
                c19314b2.close();
                return z;
            } catch (Exception unused) {
                c19314b = c19314b2;
                if (c19314b != null) {
                    c19314b.close();
                }
                return false;
            } catch (Throwable th) {
                th = th;
                c19314b = c19314b2;
                if (c19314b != null) {
                    c19314b.close();
                }
                throw th;
            }
        } catch (Exception unused2) {
        } catch (Throwable th2) {
            th = th2;
        }
    }

    private boolean isPngFormat(byte[] bArr) throws IOException {
        int i = 0;
        while (true) {
            byte[] bArr2 = PNG_SIGNATURE;
            if (i >= bArr2.length) {
                return true;
            }
            if (bArr[i] != bArr2[i]) {
                return false;
            }
            i++;
        }
    }

    private boolean isRafFormat(byte[] bArr) throws IOException {
        byte[] bytes = RAF_SIGNATURE.getBytes(Charset.defaultCharset());
        for (int i = 0; i < bytes.length; i++) {
            if (bArr[i] != bytes[i]) {
                return false;
            }
        }
        return true;
    }

    private boolean isRw2Format(byte[] bArr) throws Throwable {
        C19314b c19314b = null;
        try {
            C19314b c19314b2 = new C19314b(bArr);
            try {
                ByteOrder byteOrder = readByteOrder(c19314b2);
                this.mExifByteOrder = byteOrder;
                c19314b2.m171104n(byteOrder);
                boolean z = c19314b2.readShort() == 85;
                c19314b2.close();
                return z;
            } catch (Exception unused) {
                c19314b = c19314b2;
                if (c19314b != null) {
                    c19314b.close();
                }
                return false;
            } catch (Throwable th) {
                th = th;
                c19314b = c19314b2;
                if (c19314b != null) {
                    c19314b.close();
                }
                throw th;
            }
        } catch (Exception unused2) {
        } catch (Throwable th2) {
            th = th2;
        }
    }

    private static boolean isSeekableFD(FileDescriptor fileDescriptor) {
        try {
            r7f.C19785a.m180139c(fileDescriptor, 0L, OsConstants.SEEK_CUR);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    private boolean isSupportedDataType(HashMap map) throws Throwable {
        C19316d c19316d;
        C19316d c19316d2 = (C19316d) map.get(TAG_BITS_PER_SAMPLE);
        if (c19316d2 == null) {
            return false;
        }
        int[] iArr = (int[]) c19316d2.m171126o(this.mExifByteOrder);
        int[] iArr2 = BITS_PER_SAMPLE_RGB;
        if (Arrays.equals(iArr2, iArr)) {
            return true;
        }
        if (this.mMimeType != 3 || (c19316d = (C19316d) map.get(TAG_PHOTOMETRIC_INTERPRETATION)) == null) {
            return false;
        }
        int iM171124m = c19316d.m171124m(this.mExifByteOrder);
        return (iM171124m == 1 && Arrays.equals(iArr, BITS_PER_SAMPLE_GREYSCALE_2)) || (iM171124m == 6 && Arrays.equals(iArr, iArr2));
    }

    private static boolean isSupportedFormatForSavingAttributes(int i) {
        return i == 4 || i == 13 || i == 14 || i == 3 || i == 0;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static boolean isSupportedMimeType(@NonNull String str) {
        if (str == null) {
            mnd0.m159157a("mimeType shouldn't be null");
            return false;
        }
        String lowerCase = str.toLowerCase(Locale.ROOT);
        lowerCase.getClass();
        int iHashCode = lowerCase.hashCode();
        byte b = MARKER;
        switch (iHashCode) {
            case -1875291391:
                if (lowerCase.equals("image/x-fuji-raf")) {
                    b = 0;
                }
                break;
            case -1635437028:
                if (lowerCase.equals("image/x-samsung-srw")) {
                    b = 1;
                }
                break;
            case -1594371159:
                if (lowerCase.equals("image/x-sony-arw")) {
                    b = 2;
                }
                break;
            case -1487464693:
                if (lowerCase.equals("image/heic")) {
                    b = 3;
                }
                break;
            case -1487464690:
                if (lowerCase.equals("image/heif")) {
                    b = 4;
                }
                break;
            case -1487394660:
                if (lowerCase.equals(DLNAProfiles.DLNAMimeTypes.MIME_IMAGE_JPEG)) {
                    b = 5;
                }
                break;
            case -1487018032:
                if (lowerCase.equals("image/webp")) {
                    b = 6;
                }
                break;
            case -1423313290:
                if (lowerCase.equals("image/x-adobe-dng")) {
                    b = 7;
                }
                break;
            case -985160897:
                if (lowerCase.equals("image/x-panasonic-rw2")) {
                    b = 8;
                }
                break;
            case -879258763:
                if (lowerCase.equals(DLNAProfiles.DLNAMimeTypes.MIME_IMAGE_PNG)) {
                    b = 9;
                }
                break;
            case -332763809:
                if (lowerCase.equals("image/x-pentax-pef")) {
                    b = 10;
                }
                break;
            case 1378106698:
                if (lowerCase.equals("image/x-olympus-orf")) {
                    b = 11;
                }
                break;
            case 2099152104:
                if (lowerCase.equals("image/x-nikon-nef")) {
                    b = 12;
                }
                break;
            case 2099152524:
                if (lowerCase.equals("image/x-nikon-nrw")) {
                    b = HttpTokens.CARRIAGE_RETURN;
                }
                break;
            case 2111234748:
                if (lowerCase.equals("image/x-canon-cr2")) {
                    b = 14;
                }
                break;
        }
        switch (b) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
                return true;
            default:
                return false;
        }
    }

    private boolean isThumbnail(HashMap map) throws IOException {
        C19316d c19316d = (C19316d) map.get(TAG_IMAGE_LENGTH);
        C19316d c19316d2 = (C19316d) map.get(TAG_IMAGE_WIDTH);
        if (c19316d == null || c19316d2 == null) {
            return false;
        }
        return c19316d.m171124m(this.mExifByteOrder) <= 512 && c19316d2.m171124m(this.mExifByteOrder) <= 512;
    }

    private boolean isWebpFormat(byte[] bArr) throws IOException {
        int i = 0;
        while (true) {
            byte[] bArr2 = WEBP_SIGNATURE_1;
            if (i >= bArr2.length) {
                int i2 = 0;
                while (true) {
                    byte[] bArr3 = WEBP_SIGNATURE_2;
                    if (i2 >= bArr3.length) {
                        return true;
                    }
                    if (bArr[WEBP_SIGNATURE_1.length + i2 + 4] != bArr3[i2]) {
                        return false;
                    }
                    i2++;
                }
            } else {
                if (bArr[i] != bArr2[i]) {
                    return false;
                }
                i++;
            }
        }
    }

    private void loadAttributes(@NonNull InputStream inputStream) throws Throwable {
        if (inputStream == null) {
            mnd0.m159157a("inputstream shouldn't be null");
            return;
        }
        for (int i = 0; i < EXIF_TAGS.length; i++) {
            try {
                try {
                    this.mAttributes[i] = new HashMap<>();
                } catch (IOException | UnsupportedOperationException unused) {
                    boolean z = DEBUG;
                    addDefaultValuesForCompatibility();
                    if (z) {
                        printAttributes();
                        return;
                    }
                    return;
                }
            } catch (Throwable th) {
                addDefaultValuesForCompatibility();
                if (DEBUG) {
                    printAttributes();
                }
                throw th;
            }
        }
        if (!this.mIsExifDataOnly) {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream, 5000);
            this.mMimeType = getMimeType(bufferedInputStream);
            inputStream = bufferedInputStream;
        }
        if (shouldSupportSeek(this.mMimeType)) {
            C19319g c19319g = new C19319g(inputStream);
            if (this.mIsExifDataOnly) {
                getStandaloneAttributes(c19319g);
            } else {
                int i2 = this.mMimeType;
                if (i2 == 12) {
                    getHeifAttributes(c19319g);
                } else if (i2 == 7) {
                    getOrfAttributes(c19319g);
                } else if (i2 == 10) {
                    getRw2Attributes(c19319g);
                } else {
                    getRawAttributes(c19319g);
                }
            }
            c19319g.m171130t(this.mOffsetToExifData);
            setThumbnailData(c19319g);
        } else {
            C19314b c19314b = new C19314b(inputStream);
            int i3 = this.mMimeType;
            if (i3 == 4) {
                getJpegAttributes(c19314b, 0, 0);
            } else if (i3 == 13) {
                getPngAttributes(c19314b);
            } else if (i3 == 9) {
                getRafAttributes(c19314b);
            } else if (i3 == 14) {
                getWebpAttributes(c19314b);
            }
        }
        addDefaultValuesForCompatibility();
        if (DEBUG) {
            printAttributes();
        }
    }

    private static Long parseDateTime(@Nullable String str, @Nullable String str2, @Nullable String str3) {
        if (str != null && NON_ZERO_TIME_PATTERN.matcher(str).matches()) {
            ParsePosition parsePosition = new ParsePosition(0);
            try {
                Date date = sFormatterPrimary.parse(str, parsePosition);
                if (date == null && (date = sFormatterSecondary.parse(str, parsePosition)) == null) {
                    return null;
                }
                long time = date.getTime();
                if (str3 != null) {
                    int i = 1;
                    String strSubstring = str3.substring(0, 1);
                    int i2 = Integer.parseInt(str3.substring(1, 3));
                    int i3 = Integer.parseInt(str3.substring(4, 6));
                    if ((Marker.ANY_NON_NULL_MARKER.equals(strSubstring) || "-".equals(strSubstring)) && ":".equals(str3.substring(3, 4)) && i2 <= 14) {
                        int i4 = ((i2 * 60) + i3) * HuiYanResultSender.TIMEOUT_MS;
                        if (!"-".equals(strSubstring)) {
                            i = -1;
                        }
                        time += (long) (i4 * i);
                    }
                }
                if (str2 != null) {
                    time += r7f.m180135g(str2);
                }
                return Long.valueOf(time);
            } catch (IllegalArgumentException unused) {
            }
        }
        return null;
    }

    private void parseTiffHeaders(C19314b c19314b) throws IOException {
        ByteOrder byteOrder = readByteOrder(c19314b);
        this.mExifByteOrder = byteOrder;
        c19314b.m171104n(byteOrder);
        int unsignedShort = c19314b.readUnsignedShort();
        int i = this.mMimeType;
        if (i != 7 && i != 10 && unsignedShort != 42) {
            rr10.m182681a("Invalid start code: ", Integer.toHexString(unsignedShort));
            return;
        }
        int i2 = c19314b.readInt();
        if (i2 < 8) {
            p3r0.m170507a("Invalid first Ifd offset: ", i2);
            return;
        }
        int i3 = i2 - 8;
        if (i3 > 0) {
            c19314b.m171105q(i3);
        }
    }

    private void printAttributes() throws Throwable {
        int i = 0;
        while (true) {
            HashMap<String, C19316d>[] mapArr = this.mAttributes;
            if (i >= mapArr.length) {
                return;
            }
            mapArr[i].size();
            for (Map.Entry<String, C19316d> entry : this.mAttributes[i].entrySet()) {
                C19316d value = entry.getValue();
                entry.getKey();
                value.toString();
                value.m171125n(this.mExifByteOrder);
            }
            i++;
        }
    }

    private ByteOrder readByteOrder(C19314b c19314b) throws IOException {
        short s = c19314b.readShort();
        if (s == 18761) {
            return ByteOrder.LITTLE_ENDIAN;
        }
        if (s == 19789) {
            return ByteOrder.BIG_ENDIAN;
        }
        rr10.m182681a("Invalid byte order: ", Integer.toHexString(s));
        return null;
    }

    private void readExifSegment(byte[] bArr, int i) throws IOException {
        C19319g c19319g = new C19319g(bArr);
        parseTiffHeaders(c19319g);
        readImageFileDirectory(c19319g, i);
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:71:0x015d  */
    private void readImageFileDirectory(C19319g c19319g, int i) throws IOException {
        int i2;
        long j;
        boolean z;
        int unsignedShort;
        long jM171103m;
        this.mAttributesOffsets.add(Integer.valueOf(c19319g.f150922c));
        short s = c19319g.readShort();
        if (s <= 0) {
            return;
        }
        short s2 = 0;
        while (s2 < s) {
            int unsignedShort2 = c19319g.readUnsignedShort();
            int unsignedShort3 = c19319g.readUnsignedShort();
            int i3 = c19319g.readInt();
            long jM171102k = ((long) c19319g.m171102k()) + 4;
            C19317e c19317e = sExifTagMapsForReading[i].get(Integer.valueOf(unsignedShort2));
            boolean z2 = DEBUG;
            if (z2) {
                i2 = 4;
                String.format("ifdType: %d, tagNumber: %d, tagName: %s, dataFormat: %d, numberOfComponents: %d", Integer.valueOf(i), Integer.valueOf(unsignedShort2), c19317e != null ? c19317e.f150931b : null, Integer.valueOf(unsignedShort3), Integer.valueOf(i3));
            } else {
                i2 = 4;
            }
            if (c19317e != null && unsignedShort3 > 0) {
                int[] iArr = IFD_FORMAT_BYTES_PER_FORMAT;
                if (unsignedShort3 >= iArr.length) {
                    j = 0;
                } else if (c19317e.m171128a(unsignedShort3)) {
                    if (unsignedShort3 == 7) {
                        unsignedShort3 = c19317e.f150932c;
                    }
                    j = ((long) i3) * ((long) iArr[unsignedShort3]);
                    z = j >= 0 && j <= 2147483647L;
                } else {
                    if (z2) {
                        String str = IFD_FORMAT_NAMES[unsignedShort3];
                    }
                    j = 0;
                }
            } else {
                j = 0;
            }
            if (z) {
                if (j > 4) {
                    int i4 = c19319g.readInt();
                    if (this.mMimeType == 7) {
                        if (TAG_MAKER_NOTE.equals(c19317e.f150931b)) {
                            this.mOrfMakerNoteOffset = i4;
                        } else if (i == 6 && TAG_ORF_THUMBNAIL_IMAGE.equals(c19317e.f150931b)) {
                            this.mOrfThumbnailOffset = i4;
                            this.mOrfThumbnailLength = i3;
                            C19316d c19316dM171121j = C19316d.m171121j(6, this.mExifByteOrder);
                            C19316d c19316dM171117f = C19316d.m171117f(this.mOrfThumbnailOffset, this.mExifByteOrder);
                            C19316d c19316dM171117f2 = C19316d.m171117f(this.mOrfThumbnailLength, this.mExifByteOrder);
                            this.mAttributes[i2].put(TAG_COMPRESSION, c19316dM171121j);
                            this.mAttributes[i2].put(TAG_JPEG_INTERCHANGE_FORMAT, c19316dM171117f);
                            this.mAttributes[i2].put(TAG_JPEG_INTERCHANGE_FORMAT_LENGTH, c19316dM171117f2);
                        }
                    }
                    c19319g.m171130t(i4);
                } else {
                    z2 = z2;
                    unsignedShort2 = unsignedShort2;
                }
                Integer num = sExifPointerTagMap.get(Integer.valueOf(unsignedShort2));
                if (num != null) {
                    if (unsignedShort3 != 3) {
                        if (unsignedShort3 == i2) {
                            jM171103m = c19319g.m171103m();
                        } else if (unsignedShort3 == 8) {
                            unsignedShort = c19319g.readShort();
                        } else if (unsignedShort3 == 9 || unsignedShort3 == 13) {
                            unsignedShort = c19319g.readInt();
                        } else {
                            jM171103m = -1;
                        }
                        if (z2) {
                            String.format("Offset: %d, tagName: %s", Long.valueOf(jM171103m), c19317e.f150931b);
                        }
                        if (jM171103m > 0 && !this.mAttributesOffsets.contains(Integer.valueOf((int) jM171103m))) {
                            c19319g.m171130t(jM171103m);
                            readImageFileDirectory(c19319g, num.intValue());
                        }
                        c19319g.m171130t(jM171102k);
                    } else {
                        unsignedShort = c19319g.readUnsignedShort();
                    }
                    jM171103m = unsignedShort;
                    if (z2) {
                        String.format("Offset: %d, tagName: %s", Long.valueOf(jM171103m), c19317e.f150931b);
                    }
                    if (jM171103m > 0) {
                        c19319g.m171130t(jM171103m);
                        readImageFileDirectory(c19319g, num.intValue());
                    }
                    c19319g.m171130t(jM171102k);
                } else {
                    int iM171102k = c19319g.m171102k() + this.mOffsetToExifData;
                    byte[] bArr = new byte[(int) j];
                    c19319g.readFully(bArr);
                    C19316d c19316d = new C19316d(unsignedShort3, i3, iM171102k, bArr);
                    this.mAttributes[i].put(c19317e.f150931b, c19316d);
                    if (TAG_DNG_VERSION.equals(c19317e.f150931b)) {
                        this.mMimeType = 3;
                    }
                    if (((TAG_MAKE.equals(c19317e.f150931b) || TAG_MODEL.equals(c19317e.f150931b)) && c19316d.m171125n(this.mExifByteOrder).contains(PEF_SIGNATURE)) || (TAG_COMPRESSION.equals(c19317e.f150931b) && c19316d.m171124m(this.mExifByteOrder) == 65535)) {
                        this.mMimeType = 8;
                    }
                    if (c19319g.m171102k() != jM171102k) {
                        c19319g.m171130t(jM171102k);
                    }
                }
            } else {
                c19319g.m171130t(jM171102k);
                s2 = s2;
            }
            s2 = (short) (s2 + 1);
            s = s;
        }
        int i5 = c19319g.readInt();
        if (DEBUG) {
            String.format("nextIfdOffset: %d", Integer.valueOf(i5));
        }
        long j2 = i5;
        if (j2 <= 0 || this.mAttributesOffsets.contains(Integer.valueOf(i5))) {
            return;
        }
        c19319g.m171130t(j2);
        if (this.mAttributes[4].isEmpty()) {
            readImageFileDirectory(c19319g, 4);
        } else if (this.mAttributes[5].isEmpty()) {
            readImageFileDirectory(c19319g, 5);
        }
    }

    private void removeAttribute(String str) {
        for (int i = 0; i < EXIF_TAGS.length; i++) {
            this.mAttributes[i].remove(str);
        }
    }

    private void replaceInvalidTags(int i, String str, String str2) {
        if (this.mAttributes[i].isEmpty() || this.mAttributes[i].get(str) == null) {
            return;
        }
        HashMap<String, C19316d> map = this.mAttributes[i];
        map.put(str2, map.get(str));
        this.mAttributes[i].remove(str);
    }

    private void retrieveJpegImageSize(C19319g c19319g, int i) throws Throwable {
        C19316d c19316d = this.mAttributes[i].get(TAG_IMAGE_LENGTH);
        C19316d c19316d2 = this.mAttributes[i].get(TAG_IMAGE_WIDTH);
        if (c19316d == null || c19316d2 == null) {
            C19316d c19316d3 = this.mAttributes[i].get(TAG_JPEG_INTERCHANGE_FORMAT);
            C19316d c19316d4 = this.mAttributes[i].get(TAG_JPEG_INTERCHANGE_FORMAT_LENGTH);
            if (c19316d3 == null || c19316d4 == null) {
                return;
            }
            int iM171124m = c19316d3.m171124m(this.mExifByteOrder);
            int iM171124m2 = c19316d3.m171124m(this.mExifByteOrder);
            c19319g.m171130t(iM171124m);
            byte[] bArr = new byte[iM171124m2];
            c19319g.read(bArr);
            getJpegAttributes(new C19314b(bArr), iM171124m, i);
        }
    }

    private void saveJpegAttributes(InputStream inputStream, OutputStream outputStream) throws IOException {
        if (DEBUG) {
            Objects.toString(inputStream);
            Objects.toString(outputStream);
        }
        C19314b c19314b = new C19314b(inputStream);
        C19315c c19315c = new C19315c(outputStream, ByteOrder.BIG_ENDIAN);
        if (c19314b.readByte() != -1) {
            zpg0.m220844a("Invalid marker");
            return;
        }
        c19315c.m171107d(-1);
        if (c19314b.readByte() != -40) {
            zpg0.m220844a("Invalid marker");
            return;
        }
        c19315c.m171107d(-40);
        C19316d c19316dRemove = (getAttribute(TAG_XMP) == null || !this.mXmpIsFromSeparateMarker) ? null : this.mAttributes[0].remove(TAG_XMP);
        c19315c.m171107d(-1);
        c19315c.m171107d(-31);
        writeExifSegment(c19315c);
        if (c19316dRemove != null) {
            this.mAttributes[0].put(TAG_XMP, c19316dRemove);
        }
        byte[] bArr = new byte[4096];
        while (c19314b.readByte() == -1) {
            byte b = c19314b.readByte();
            if (b == -39 || b == -38) {
                c19315c.m171107d(-1);
                c19315c.m171107d(b);
                r7f.m180133e(c19314b, c19315c);
                return;
            }
            if (b != -31) {
                c19315c.m171107d(-1);
                c19315c.m171107d(b);
                int unsignedShort = c19314b.readUnsignedShort();
                c19315c.m171111i(unsignedShort);
                int i = unsignedShort - 2;
                if (i < 0) {
                    zpg0.m220844a("Invalid length");
                    return;
                }
                while (i > 0) {
                    int i2 = c19314b.read(bArr, 0, Math.min(i, 4096));
                    if (i2 < 0) {
                        break;
                    }
                    c19315c.write(bArr, 0, i2);
                    i -= i2;
                }
            } else {
                int unsignedShort2 = c19314b.readUnsignedShort();
                int i3 = unsignedShort2 - 2;
                if (i3 < 0) {
                    zpg0.m220844a("Invalid length");
                    return;
                }
                byte[] bArr2 = new byte[6];
                if (i3 >= 6) {
                    if (c19314b.read(bArr2) != 6) {
                        zpg0.m220844a("Invalid exif");
                        return;
                    } else if (Arrays.equals(bArr2, IDENTIFIER_EXIF_APP1)) {
                        c19314b.m171105q(unsignedShort2 - 8);
                    }
                }
                c19315c.m171107d(-1);
                c19315c.m171107d(b);
                c19315c.m171111i(unsignedShort2);
                if (i3 >= 6) {
                    i3 = unsignedShort2 - 8;
                    c19315c.write(bArr2);
                }
                while (i3 > 0) {
                    int i4 = c19314b.read(bArr, 0, Math.min(i3, 4096));
                    if (i4 < 0) {
                        break;
                    }
                    c19315c.write(bArr, 0, i4);
                    i3 -= i4;
                }
            }
        }
        zpg0.m220844a("Invalid marker");
    }

    private void savePngAttributes(InputStream inputStream, OutputStream outputStream) throws Throwable {
        if (DEBUG) {
            Objects.toString(inputStream);
            Objects.toString(outputStream);
        }
        C19314b c19314b = new C19314b(inputStream);
        ByteOrder byteOrder = ByteOrder.BIG_ENDIAN;
        C19315c c19315c = new C19315c(outputStream, byteOrder);
        byte[] bArr = PNG_SIGNATURE;
        r7f.m180134f(c19314b, c19315c, bArr.length);
        int i = this.mOffsetToExifData;
        if (i == 0) {
            int i2 = c19314b.readInt();
            c19315c.m171108e(i2);
            r7f.m180134f(c19314b, c19315c, i2 + 8);
        } else {
            r7f.m180134f(c19314b, c19315c, (i - bArr.length) - 8);
            c19314b.m171105q(c19314b.readInt() + 8);
        }
        ByteArrayOutputStream byteArrayOutputStream = null;
        try {
            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
            try {
                C19315c c19315c2 = new C19315c(byteArrayOutputStream2, byteOrder);
                writeExifSegment(c19315c2);
                byte[] byteArray = ((ByteArrayOutputStream) c19315c2.f150924a).toByteArray();
                c19315c.write(byteArray);
                CRC32 crc32 = new CRC32();
                crc32.update(byteArray, 4, byteArray.length - 4);
                c19315c.m171108e((int) crc32.getValue());
                r7f.m180131c(byteArrayOutputStream2);
                r7f.m180133e(c19314b, c19315c);
            } catch (Throwable th) {
                th = th;
                byteArrayOutputStream = byteArrayOutputStream2;
                r7f.m180131c(byteArrayOutputStream);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    private void saveWebpAttributes(InputStream inputStream, OutputStream outputStream) throws Throwable {
        char c;
        int i;
        int i2;
        int i3;
        int i4;
        if (DEBUG) {
            Objects.toString(inputStream);
            Objects.toString(outputStream);
        }
        ByteOrder byteOrder = ByteOrder.LITTLE_ENDIAN;
        C19314b c19314b = new C19314b(inputStream, byteOrder);
        C19315c c19315c = new C19315c(outputStream, byteOrder);
        byte[] bArr = WEBP_SIGNATURE_1;
        r7f.m180134f(c19314b, c19315c, bArr.length);
        byte[] bArr2 = WEBP_SIGNATURE_2;
        c19314b.m171105q(bArr2.length + 4);
        ByteArrayOutputStream byteArrayOutputStream = null;
        try {
            try {
                ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                try {
                    C19315c c19315c2 = new C19315c(byteArrayOutputStream2, byteOrder);
                    int i5 = this.mOffsetToExifData;
                    if (i5 != 0) {
                        r7f.m180134f(c19314b, c19315c2, (i5 - ((bArr.length + 4) + bArr2.length)) - 8);
                        c19314b.m171105q(4);
                        c19314b.m171105q(c19314b.readInt());
                        writeExifSegment(c19315c2);
                    } else {
                        byte[] bArr3 = new byte[4];
                        if (c19314b.read(bArr3) != 4) {
                            throw new IOException("Encountered invalid length while parsing WebP chunk type");
                        }
                        byte[] bArr4 = WEBP_CHUNK_TYPE_VP8X;
                        if (Arrays.equals(bArr3, bArr4)) {
                            int i6 = c19314b.readInt();
                            byte[] bArr5 = new byte[i6 % 2 == 1 ? i6 + 1 : i6];
                            c19314b.read(bArr5);
                            byte b = (byte) (8 | bArr5[0]);
                            bArr5[0] = b;
                            boolean z = ((b >> 1) & 1) == 1;
                            c19315c2.write(bArr4);
                            c19315c2.m171108e(i6);
                            c19315c2.write(bArr5);
                            if (z) {
                                copyChunksUpToGivenChunkType(c19314b, c19315c2, WEBP_CHUNK_TYPE_ANIM, null);
                                while (true) {
                                    byte[] bArr6 = new byte[4];
                                    inputStream.read(bArr6);
                                    if (!Arrays.equals(bArr6, WEBP_CHUNK_TYPE_ANMF)) {
                                        break;
                                    } else {
                                        copyWebPChunk(c19314b, c19315c2, bArr6);
                                    }
                                }
                                writeExifSegment(c19315c2);
                            } else {
                                copyChunksUpToGivenChunkType(c19314b, c19315c2, WEBP_CHUNK_TYPE_VP8, WEBP_CHUNK_TYPE_VP8L);
                                writeExifSegment(c19315c2);
                            }
                        } else {
                            byte[] bArr7 = WEBP_CHUNK_TYPE_VP8;
                            if (Arrays.equals(bArr3, bArr7) || Arrays.equals(bArr3, WEBP_CHUNK_TYPE_VP8L)) {
                                int i7 = c19314b.readInt();
                                int i8 = i7 % 2 == 1 ? i7 + 1 : i7;
                                byte[] bArr8 = new byte[3];
                                if (Arrays.equals(bArr3, bArr7)) {
                                    c19314b.read(bArr8);
                                    byte[] bArr9 = new byte[3];
                                    c = '\b';
                                    if (c19314b.read(bArr9) != 3 || !Arrays.equals(WEBP_VP8_SIGNATURE, bArr9)) {
                                        throw new IOException("Encountered error while checking VP8 signature");
                                    }
                                    i = c19314b.readInt();
                                    i2 = (i << 18) >> 18;
                                    i3 = (i << 2) >> 18;
                                    i8 -= 10;
                                    i4 = 0;
                                } else {
                                    c = '\b';
                                    if (!Arrays.equals(bArr3, WEBP_CHUNK_TYPE_VP8L)) {
                                        i = 0;
                                        i2 = 0;
                                        i3 = 0;
                                        i4 = 0;
                                    } else {
                                        if (c19314b.readByte() != 47) {
                                            throw new IOException("Encountered error while checking VP8L signature");
                                        }
                                        i = c19314b.readInt();
                                        i4 = i & 8;
                                        i8 -= 5;
                                        i3 = ((i << 4) >> 18) + 1;
                                        i2 = ((i << 18) >> 18) + 1;
                                    }
                                }
                                c19315c2.write(bArr4);
                                c19315c2.m171108e(10);
                                byte[] bArr10 = new byte[10];
                                byte b2 = (byte) (bArr10[0] | 8);
                                bArr10[0] = b2;
                                bArr10[0] = (byte) (b2 | (i4 << 4));
                                int i9 = i2 - 1;
                                int i10 = i3 - 1;
                                bArr10[4] = (byte) i9;
                                bArr10[5] = (byte) (i9 >> 8);
                                bArr10[6] = (byte) (i9 >> 16);
                                bArr10[7] = (byte) i10;
                                bArr10[c] = (byte) (i10 >> 8);
                                bArr10[9] = (byte) (i10 >> 16);
                                c19315c2.write(bArr10);
                                c19315c2.write(bArr3);
                                c19315c2.m171108e(i7);
                                if (Arrays.equals(bArr3, bArr7)) {
                                    c19315c2.write(bArr8);
                                    c19315c2.write(WEBP_VP8_SIGNATURE);
                                    c19315c2.m171108e(i);
                                } else if (Arrays.equals(bArr3, WEBP_CHUNK_TYPE_VP8L)) {
                                    c19315c2.write(47);
                                    c19315c2.m171108e(i);
                                }
                                r7f.m180134f(c19314b, c19315c2, i8);
                                writeExifSegment(c19315c2);
                            }
                        }
                    }
                    r7f.m180133e(c19314b, c19315c2);
                    int size = byteArrayOutputStream2.size();
                    byte[] bArr11 = WEBP_SIGNATURE_2;
                    c19315c.m171108e(size + bArr11.length);
                    c19315c.write(bArr11);
                    byteArrayOutputStream2.writeTo(c19315c);
                    r7f.m180131c(byteArrayOutputStream2);
                } catch (Exception e) {
                    e = e;
                    throw new IOException("Failed to save WebP file", e);
                } catch (Throwable th) {
                    th = th;
                    byteArrayOutputStream = byteArrayOutputStream2;
                    r7f.m180131c(byteArrayOutputStream);
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (Exception e2) {
            e = e2;
        }
    }

    private void setThumbnailData(C19314b c19314b) throws Throwable {
        HashMap<String, C19316d> map = this.mAttributes[4];
        C19316d c19316d = map.get(TAG_COMPRESSION);
        if (c19316d == null) {
            this.mThumbnailCompression = 6;
            handleThumbnailFromJfif(c19314b, map);
            return;
        }
        int iM171124m = c19316d.m171124m(this.mExifByteOrder);
        this.mThumbnailCompression = iM171124m;
        if (iM171124m != 1) {
            if (iM171124m == 6) {
                handleThumbnailFromJfif(c19314b, map);
                return;
            } else if (iM171124m != 7) {
                return;
            }
        }
        if (isSupportedDataType(map)) {
            handleThumbnailFromStrips(c19314b, map);
        }
    }

    private static boolean shouldSupportSeek(int i) {
        return (i == 4 || i == 9 || i == 13 || i == 14) ? false : true;
    }

    private void swapBasedOnImageSize(int i, int i2) throws Throwable {
        if (this.mAttributes[i].isEmpty() || this.mAttributes[i2].isEmpty()) {
            return;
        }
        C19316d c19316d = this.mAttributes[i].get(TAG_IMAGE_LENGTH);
        C19316d c19316d2 = this.mAttributes[i].get(TAG_IMAGE_WIDTH);
        C19316d c19316d3 = this.mAttributes[i2].get(TAG_IMAGE_LENGTH);
        C19316d c19316d4 = this.mAttributes[i2].get(TAG_IMAGE_WIDTH);
        if (c19316d == null || c19316d2 == null || c19316d3 == null || c19316d4 == null) {
            return;
        }
        int iM171124m = c19316d.m171124m(this.mExifByteOrder);
        int iM171124m2 = c19316d2.m171124m(this.mExifByteOrder);
        int iM171124m3 = c19316d3.m171124m(this.mExifByteOrder);
        int iM171124m4 = c19316d4.m171124m(this.mExifByteOrder);
        if (iM171124m >= iM171124m3 || iM171124m2 >= iM171124m4) {
            return;
        }
        HashMap<String, C19316d>[] mapArr = this.mAttributes;
        HashMap<String, C19316d> map = mapArr[i];
        mapArr[i] = mapArr[i2];
        mapArr[i2] = map;
    }

    private void updateImageSizeValues(C19319g c19319g, int i) throws Throwable {
        C19316d c19316dM171121j;
        C19316d c19316dM171121j2;
        C19316d c19316d = this.mAttributes[i].get(TAG_DEFAULT_CROP_SIZE);
        C19316d c19316d2 = this.mAttributes[i].get(TAG_RW2_SENSOR_TOP_BORDER);
        C19316d c19316d3 = this.mAttributes[i].get(TAG_RW2_SENSOR_LEFT_BORDER);
        C19316d c19316d4 = this.mAttributes[i].get(TAG_RW2_SENSOR_BOTTOM_BORDER);
        C19316d c19316d5 = this.mAttributes[i].get(TAG_RW2_SENSOR_RIGHT_BORDER);
        if (c19316d == null) {
            if (c19316d2 == null || c19316d3 == null || c19316d4 == null || c19316d5 == null) {
                retrieveJpegImageSize(c19319g, i);
                return;
            }
            int iM171124m = c19316d2.m171124m(this.mExifByteOrder);
            int iM171124m2 = c19316d4.m171124m(this.mExifByteOrder);
            int iM171124m3 = c19316d5.m171124m(this.mExifByteOrder);
            int iM171124m4 = c19316d3.m171124m(this.mExifByteOrder);
            if (iM171124m2 <= iM171124m || iM171124m3 <= iM171124m4) {
                return;
            }
            C19316d c19316dM171121j3 = C19316d.m171121j(iM171124m2 - iM171124m, this.mExifByteOrder);
            C19316d c19316dM171121j4 = C19316d.m171121j(iM171124m3 - iM171124m4, this.mExifByteOrder);
            this.mAttributes[i].put(TAG_IMAGE_LENGTH, c19316dM171121j3);
            this.mAttributes[i].put(TAG_IMAGE_WIDTH, c19316dM171121j4);
            return;
        }
        int i2 = c19316d.f150926a;
        ByteOrder byteOrder = this.mExifByteOrder;
        if (i2 == 5) {
            C19318f[] c19318fArr = (C19318f[]) c19316d.m171126o(byteOrder);
            if (c19318fArr == null || c19318fArr.length != 2) {
                Arrays.toString(c19318fArr);
                return;
            } else {
                c19316dM171121j = C19316d.m171119h(c19318fArr[0], this.mExifByteOrder);
                c19316dM171121j2 = C19316d.m171119h(c19318fArr[1], this.mExifByteOrder);
            }
        } else {
            int[] iArr = (int[]) c19316d.m171126o(byteOrder);
            if (iArr == null || iArr.length != 2) {
                Arrays.toString(iArr);
                return;
            } else {
                c19316dM171121j = C19316d.m171121j(iArr[0], this.mExifByteOrder);
                c19316dM171121j2 = C19316d.m171121j(iArr[1], this.mExifByteOrder);
            }
        }
        this.mAttributes[i].put(TAG_IMAGE_WIDTH, c19316dM171121j);
        this.mAttributes[i].put(TAG_IMAGE_LENGTH, c19316dM171121j2);
    }

    private void validateImages() throws Throwable {
        swapBasedOnImageSize(0, 5);
        swapBasedOnImageSize(0, 4);
        swapBasedOnImageSize(5, 4);
        C19316d c19316d = this.mAttributes[1].get(TAG_PIXEL_X_DIMENSION);
        C19316d c19316d2 = this.mAttributes[1].get(TAG_PIXEL_Y_DIMENSION);
        if (c19316d != null && c19316d2 != null) {
            this.mAttributes[0].put(TAG_IMAGE_WIDTH, c19316d);
            this.mAttributes[0].put(TAG_IMAGE_LENGTH, c19316d2);
        }
        if (this.mAttributes[4].isEmpty() && isThumbnail(this.mAttributes[5])) {
            HashMap<String, C19316d>[] mapArr = this.mAttributes;
            mapArr[4] = mapArr[5];
            mapArr[5] = new HashMap<>();
        }
        isThumbnail(this.mAttributes[4]);
        replaceInvalidTags(0, TAG_THUMBNAIL_ORIENTATION, TAG_ORIENTATION);
        replaceInvalidTags(0, TAG_THUMBNAIL_IMAGE_LENGTH, TAG_IMAGE_LENGTH);
        replaceInvalidTags(0, TAG_THUMBNAIL_IMAGE_WIDTH, TAG_IMAGE_WIDTH);
        replaceInvalidTags(5, TAG_THUMBNAIL_ORIENTATION, TAG_ORIENTATION);
        replaceInvalidTags(5, TAG_THUMBNAIL_IMAGE_LENGTH, TAG_IMAGE_LENGTH);
        replaceInvalidTags(5, TAG_THUMBNAIL_IMAGE_WIDTH, TAG_IMAGE_WIDTH);
        replaceInvalidTags(4, TAG_ORIENTATION, TAG_THUMBNAIL_ORIENTATION);
        replaceInvalidTags(4, TAG_IMAGE_LENGTH, TAG_THUMBNAIL_IMAGE_LENGTH);
        replaceInvalidTags(4, TAG_IMAGE_WIDTH, TAG_THUMBNAIL_IMAGE_WIDTH);
    }

    private int writeExifSegment(C19315c c19315c) throws IOException {
        HashMap<String, C19316d>[] mapArr;
        int i;
        int i2;
        C19317e[][] c19317eArr = EXIF_TAGS;
        int[] iArr = new int[c19317eArr.length];
        int[] iArr2 = new int[c19317eArr.length];
        for (C19317e c19317e : EXIF_POINTER_TAGS) {
            removeAttribute(c19317e.f150931b);
        }
        if (this.mHasThumbnail) {
            if (this.mHasThumbnailStrips) {
                removeAttribute(TAG_STRIP_OFFSETS);
                removeAttribute(TAG_STRIP_BYTE_COUNTS);
            } else {
                removeAttribute(TAG_JPEG_INTERCHANGE_FORMAT);
                removeAttribute(TAG_JPEG_INTERCHANGE_FORMAT_LENGTH);
            }
        }
        int i3 = 0;
        while (true) {
            int length = EXIF_TAGS.length;
            mapArr = this.mAttributes;
            if (i3 >= length) {
                break;
            }
            for (Object obj : mapArr[i3].entrySet().toArray()) {
                Map.Entry entry = (Map.Entry) obj;
                if (entry.getValue() == null) {
                    this.mAttributes[i3].remove(entry.getKey());
                }
            }
            i3++;
        }
        if (!mapArr[1].isEmpty()) {
            this.mAttributes[0].put(EXIF_POINTER_TAGS[1].f150931b, C19316d.m171117f(0L, this.mExifByteOrder));
        }
        if (!this.mAttributes[2].isEmpty()) {
            this.mAttributes[0].put(EXIF_POINTER_TAGS[2].f150931b, C19316d.m171117f(0L, this.mExifByteOrder));
        }
        if (!this.mAttributes[3].isEmpty()) {
            this.mAttributes[1].put(EXIF_POINTER_TAGS[3].f150931b, C19316d.m171117f(0L, this.mExifByteOrder));
        }
        if (this.mHasThumbnail) {
            boolean z = this.mHasThumbnailStrips;
            HashMap<String, C19316d>[] mapArr2 = this.mAttributes;
            if (z) {
                mapArr2[4].put(TAG_STRIP_OFFSETS, C19316d.m171121j(0, this.mExifByteOrder));
                this.mAttributes[4].put(TAG_STRIP_BYTE_COUNTS, C19316d.m171121j(this.mThumbnailLength, this.mExifByteOrder));
            } else {
                mapArr2[4].put(TAG_JPEG_INTERCHANGE_FORMAT, C19316d.m171117f(0L, this.mExifByteOrder));
                this.mAttributes[4].put(TAG_JPEG_INTERCHANGE_FORMAT_LENGTH, C19316d.m171117f(this.mThumbnailLength, this.mExifByteOrder));
            }
        }
        for (int i4 = 0; i4 < EXIF_TAGS.length; i4++) {
            Iterator<Map.Entry<String, C19316d>> it = this.mAttributes[i4].entrySet().iterator();
            int i5 = 0;
            while (it.hasNext()) {
                int iM171127p = it.next().getValue().m171127p();
                if (iM171127p > 4) {
                    i5 += iM171127p;
                }
            }
            iArr2[i4] = iArr2[i4] + i5;
        }
        int size = 8;
        for (int i6 = 0; i6 < EXIF_TAGS.length; i6++) {
            if (!this.mAttributes[i6].isEmpty()) {
                iArr[i6] = size;
                size += (this.mAttributes[i6].size() * 12) + 6 + iArr2[i6];
            }
        }
        if (this.mHasThumbnail) {
            boolean z2 = this.mHasThumbnailStrips;
            HashMap<String, C19316d>[] mapArr3 = this.mAttributes;
            if (z2) {
                mapArr3[4].put(TAG_STRIP_OFFSETS, C19316d.m171121j(size, this.mExifByteOrder));
            } else {
                mapArr3[4].put(TAG_JPEG_INTERCHANGE_FORMAT, C19316d.m171117f(size, this.mExifByteOrder));
            }
            this.mThumbnailOffset = size;
            size += this.mThumbnailLength;
        }
        if (this.mMimeType == 4) {
            size += 8;
        }
        if (DEBUG) {
            for (int i7 = 0; i7 < EXIF_TAGS.length; i7++) {
                String.format("index: %d, offsets: %d, tag count: %d, data sizes: %d, total size: %d", Integer.valueOf(i7), Integer.valueOf(iArr[i7]), Integer.valueOf(this.mAttributes[i7].size()), Integer.valueOf(iArr2[i7]), Integer.valueOf(size));
            }
        }
        if (!this.mAttributes[1].isEmpty()) {
            this.mAttributes[0].put(EXIF_POINTER_TAGS[1].f150931b, C19316d.m171117f(iArr[1], this.mExifByteOrder));
        }
        if (!this.mAttributes[r13].isEmpty()) {
            this.mAttributes[0].put(EXIF_POINTER_TAGS[r13].f150931b, C19316d.m171117f(iArr[2], this.mExifByteOrder));
        }
        if (!this.mAttributes[r14].isEmpty()) {
            this.mAttributes[1].put(EXIF_POINTER_TAGS[r14].f150931b, C19316d.m171117f(iArr[3], this.mExifByteOrder));
        }
        int i8 = this.mMimeType;
        if (i8 == 4) {
            c19315c.m171111i(size);
            c19315c.write(IDENTIFIER_EXIF_APP1);
        } else if (i8 == 13) {
            c19315c.m171108e(size);
            c19315c.write(PNG_CHUNK_TYPE_EXIF);
        } else if (i8 == 14) {
            c19315c.write(WEBP_CHUNK_TYPE_EXIF);
            c19315c.m171108e(size);
        }
        c19315c.m171109g(this.mExifByteOrder == ByteOrder.BIG_ENDIAN ? BYTE_ALIGN_MM : BYTE_ALIGN_II);
        c19315c.m171106b(this.mExifByteOrder);
        c19315c.m171111i(42);
        c19315c.m171110h(8L);
        int i9 = 0;
        while (i9 < EXIF_TAGS.length) {
            if (this.mAttributes[i9].isEmpty()) {
                i = size;
            } else {
                c19315c.m171111i(this.mAttributes[i9].size());
                int size2 = iArr[i9] + 2 + (this.mAttributes[i9].size() * 12) + 4;
                for (Map.Entry<String, C19316d> entry2 : this.mAttributes[i9].entrySet()) {
                    int i10 = sExifTagMapsForWriting[i9].get(entry2.getKey()).f150930a;
                    C19316d value = entry2.getValue();
                    int iM171127p2 = value.m171127p();
                    c19315c.m171111i(i10);
                    c19315c.m171111i(value.f150926a);
                    c19315c.m171108e(value.f150927b);
                    if (iM171127p2 > 4) {
                        i2 = size;
                        c19315c.m171110h(size2);
                        size2 += iM171127p2;
                    } else {
                        i2 = size;
                        c19315c.write(value.f150929d);
                        if (iM171127p2 < 4) {
                            while (iM171127p2 < 4) {
                                c19315c.m171107d(0);
                                iM171127p2++;
                            }
                        }
                    }
                    size = i2;
                }
                i = size;
                if (i9 != 0 || this.mAttributes[4].isEmpty()) {
                    c19315c.m171110h(0L);
                } else {
                    c19315c.m171110h(iArr[4]);
                }
                Iterator<Map.Entry<String, C19316d>> it2 = this.mAttributes[i9].entrySet().iterator();
                while (it2.hasNext()) {
                    byte[] bArr = it2.next().getValue().f150929d;
                    if (bArr.length > 4) {
                        c19315c.write(bArr, 0, bArr.length);
                    }
                }
            }
            i9++;
            size = i;
        }
        int i11 = size;
        if (this.mHasThumbnail) {
            c19315c.write(getThumbnailBytes());
        }
        if (this.mMimeType == 14 && i11 % 2 == 1) {
            c19315c.m171107d(0);
        }
        c19315c.m171106b(ByteOrder.BIG_ENDIAN);
        return i11;
    }

    public void flipHorizontally() {
        int i = 1;
        switch (getAttributeInt(TAG_ORIENTATION, 1)) {
            case 1:
                i = 2;
                break;
            case 2:
                break;
            case 3:
                i = 4;
                break;
            case 4:
                i = 3;
                break;
            case 5:
                i = 6;
                break;
            case 6:
                i = 5;
                break;
            case 7:
                i = 8;
                break;
            case 8:
                i = 7;
                break;
            default:
                i = 0;
                break;
        }
        setAttribute(TAG_ORIENTATION, Integer.toString(i));
    }

    public void flipVertically() {
        int i = 1;
        switch (getAttributeInt(TAG_ORIENTATION, 1)) {
            case 1:
                i = 4;
                break;
            case 2:
                i = 3;
                break;
            case 3:
                i = 2;
                break;
            case 4:
                break;
            case 5:
                i = 8;
                break;
            case 6:
                i = 7;
                break;
            case 7:
                i = 6;
                break;
            case 8:
                i = 5;
                break;
            default:
                i = 0;
                break;
        }
        setAttribute(TAG_ORIENTATION, Integer.toString(i));
    }

    public double getAltitude(double d) {
        double attributeDouble = getAttributeDouble(TAG_GPS_ALTITUDE, -1.0d);
        int attributeInt = getAttributeInt(TAG_GPS_ALTITUDE_REF, -1);
        if (attributeDouble < FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE || attributeInt < 0) {
            return d;
        }
        return attributeDouble * ((double) (attributeInt != 1 ? 1 : -1));
    }

    @Nullable
    public String getAttribute(@NonNull String str) {
        if (str == null) {
            mnd0.m159157a("tag shouldn't be null");
            return null;
        }
        C19316d exifAttribute = getExifAttribute(str);
        if (exifAttribute != null) {
            if (!sTagSetForCompatibility.contains(str)) {
                return exifAttribute.m171125n(this.mExifByteOrder);
            }
            if (str.equals(TAG_GPS_TIMESTAMP)) {
                int i = exifAttribute.f150926a;
                if (i != 5 && i != 10) {
                    return null;
                }
                C19318f[] c19318fArr = (C19318f[]) exifAttribute.m171126o(this.mExifByteOrder);
                if (c19318fArr == null || c19318fArr.length != 3) {
                    Arrays.toString(c19318fArr);
                    return null;
                }
                C19318f c19318f = c19318fArr[0];
                Integer numValueOf = Integer.valueOf((int) (c19318f.f150934a / c19318f.f150935b));
                C19318f c19318f2 = c19318fArr[1];
                Integer numValueOf2 = Integer.valueOf((int) (c19318f2.f150934a / c19318f2.f150935b));
                C19318f c19318f3 = c19318fArr[2];
                return String.format("%02d:%02d:%02d", numValueOf, numValueOf2, Integer.valueOf((int) (c19318f3.f150934a / c19318f3.f150935b)));
            }
            try {
                return Double.toString(exifAttribute.m171123l(this.mExifByteOrder));
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }

    @Nullable
    public byte[] getAttributeBytes(@NonNull String str) {
        if (str == null) {
            mnd0.m159157a("tag shouldn't be null");
            return null;
        }
        C19316d exifAttribute = getExifAttribute(str);
        if (exifAttribute != null) {
            return exifAttribute.f150929d;
        }
        return null;
    }

    public double getAttributeDouble(@NonNull String str, double d) {
        if (str == null) {
            mnd0.m159157a("tag shouldn't be null");
            return FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE;
        }
        C19316d exifAttribute = getExifAttribute(str);
        if (exifAttribute != null) {
            try {
                return exifAttribute.m171123l(this.mExifByteOrder);
            } catch (NumberFormatException unused) {
            }
        }
        return d;
    }

    public int getAttributeInt(@NonNull String str, int i) {
        if (str == null) {
            mnd0.m159157a("tag shouldn't be null");
            return 0;
        }
        C19316d exifAttribute = getExifAttribute(str);
        if (exifAttribute != null) {
            try {
                return exifAttribute.m171124m(this.mExifByteOrder);
            } catch (NumberFormatException unused) {
            }
        }
        return i;
    }

    @Nullable
    public long[] getAttributeRange(@NonNull String str) {
        if (str == null) {
            mnd0.m159157a("tag shouldn't be null");
            return null;
        }
        if (this.mModified) {
            wtq0.m207906a("The underlying file has been modified since being parsed");
            return null;
        }
        C19316d exifAttribute = getExifAttribute(str);
        if (exifAttribute != null) {
            return new long[]{exifAttribute.f150928c, exifAttribute.f150929d.length};
        }
        return null;
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public Long getDateTime() {
        return parseDateTime(getAttribute(TAG_DATETIME), getAttribute(TAG_SUBSEC_TIME), getAttribute(TAG_OFFSET_TIME));
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public Long getDateTimeDigitized() {
        return parseDateTime(getAttribute(TAG_DATETIME_DIGITIZED), getAttribute(TAG_SUBSEC_TIME_DIGITIZED), getAttribute(TAG_OFFSET_TIME_DIGITIZED));
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public Long getDateTimeOriginal() {
        return parseDateTime(getAttribute(TAG_DATETIME_ORIGINAL), getAttribute(TAG_SUBSEC_TIME_ORIGINAL), getAttribute(TAG_OFFSET_TIME_ORIGINAL));
    }

    @Nullable
    @SuppressLint({"AutoBoxing"})
    public Long getGpsDateTime() {
        String attribute = getAttribute(TAG_GPS_DATESTAMP);
        String attribute2 = getAttribute(TAG_GPS_TIMESTAMP);
        if (attribute != null && attribute2 != null) {
            Pattern pattern = NON_ZERO_TIME_PATTERN;
            if (pattern.matcher(attribute).matches() || pattern.matcher(attribute2).matches()) {
                String str = attribute + ' ' + attribute2;
                ParsePosition parsePosition = new ParsePosition(0);
                try {
                    Date date = sFormatterPrimary.parse(str, parsePosition);
                    if (date == null && (date = sFormatterSecondary.parse(str, parsePosition)) == null) {
                        return null;
                    }
                    return Long.valueOf(date.getTime());
                } catch (IllegalArgumentException unused) {
                }
            }
        }
        return null;
    }

    @Nullable
    public double[] getLatLong() {
        String attribute = getAttribute(TAG_GPS_LATITUDE);
        String attribute2 = getAttribute(TAG_GPS_LATITUDE_REF);
        String attribute3 = getAttribute(TAG_GPS_LONGITUDE);
        String attribute4 = getAttribute(TAG_GPS_LONGITUDE_REF);
        if (attribute == null || attribute2 == null || attribute3 == null || attribute4 == null) {
            return null;
        }
        try {
            return new double[]{convertRationalLatLonToDouble(attribute, attribute2), convertRationalLatLonToDouble(attribute3, attribute4)};
        } catch (IllegalArgumentException unused) {
            String.format("latValue=%s, latRef=%s, lngValue=%s, lngRef=%s", attribute, attribute2, attribute3, attribute4);
            return null;
        }
    }

    public int getRotationDegrees() {
        switch (getAttributeInt(TAG_ORIENTATION, 1)) {
            case 3:
            case 4:
                return 180;
            case 5:
            case 8:
                return 270;
            case 6:
            case 7:
                return 90;
            default:
                return 0;
        }
    }

    @Nullable
    public byte[] getThumbnail() {
        int i = this.mThumbnailCompression;
        if (i == 6 || i == 7) {
            return getThumbnailBytes();
        }
        return null;
    }

    @Nullable
    public Bitmap getThumbnailBitmap() throws Throwable {
        if (!this.mHasThumbnail) {
            return null;
        }
        if (this.mThumbnailBytes == null) {
            this.mThumbnailBytes = getThumbnailBytes();
        }
        int i = this.mThumbnailCompression;
        if (i == 6 || i == 7) {
            return BitmapFactory.decodeByteArray(this.mThumbnailBytes, 0, this.mThumbnailLength);
        }
        if (i == 1) {
            int length = this.mThumbnailBytes.length / 3;
            int[] iArr = new int[length];
            for (int i2 = 0; i2 < length; i2++) {
                byte[] bArr = this.mThumbnailBytes;
                int i3 = i2 * 3;
                iArr[i2] = (bArr[i3] << Tnaf.POW_2_WIDTH) + (bArr[i3 + 1] << 8) + bArr[i3 + 2];
            }
            C19316d c19316d = this.mAttributes[4].get(TAG_THUMBNAIL_IMAGE_LENGTH);
            C19316d c19316d2 = this.mAttributes[4].get(TAG_THUMBNAIL_IMAGE_WIDTH);
            if (c19316d != null && c19316d2 != null) {
                return Bitmap.createBitmap(iArr, c19316d2.m171124m(this.mExifByteOrder), c19316d.m171124m(this.mExifByteOrder), Bitmap.Config.ARGB_8888);
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:50:0x0093  */
    @Nullable
    public byte[] getThumbnailBytes() throws Throwable {
        FileDescriptor fileDescriptor;
        InputStream fileInputStream;
        InputStream inputStream = null;
        if (!this.mHasThumbnail) {
            return null;
        }
        byte[] bArr = this.mThumbnailBytes;
        if (bArr != null) {
            return bArr;
        }
        try {
            fileInputStream = this.mAssetInputStream;
            if (fileInputStream != null) {
                try {
                    if (!fileInputStream.markSupported()) {
                        r7f.m180131c(fileInputStream);
                        return null;
                    }
                    fileInputStream.reset();
                    fileDescriptor = null;
                } catch (Exception unused) {
                    fileDescriptor = null;
                } catch (Throwable th) {
                    th = th;
                    fileDescriptor = null;
                    inputStream = fileInputStream;
                    r7f.m180131c(inputStream);
                    if (fileDescriptor != null) {
                        r7f.m180130b(fileDescriptor);
                    }
                    throw th;
                }
                r7f.m180131c(fileInputStream);
                if (fileDescriptor != null) {
                    r7f.m180130b(fileDescriptor);
                }
                return null;
            }
            if (this.mFilename != null) {
                fileInputStream = new FileInputStream(this.mFilename);
                fileDescriptor = null;
            } else {
                FileDescriptor fileDescriptorM180138b = r7f.C19785a.m180138b(this.mSeekableFileDescriptor);
                try {
                    r7f.C19785a.m180139c(fileDescriptorM180138b, 0L, OsConstants.SEEK_SET);
                    fileDescriptor = fileDescriptorM180138b;
                    fileInputStream = new FileInputStream(fileDescriptorM180138b);
                } catch (Exception unused2) {
                    fileDescriptor = fileDescriptorM180138b;
                    fileInputStream = null;
                } catch (Throwable th2) {
                    th = th2;
                    fileDescriptor = fileDescriptorM180138b;
                    r7f.m180131c(inputStream);
                    if (fileDescriptor != null) {
                        r7f.m180130b(fileDescriptor);
                    }
                    throw th;
                }
            }
            try {
                if (fileInputStream.skip(this.mThumbnailOffset + this.mOffsetToExifData) != this.mThumbnailOffset + this.mOffsetToExifData) {
                    throw new IOException("Corrupted image");
                }
                byte[] bArr2 = new byte[this.mThumbnailLength];
                if (fileInputStream.read(bArr2) != this.mThumbnailLength) {
                    throw new IOException("Corrupted image");
                }
                this.mThumbnailBytes = bArr2;
                r7f.m180131c(fileInputStream);
                if (fileDescriptor != null) {
                    r7f.m180130b(fileDescriptor);
                }
                return bArr2;
            } catch (Exception unused3) {
            } catch (Throwable th3) {
                th = th3;
                inputStream = fileInputStream;
                r7f.m180131c(inputStream);
                if (fileDescriptor != null) {
                    r7f.m180130b(fileDescriptor);
                }
                throw th;
            }
        } catch (Exception unused4) {
            fileInputStream = null;
            fileDescriptor = null;
        } catch (Throwable th4) {
            th = th4;
            fileDescriptor = null;
        }
    }

    @Nullable
    public long[] getThumbnailRange() {
        if (this.mModified) {
            wtq0.m207906a("The underlying file has been modified since being parsed");
            return null;
        }
        if (!this.mHasThumbnail) {
            return null;
        }
        if (!this.mHasThumbnailStrips || this.mAreThumbnailStripsConsecutive) {
            return new long[]{this.mThumbnailOffset + this.mOffsetToExifData, this.mThumbnailLength};
        }
        return null;
    }

    public boolean hasAttribute(@NonNull String str) {
        return getExifAttribute(str) != null;
    }

    public boolean hasThumbnail() {
        return this.mHasThumbnail;
    }

    public boolean isFlipped() {
        int attributeInt = getAttributeInt(TAG_ORIENTATION, 1);
        return attributeInt == 2 || attributeInt == 7 || attributeInt == 4 || attributeInt == 5;
    }

    public boolean isThumbnailCompressed() {
        if (!this.mHasThumbnail) {
            return false;
        }
        int i = this.mThumbnailCompression;
        return i == 6 || i == 7;
    }

    public void resetOrientation() {
        setAttribute(TAG_ORIENTATION, Integer.toString(1));
    }

    public void rotate(int i) {
        if (i % 90 != 0) {
            wg3.m206174a("degree should be a multiple of 90");
            return;
        }
        int attributeInt = getAttributeInt(TAG_ORIENTATION, 1);
        List<Integer> list = ROTATION_ORDER;
        int iIntValue = 0;
        if (list.contains(Integer.valueOf(attributeInt))) {
            int iIndexOf = (list.indexOf(Integer.valueOf(attributeInt)) + (i / 90)) % 4;
            iIntValue = list.get(iIndexOf + (iIndexOf < 0 ? 4 : 0)).intValue();
        } else {
            List<Integer> list2 = FLIPPED_ROTATION_ORDER;
            if (list2.contains(Integer.valueOf(attributeInt))) {
                int iIndexOf2 = (list2.indexOf(Integer.valueOf(attributeInt)) + (i / 90)) % 4;
                iIntValue = list2.get(iIndexOf2 + (iIndexOf2 < 0 ? 4 : 0)).intValue();
            }
        }
        setAttribute(TAG_ORIENTATION, Integer.toString(iIntValue));
    }

    /* JADX WARN: Code duplicated, block: B:74:0x00ff A[Catch: all -> 0x010f, Exception -> 0x0113, TryCatch #17 {Exception -> 0x0113, all -> 0x010f, blocks: (B:72:0x00fb, B:74:0x00ff, B:81:0x011e, B:80:0x0116), top: B:133:0x00fb }] */
    /* JADX WARN: Code duplicated, block: B:80:0x0116 A[Catch: all -> 0x010f, Exception -> 0x0113, TryCatch #17 {Exception -> 0x0113, all -> 0x010f, blocks: (B:72:0x00fb, B:74:0x00ff, B:81:0x011e, B:80:0x0116), top: B:133:0x00fb }] */
    /* JADX WARN: Code duplicated, block: B:96:0x015d  */
    public void saveAttributes() throws Throwable {
        FileOutputStream fileOutputStream;
        FileInputStream fileInputStream;
        BufferedOutputStream bufferedOutputStream;
        BufferedInputStream bufferedInputStream;
        Exception exc;
        OutputStream fileOutputStream2;
        FileInputStream fileInputStream2;
        FileOutputStream fileOutputStream3;
        if (!isSupportedFormatForSavingAttributes(this.mMimeType)) {
            zpg0.m220844a("ExifInterface only supports saving attributes for JPEG, PNG, WebP, and DNG formats.");
            return;
        }
        if (this.mSeekableFileDescriptor == null && this.mFilename == null) {
            zpg0.m220844a("ExifInterface does not support saving attributes for the current input.");
            return;
        }
        if (this.mHasThumbnail && this.mHasThumbnailStrips && !this.mAreThumbnailStripsConsecutive) {
            zpg0.m220844a("ExifInterface does not support saving attributes when the image file has non-consecutive thumbnail strips");
            return;
        }
        boolean z = true;
        this.mModified = true;
        this.mThumbnailBytes = getThumbnail();
        InputStream inputStream = null;
        try {
            File fileCreateTempFile = File.createTempFile("temp", "tmp");
            if (this.mFilename != null) {
                fileInputStream = new FileInputStream(this.mFilename);
            } else {
                r7f.C19785a.m180139c(this.mSeekableFileDescriptor, 0L, OsConstants.SEEK_SET);
                fileInputStream = new FileInputStream(this.mSeekableFileDescriptor);
            }
            try {
                fileOutputStream = new FileOutputStream(fileCreateTempFile);
                try {
                    r7f.m180133e(fileInputStream, fileOutputStream);
                    r7f.m180131c(fileInputStream);
                    r7f.m180131c(fileOutputStream);
                    boolean z2 = false;
                    try {
                        try {
                            try {
                                FileInputStream fileInputStream3 = new FileInputStream(fileCreateTempFile);
                                try {
                                    if (this.mFilename != null) {
                                        fileOutputStream2 = new FileOutputStream(this.mFilename);
                                    } else {
                                        r7f.C19785a.m180139c(this.mSeekableFileDescriptor, 0L, OsConstants.SEEK_SET);
                                        fileOutputStream2 = new FileOutputStream(this.mSeekableFileDescriptor);
                                    }
                                    try {
                                        bufferedInputStream = new BufferedInputStream(fileInputStream3);
                                        try {
                                            bufferedOutputStream = new BufferedOutputStream(fileOutputStream2);
                                            try {
                                                int i = this.mMimeType;
                                                if (i == 4) {
                                                    saveJpegAttributes(bufferedInputStream, bufferedOutputStream);
                                                } else if (i == 13) {
                                                    savePngAttributes(bufferedInputStream, bufferedOutputStream);
                                                } else if (i == 14) {
                                                    saveWebpAttributes(bufferedInputStream, bufferedOutputStream);
                                                } else if (i == 3 || i == 0) {
                                                    writeExifSegment(new C19315c(bufferedOutputStream, ByteOrder.BIG_ENDIAN));
                                                }
                                                r7f.m180131c(bufferedInputStream);
                                                r7f.m180131c(bufferedOutputStream);
                                                fileCreateTempFile.delete();
                                                this.mThumbnailBytes = null;
                                            } catch (Exception e) {
                                                exc = e;
                                                inputStream = fileInputStream3;
                                                try {
                                                    fileInputStream2 = new FileInputStream(fileCreateTempFile);
                                                    try {
                                                        if (this.mFilename == null) {
                                                            r7f.C19785a.m180139c(this.mSeekableFileDescriptor, 0L, OsConstants.SEEK_SET);
                                                            fileOutputStream3 = new FileOutputStream(this.mSeekableFileDescriptor);
                                                        } else {
                                                            fileOutputStream3 = new FileOutputStream(this.mFilename);
                                                        }
                                                        fileOutputStream2 = fileOutputStream3;
                                                        r7f.m180133e(fileInputStream2, fileOutputStream2);
                                                        r7f.m180131c(fileInputStream2);
                                                        r7f.m180131c(fileOutputStream2);
                                                        throw new IOException("Failed to save new file", exc);
                                                    } catch (Exception e2) {
                                                        e = e2;
                                                        inputStream = fileInputStream2;
                                                        try {
                                                            throw new IOException("Failed to save new file. Original file is stored in " + fileCreateTempFile.getAbsolutePath(), e);
                                                        } catch (Throwable th) {
                                                            th = th;
                                                            try {
                                                                r7f.m180131c(inputStream);
                                                                r7f.m180131c(fileOutputStream2);
                                                                throw th;
                                                            } catch (Throwable th2) {
                                                                th = th2;
                                                                z2 = z;
                                                                inputStream = bufferedInputStream;
                                                                r7f.m180131c(inputStream);
                                                                r7f.m180131c(bufferedOutputStream);
                                                                if (!z2) {
                                                                    fileCreateTempFile.delete();
                                                                }
                                                                throw th;
                                                            }
                                                        }
                                                    } catch (Throwable th3) {
                                                        th = th3;
                                                        z = false;
                                                        inputStream = fileInputStream2;
                                                        r7f.m180131c(inputStream);
                                                        r7f.m180131c(fileOutputStream2);
                                                        throw th;
                                                    }
                                                } catch (Exception e3) {
                                                    e = e3;
                                                } catch (Throwable th4) {
                                                    th = th4;
                                                    z = false;
                                                }
                                            }
                                        } catch (Exception e4) {
                                            bufferedOutputStream = null;
                                            inputStream = fileInputStream3;
                                            exc = e4;
                                        } catch (Throwable th5) {
                                            th = th5;
                                            bufferedOutputStream = null;
                                            inputStream = bufferedInputStream;
                                            r7f.m180131c(inputStream);
                                            r7f.m180131c(bufferedOutputStream);
                                            if (!z2) {
                                                fileCreateTempFile.delete();
                                            }
                                            throw th;
                                        }
                                    } catch (Exception e5) {
                                        bufferedOutputStream = null;
                                        inputStream = fileInputStream3;
                                        exc = e5;
                                        bufferedInputStream = null;
                                    }
                                } catch (Exception e6) {
                                    e = e6;
                                    bufferedInputStream = null;
                                    bufferedOutputStream = null;
                                    inputStream = fileInputStream3;
                                    exc = e;
                                    fileOutputStream2 = bufferedOutputStream;
                                    fileInputStream2 = new FileInputStream(fileCreateTempFile);
                                    if (this.mFilename == null) {
                                        r7f.C19785a.m180139c(this.mSeekableFileDescriptor, 0L, OsConstants.SEEK_SET);
                                        fileOutputStream3 = new FileOutputStream(this.mSeekableFileDescriptor);
                                    } else {
                                        fileOutputStream3 = new FileOutputStream(this.mFilename);
                                    }
                                    fileOutputStream2 = fileOutputStream3;
                                    r7f.m180133e(fileInputStream2, fileOutputStream2);
                                    r7f.m180131c(fileInputStream2);
                                    r7f.m180131c(fileOutputStream2);
                                    throw new IOException("Failed to save new file", exc);
                                }
                            } catch (Throwable th6) {
                                th = th6;
                                bufferedOutputStream = null;
                                r7f.m180131c(inputStream);
                                r7f.m180131c(bufferedOutputStream);
                                if (!z2) {
                                    fileCreateTempFile.delete();
                                }
                                throw th;
                            }
                        } catch (Exception e7) {
                            e = e7;
                            bufferedInputStream = null;
                            bufferedOutputStream = null;
                        }
                    } catch (Throwable th7) {
                        th = th7;
                    }
                } catch (Exception e8) {
                    e = e8;
                    inputStream = fileInputStream;
                    try {
                        throw new IOException("Failed to copy original file to temp file", e);
                    } catch (Throwable th8) {
                        th = th8;
                        r7f.m180131c(inputStream);
                        r7f.m180131c(fileOutputStream);
                        throw th;
                    }
                } catch (Throwable th9) {
                    th = th9;
                    inputStream = fileInputStream;
                    r7f.m180131c(inputStream);
                    r7f.m180131c(fileOutputStream);
                    throw th;
                }
            } catch (Exception e9) {
                e = e9;
                fileOutputStream = null;
            } catch (Throwable th10) {
                th = th10;
                fileOutputStream = null;
            }
        } catch (Exception e10) {
            e = e10;
            fileOutputStream = null;
        } catch (Throwable th11) {
            th = th11;
            fileOutputStream = null;
        }
    }

    public void setAltitude(double d) {
        String str = d >= FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE ? "0" : "1";
        setAttribute(TAG_GPS_ALTITUDE, new C19318f(Math.abs(d)).toString());
        setAttribute(TAG_GPS_ALTITUDE_REF, str);
    }

    public void setAttribute(@NonNull String str, @Nullable String str2) {
        C19317e c19317e;
        int i;
        int i2;
        String str3 = str;
        String strReplaceAll = str2;
        if (str3 == null) {
            mnd0.m159157a("tag shouldn't be null");
            return;
        }
        if ((TAG_DATETIME.equals(str3) || TAG_DATETIME_ORIGINAL.equals(str3) || TAG_DATETIME_DIGITIZED.equals(str3)) && strReplaceAll != null) {
            boolean zFind = DATETIME_PRIMARY_FORMAT_PATTERN.matcher(strReplaceAll).find();
            boolean zFind2 = DATETIME_SECONDARY_FORMAT_PATTERN.matcher(strReplaceAll).find();
            if (strReplaceAll.length() != 19) {
                return;
            }
            if (!zFind && !zFind2) {
                return;
            }
            if (zFind2) {
                strReplaceAll = strReplaceAll.replaceAll("-", ":");
            }
        }
        if (TAG_ISO_SPEED_RATINGS.equals(str3)) {
            str3 = TAG_PHOTOGRAPHIC_SENSITIVITY;
        }
        int i3 = 2;
        int i4 = 1;
        if (strReplaceAll != null && sTagSetForCompatibility.contains(str3)) {
            if (str3.equals(TAG_GPS_TIMESTAMP)) {
                Matcher matcher = GPS_TIMESTAMP_PATTERN.matcher(strReplaceAll);
                if (!matcher.find()) {
                    return;
                }
                strReplaceAll = Integer.parseInt(matcher.group(1)) + "/1," + Integer.parseInt(matcher.group(2)) + "/1," + Integer.parseInt(matcher.group(3)) + "/1";
            } else {
                try {
                    strReplaceAll = new C19318f(Double.parseDouble(strReplaceAll)).toString();
                } catch (NumberFormatException unused) {
                    return;
                }
            }
        }
        int i5 = 0;
        while (i5 < EXIF_TAGS.length) {
            if ((i5 != 4 || this.mHasThumbnail) && (c19317e = sExifTagMapsForWriting[i5].get(str3)) != null) {
                if (strReplaceAll != null) {
                    Pair<Integer, Integer> pairGuessDataFormat = guessDataFormat(strReplaceAll);
                    if (c19317e.f150932c == ((Integer) pairGuessDataFormat.first).intValue() || c19317e.f150932c == ((Integer) pairGuessDataFormat.second).intValue()) {
                        i = c19317e.f150932c;
                    } else {
                        int i6 = c19317e.f150933d;
                        if (i6 == -1 || !(i6 == ((Integer) pairGuessDataFormat.first).intValue() || c19317e.f150933d == ((Integer) pairGuessDataFormat.second).intValue())) {
                            int i7 = c19317e.f150932c;
                            if (i7 == i4 || i7 == 7 || i7 == i3) {
                                i = i7;
                            } else if (DEBUG) {
                                String[] strArr = IFD_FORMAT_NAMES;
                                String str4 = strArr[c19317e.f150932c];
                                if (c19317e.f150933d != -1) {
                                    new StringBuilder(", ").append(strArr[c19317e.f150933d]);
                                }
                                String str5 = strArr[((Integer) pairGuessDataFormat.first).intValue()];
                                if (((Integer) pairGuessDataFormat.second).intValue() != -1) {
                                    new StringBuilder(", ").append(strArr[((Integer) pairGuessDataFormat.second).intValue()]);
                                }
                            }
                        } else {
                            i = c19317e.f150933d;
                        }
                    }
                    switch (i) {
                        case 1:
                            i2 = i4;
                            this.mAttributes[i5].put(str3, C19316d.m171112a(strReplaceAll));
                            continue;
                        case 2:
                        case 7:
                            i2 = i4;
                            this.mAttributes[i5].put(str3, C19316d.m171116e(strReplaceAll));
                            continue;
                        case 3:
                            i2 = i4;
                            String[] strArrSplit = strReplaceAll.split(Constants.SEPARATOR_COMMA, -1);
                            int[] iArr = new int[strArrSplit.length];
                            for (int i8 = 0; i8 < strArrSplit.length; i8++) {
                                iArr[i8] = Integer.parseInt(strArrSplit[i8]);
                            }
                            this.mAttributes[i5].put(str3, C19316d.m171122k(iArr, this.mExifByteOrder));
                            continue;
                        case 4:
                            i2 = i4;
                            String[] strArrSplit2 = strReplaceAll.split(Constants.SEPARATOR_COMMA, -1);
                            long[] jArr = new long[strArrSplit2.length];
                            for (int i9 = 0; i9 < strArrSplit2.length; i9++) {
                                jArr[i9] = Long.parseLong(strArrSplit2[i9]);
                            }
                            this.mAttributes[i5].put(str3, C19316d.m171118g(jArr, this.mExifByteOrder));
                            continue;
                        case 5:
                            i2 = i4;
                            String[] strArrSplit3 = strReplaceAll.split(Constants.SEPARATOR_COMMA, -1);
                            C19318f[] c19318fArr = new C19318f[strArrSplit3.length];
                            for (int i10 = 0; i10 < strArrSplit3.length; i10++) {
                                String[] strArrSplit4 = strArrSplit3[i10].split("/", -1);
                                c19318fArr[i10] = new C19318f((long) Double.parseDouble(strArrSplit4[0]), (long) Double.parseDouble(strArrSplit4[i2]));
                            }
                            this.mAttributes[i5].put(str3, C19316d.m171120i(c19318fArr, this.mExifByteOrder));
                            continue;
                        case 9:
                            i2 = i4;
                            String[] strArrSplit5 = strReplaceAll.split(Constants.SEPARATOR_COMMA, -1);
                            int[] iArr2 = new int[strArrSplit5.length];
                            for (int i11 = 0; i11 < strArrSplit5.length; i11++) {
                                iArr2[i11] = Integer.parseInt(strArrSplit5[i11]);
                            }
                            this.mAttributes[i5].put(str3, C19316d.m171114c(iArr2, this.mExifByteOrder));
                            continue;
                        case 10:
                            String[] strArrSplit6 = strReplaceAll.split(Constants.SEPARATOR_COMMA, -1);
                            C19318f[] c19318fArr2 = new C19318f[strArrSplit6.length];
                            int i12 = 0;
                            while (i12 < strArrSplit6.length) {
                                String[] strArrSplit7 = strArrSplit6[i12].split("/", -1);
                                c19318fArr2[i12] = new C19318f((long) Double.parseDouble(strArrSplit7[0]), (long) Double.parseDouble(strArrSplit7[i4]));
                                i12++;
                                i4 = i4;
                            }
                            i2 = i4;
                            this.mAttributes[i5].put(str3, C19316d.m171115d(c19318fArr2, this.mExifByteOrder));
                            continue;
                        case 12:
                            String[] strArrSplit8 = strReplaceAll.split(Constants.SEPARATOR_COMMA, -1);
                            double[] dArr = new double[strArrSplit8.length];
                            for (int i13 = 0; i13 < strArrSplit8.length; i13++) {
                                dArr[i13] = Double.parseDouble(strArrSplit8[i13]);
                            }
                            this.mAttributes[i5].put(str3, C19316d.m171113b(dArr, this.mExifByteOrder));
                            break;
                    }
                } else {
                    this.mAttributes[i5].remove(str3);
                }
                i2 = i4;
            } else {
                i2 = i4;
            }
            i5++;
            i4 = i2;
            i3 = 2;
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public void setDateTime(@NonNull Long l2) {
        if (l2 == null) {
            mnd0.m159157a("Timestamp should not be null.");
            return;
        }
        if (l2.longValue() < 0) {
            wg3.m206174a("Timestamp should a positive value.");
            return;
        }
        String string = Long.toString(l2.longValue() % 1000);
        for (int length = string.length(); length < 3; length++) {
            string = "0".concat(string);
        }
        setAttribute(TAG_DATETIME, sFormatterPrimary.format(new Date(l2.longValue())));
        setAttribute(TAG_SUBSEC_TIME, string);
    }

    public void setGpsInfo(Location location) {
        if (location == null) {
            return;
        }
        setAttribute(TAG_GPS_PROCESSING_METHOD, location.getProvider());
        setLatLong(location.getLatitude(), location.getLongitude());
        setAltitude(location.getAltitude());
        setAttribute(TAG_GPS_SPEED_REF, "K");
        setAttribute(TAG_GPS_SPEED, new C19318f((location.getSpeed() * 3600.0f) / 1000.0f).toString());
        String[] strArrSplit = sFormatterPrimary.format(new Date(location.getTime())).split("\\s+", -1);
        setAttribute(TAG_GPS_DATESTAMP, strArrSplit[0]);
        setAttribute(TAG_GPS_TIMESTAMP, strArrSplit[1]);
    }

    public void setLatLong(double d, double d2) {
        if (d < -90.0d || d > 90.0d || Double.isNaN(d)) {
            throw new IllegalArgumentException("Latitude value " + d + " is not valid.");
        }
        if (d2 < -180.0d || d2 > 180.0d || Double.isNaN(d2)) {
            throw new IllegalArgumentException("Longitude value " + d2 + " is not valid.");
        }
        setAttribute(TAG_GPS_LATITUDE_REF, d >= FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE ? "N" : LATITUDE_SOUTH);
        setAttribute(TAG_GPS_LATITUDE, convertDecimalDegree(Math.abs(d)));
        setAttribute(TAG_GPS_LONGITUDE_REF, d2 >= FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE ? "E" : "W");
        setAttribute(TAG_GPS_LONGITUDE, convertDecimalDegree(Math.abs(d2)));
    }

    /* JADX INFO: renamed from: l.p7f$c */
    public static class C19315c extends FilterOutputStream {

        /* JADX INFO: renamed from: a */
        public final OutputStream f150924a;

        /* JADX INFO: renamed from: b */
        public ByteOrder f150925b;

        public C19315c(OutputStream outputStream, ByteOrder byteOrder) {
            super(outputStream);
            this.f150924a = outputStream;
            this.f150925b = byteOrder;
        }

        /* JADX INFO: renamed from: b */
        public void m171106b(ByteOrder byteOrder) {
            this.f150925b = byteOrder;
        }

        /* JADX INFO: renamed from: d */
        public void m171107d(int i) throws IOException {
            this.f150924a.write(i);
        }

        /* JADX INFO: renamed from: e */
        public void m171108e(int i) throws IOException {
            ByteOrder byteOrder = this.f150925b;
            if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
                this.f150924a.write(i & 255);
                this.f150924a.write((i >>> 8) & 255);
                this.f150924a.write((i >>> 16) & 255);
                this.f150924a.write((i >>> 24) & 255);
                return;
            }
            if (byteOrder == ByteOrder.BIG_ENDIAN) {
                this.f150924a.write((i >>> 24) & 255);
                this.f150924a.write((i >>> 16) & 255);
                this.f150924a.write((i >>> 8) & 255);
                this.f150924a.write(i & 255);
            }
        }

        /* JADX INFO: renamed from: g */
        public void m171109g(short s) throws IOException {
            ByteOrder byteOrder = this.f150925b;
            if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
                this.f150924a.write(s & 255);
                this.f150924a.write((s >>> 8) & 255);
            } else if (byteOrder == ByteOrder.BIG_ENDIAN) {
                this.f150924a.write((s >>> 8) & 255);
                this.f150924a.write(s & 255);
            }
        }

        /* JADX INFO: renamed from: h */
        public void m171110h(long j) throws IOException {
            m171108e((int) j);
        }

        /* JADX INFO: renamed from: i */
        public void m171111i(int i) throws IOException {
            m171109g((short) i);
        }

        @Override // java.io.FilterOutputStream, java.io.OutputStream
        public void write(byte[] bArr) throws IOException {
            this.f150924a.write(bArr);
        }

        @Override // java.io.FilterOutputStream, java.io.OutputStream
        public void write(byte[] bArr, int i, int i2) throws IOException {
            this.f150924a.write(bArr, i, i2);
        }
    }

    /* JADX INFO: renamed from: l.p7f$b */
    public static class C19314b extends InputStream implements DataInput {

        /* JADX INFO: renamed from: e */
        public static final ByteOrder f150918e = ByteOrder.LITTLE_ENDIAN;

        /* JADX INFO: renamed from: f */
        public static final ByteOrder f150919f = ByteOrder.BIG_ENDIAN;

        /* JADX INFO: renamed from: a */
        public final DataInputStream f150920a;

        /* JADX INFO: renamed from: b */
        public ByteOrder f150921b;

        /* JADX INFO: renamed from: c */
        public int f150922c;

        /* JADX INFO: renamed from: d */
        public byte[] f150923d;

        public C19314b(InputStream inputStream, ByteOrder byteOrder) throws IOException {
            this.f150921b = ByteOrder.BIG_ENDIAN;
            DataInputStream dataInputStream = new DataInputStream(inputStream);
            this.f150920a = dataInputStream;
            dataInputStream.mark(0);
            this.f150922c = 0;
            this.f150921b = byteOrder;
        }

        @Override // java.io.InputStream
        public int available() throws IOException {
            return this.f150920a.available();
        }

        /* JADX INFO: renamed from: k */
        public int m171102k() {
            return this.f150922c;
        }

        /* JADX INFO: renamed from: m */
        public long m171103m() throws IOException {
            return ((long) readInt()) & 4294967295L;
        }

        @Override // java.io.InputStream
        public void mark(int i) {
            throw new UnsupportedOperationException("Mark is currently unsupported");
        }

        /* JADX INFO: renamed from: n */
        public void m171104n(ByteOrder byteOrder) {
            this.f150921b = byteOrder;
        }

        /* JADX INFO: renamed from: q */
        public void m171105q(int i) throws IOException {
            int i2 = 0;
            while (i2 < i) {
                int i3 = i - i2;
                int iSkip = (int) this.f150920a.skip(i3);
                if (iSkip <= 0) {
                    if (this.f150923d == null) {
                        this.f150923d = new byte[8192];
                    }
                    iSkip = this.f150920a.read(this.f150923d, 0, Math.min(8192, i3));
                    if (iSkip == -1) {
                        throw new EOFException("Reached EOF while skipping " + i + " bytes.");
                    }
                }
                i2 += iSkip;
            }
            this.f150922c += i2;
        }

        @Override // java.io.InputStream
        public int read() throws IOException {
            this.f150922c++;
            return this.f150920a.read();
        }

        @Override // java.io.DataInput
        public boolean readBoolean() throws IOException {
            this.f150922c++;
            return this.f150920a.readBoolean();
        }

        @Override // java.io.DataInput
        public byte readByte() throws IOException {
            this.f150922c++;
            int i = this.f150920a.read();
            if (i >= 0) {
                return (byte) i;
            }
            vg3.m201207a();
            return (byte) 0;
        }

        @Override // java.io.DataInput
        public char readChar() throws IOException {
            this.f150922c += 2;
            return this.f150920a.readChar();
        }

        @Override // java.io.DataInput
        public double readDouble() throws IOException {
            return Double.longBitsToDouble(readLong());
        }

        @Override // java.io.DataInput
        public float readFloat() throws IOException {
            return Float.intBitsToFloat(readInt());
        }

        @Override // java.io.DataInput
        public void readFully(byte[] bArr) throws IOException {
            this.f150922c += bArr.length;
            this.f150920a.readFully(bArr);
        }

        @Override // java.io.DataInput
        public int readInt() throws IOException {
            this.f150922c += 4;
            int i = this.f150920a.read();
            int i2 = this.f150920a.read();
            int i3 = this.f150920a.read();
            int i4 = this.f150920a.read();
            if ((i | i2 | i3 | i4) < 0) {
                vg3.m201207a();
                return 0;
            }
            ByteOrder byteOrder = this.f150921b;
            if (byteOrder == f150918e) {
                return (i4 << 24) + (i3 << 16) + (i2 << 8) + i;
            }
            if (byteOrder == f150919f) {
                return (i << 24) + (i2 << 16) + (i3 << 8) + i4;
            }
            rr10.m182681a("Invalid byte order: ", this.f150921b);
            return 0;
        }

        @Override // java.io.DataInput
        public String readLine() throws IOException {
            return null;
        }

        @Override // java.io.DataInput
        public long readLong() throws IOException {
            this.f150922c += 8;
            int i = this.f150920a.read();
            int i2 = this.f150920a.read();
            int i3 = this.f150920a.read();
            int i4 = this.f150920a.read();
            int i5 = this.f150920a.read();
            int i6 = this.f150920a.read();
            int i7 = this.f150920a.read();
            int i8 = this.f150920a.read();
            if ((i | i2 | i3 | i4 | i5 | i6 | i7 | i8) < 0) {
                vg3.m201207a();
                return 0L;
            }
            ByteOrder byteOrder = this.f150921b;
            if (byteOrder == f150918e) {
                return (((long) i8) << 56) + (((long) i7) << 48) + (((long) i6) << 40) + (((long) i5) << 32) + (((long) i4) << 24) + (((long) i3) << 16) + (((long) i2) << 8) + ((long) i);
            }
            if (byteOrder == f150919f) {
                return (((long) i) << 56) + (((long) i2) << 48) + (((long) i3) << 40) + (((long) i4) << 32) + (((long) i5) << 24) + (((long) i6) << 16) + (((long) i7) << 8) + ((long) i8);
            }
            rr10.m182681a("Invalid byte order: ", this.f150921b);
            return 0L;
        }

        @Override // java.io.DataInput
        public short readShort() throws IOException {
            this.f150922c += 2;
            int i = this.f150920a.read();
            int i2 = this.f150920a.read();
            if ((i | i2) < 0) {
                vg3.m201207a();
                return (short) 0;
            }
            ByteOrder byteOrder = this.f150921b;
            if (byteOrder == f150918e) {
                return (short) ((i2 << 8) + i);
            }
            if (byteOrder == f150919f) {
                return (short) ((i << 8) + i2);
            }
            rr10.m182681a("Invalid byte order: ", this.f150921b);
            return (short) 0;
        }

        @Override // java.io.DataInput
        public String readUTF() throws IOException {
            this.f150922c += 2;
            return this.f150920a.readUTF();
        }

        @Override // java.io.DataInput
        public int readUnsignedByte() throws IOException {
            this.f150922c++;
            return this.f150920a.readUnsignedByte();
        }

        @Override // java.io.DataInput
        public int readUnsignedShort() throws IOException {
            this.f150922c += 2;
            int i = this.f150920a.read();
            int i2 = this.f150920a.read();
            if ((i | i2) < 0) {
                vg3.m201207a();
                return 0;
            }
            ByteOrder byteOrder = this.f150921b;
            if (byteOrder == f150918e) {
                return (i2 << 8) + i;
            }
            if (byteOrder == f150919f) {
                return (i << 8) + i2;
            }
            rr10.m182681a("Invalid byte order: ", this.f150921b);
            return 0;
        }

        @Override // java.io.InputStream
        public void reset() {
            throw new UnsupportedOperationException("Reset is currently unsupported");
        }

        @Override // java.io.DataInput
        public int skipBytes(int i) throws IOException {
            throw new UnsupportedOperationException("skipBytes is currently unsupported");
        }

        @Override // java.io.DataInput
        public void readFully(byte[] bArr, int i, int i2) throws IOException {
            this.f150922c += i2;
            this.f150920a.readFully(bArr, i, i2);
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i, int i2) throws IOException {
            int i3 = this.f150920a.read(bArr, i, i2);
            this.f150922c += i3;
            return i3;
        }

        public C19314b(InputStream inputStream) throws IOException {
            this(inputStream, ByteOrder.BIG_ENDIAN);
        }

        public C19314b(byte[] bArr) throws IOException {
            this(new ByteArrayInputStream(bArr), ByteOrder.BIG_ENDIAN);
        }
    }

    /* JADX INFO: renamed from: l.p7f$d */
    public static class C19316d {

        /* JADX INFO: renamed from: a */
        public final int f150926a;

        /* JADX INFO: renamed from: b */
        public final int f150927b;

        /* JADX INFO: renamed from: c */
        public final long f150928c;

        /* JADX INFO: renamed from: d */
        public final byte[] f150929d;

        public C19316d(int i, int i2, long j, byte[] bArr) {
            this.f150926a = i;
            this.f150927b = i2;
            this.f150928c = j;
            this.f150929d = bArr;
        }

        /* JADX INFO: renamed from: a */
        public static C19316d m171112a(String str) {
            if (str.length() == 1 && str.charAt(0) >= '0' && str.charAt(0) <= '1') {
                return new C19316d(1, 1, new byte[]{(byte) (str.charAt(0) - '0')});
            }
            byte[] bytes = str.getBytes(p7f.ASCII);
            return new C19316d(1, bytes.length, bytes);
        }

        /* JADX INFO: renamed from: b */
        public static C19316d m171113b(double[] dArr, ByteOrder byteOrder) {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[p7f.IFD_FORMAT_BYTES_PER_FORMAT[12] * dArr.length]);
            byteBufferWrap.order(byteOrder);
            for (double d : dArr) {
                byteBufferWrap.putDouble(d);
            }
            return new C19316d(12, dArr.length, byteBufferWrap.array());
        }

        /* JADX INFO: renamed from: c */
        public static C19316d m171114c(int[] iArr, ByteOrder byteOrder) {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[p7f.IFD_FORMAT_BYTES_PER_FORMAT[9] * iArr.length]);
            byteBufferWrap.order(byteOrder);
            for (int i : iArr) {
                byteBufferWrap.putInt(i);
            }
            return new C19316d(9, iArr.length, byteBufferWrap.array());
        }

        /* JADX INFO: renamed from: d */
        public static C19316d m171115d(C19318f[] c19318fArr, ByteOrder byteOrder) {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[p7f.IFD_FORMAT_BYTES_PER_FORMAT[10] * c19318fArr.length]);
            byteBufferWrap.order(byteOrder);
            for (C19318f c19318f : c19318fArr) {
                byteBufferWrap.putInt((int) c19318f.f150934a);
                byteBufferWrap.putInt((int) c19318f.f150935b);
            }
            return new C19316d(10, c19318fArr.length, byteBufferWrap.array());
        }

        /* JADX INFO: renamed from: e */
        public static C19316d m171116e(String str) {
            byte[] bytes = (str + (char) 0).getBytes(p7f.ASCII);
            return new C19316d(2, bytes.length, bytes);
        }

        /* JADX INFO: renamed from: f */
        public static C19316d m171117f(long j, ByteOrder byteOrder) {
            return m171118g(new long[]{j}, byteOrder);
        }

        /* JADX INFO: renamed from: g */
        public static C19316d m171118g(long[] jArr, ByteOrder byteOrder) {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[p7f.IFD_FORMAT_BYTES_PER_FORMAT[4] * jArr.length]);
            byteBufferWrap.order(byteOrder);
            for (long j : jArr) {
                byteBufferWrap.putInt((int) j);
            }
            return new C19316d(4, jArr.length, byteBufferWrap.array());
        }

        /* JADX INFO: renamed from: h */
        public static C19316d m171119h(C19318f c19318f, ByteOrder byteOrder) {
            return m171120i(new C19318f[]{c19318f}, byteOrder);
        }

        /* JADX INFO: renamed from: i */
        public static C19316d m171120i(C19318f[] c19318fArr, ByteOrder byteOrder) {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[p7f.IFD_FORMAT_BYTES_PER_FORMAT[5] * c19318fArr.length]);
            byteBufferWrap.order(byteOrder);
            for (C19318f c19318f : c19318fArr) {
                byteBufferWrap.putInt((int) c19318f.f150934a);
                byteBufferWrap.putInt((int) c19318f.f150935b);
            }
            return new C19316d(5, c19318fArr.length, byteBufferWrap.array());
        }

        /* JADX INFO: renamed from: j */
        public static C19316d m171121j(int i, ByteOrder byteOrder) {
            return m171122k(new int[]{i}, byteOrder);
        }

        /* JADX INFO: renamed from: k */
        public static C19316d m171122k(int[] iArr, ByteOrder byteOrder) {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[p7f.IFD_FORMAT_BYTES_PER_FORMAT[3] * iArr.length]);
            byteBufferWrap.order(byteOrder);
            for (int i : iArr) {
                byteBufferWrap.putShort((short) i);
            }
            return new C19316d(3, iArr.length, byteBufferWrap.array());
        }

        /* JADX INFO: renamed from: l */
        public double m171123l(ByteOrder byteOrder) throws Throwable {
            Object objM171126o = m171126o(byteOrder);
            if (objM171126o == null) {
                throw new NumberFormatException("NULL can't be converted to a double value");
            }
            if (objM171126o instanceof String) {
                return Double.parseDouble((String) objM171126o);
            }
            if (objM171126o instanceof long[]) {
                long[] jArr = (long[]) objM171126o;
                if (jArr.length == 1) {
                    return jArr[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            if (objM171126o instanceof int[]) {
                int[] iArr = (int[]) objM171126o;
                if (iArr.length == 1) {
                    return iArr[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            if (objM171126o instanceof double[]) {
                double[] dArr = (double[]) objM171126o;
                if (dArr.length == 1) {
                    return dArr[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            if (!(objM171126o instanceof C19318f[])) {
                throw new NumberFormatException("Couldn't find a double value");
            }
            C19318f[] c19318fArr = (C19318f[]) objM171126o;
            if (c19318fArr.length == 1) {
                return c19318fArr[0].m171129a();
            }
            throw new NumberFormatException("There are more than one component");
        }

        /* JADX INFO: renamed from: m */
        public int m171124m(ByteOrder byteOrder) throws Throwable {
            Object objM171126o = m171126o(byteOrder);
            if (objM171126o == null) {
                throw new NumberFormatException("NULL can't be converted to a integer value");
            }
            if (objM171126o instanceof String) {
                return Integer.parseInt((String) objM171126o);
            }
            if (objM171126o instanceof long[]) {
                long[] jArr = (long[]) objM171126o;
                if (jArr.length == 1) {
                    return (int) jArr[0];
                }
                throw new NumberFormatException("There are more than one component");
            }
            if (!(objM171126o instanceof int[])) {
                throw new NumberFormatException("Couldn't find a integer value");
            }
            int[] iArr = (int[]) objM171126o;
            if (iArr.length == 1) {
                return iArr[0];
            }
            throw new NumberFormatException("There are more than one component");
        }

        /* JADX INFO: renamed from: n */
        public String m171125n(ByteOrder byteOrder) throws Throwable {
            Object objM171126o = m171126o(byteOrder);
            if (objM171126o == null) {
                return null;
            }
            if (objM171126o instanceof String) {
                return (String) objM171126o;
            }
            StringBuilder sb = new StringBuilder();
            int i = 0;
            if (objM171126o instanceof long[]) {
                long[] jArr = (long[]) objM171126o;
                while (i < jArr.length) {
                    sb.append(jArr[i]);
                    i++;
                    if (i != jArr.length) {
                        sb.append(Constants.SEPARATOR_COMMA);
                    }
                }
                return sb.toString();
            }
            if (objM171126o instanceof int[]) {
                int[] iArr = (int[]) objM171126o;
                while (i < iArr.length) {
                    sb.append(iArr[i]);
                    i++;
                    if (i != iArr.length) {
                        sb.append(Constants.SEPARATOR_COMMA);
                    }
                }
                return sb.toString();
            }
            if (objM171126o instanceof double[]) {
                double[] dArr = (double[]) objM171126o;
                while (i < dArr.length) {
                    sb.append(dArr[i]);
                    i++;
                    if (i != dArr.length) {
                        sb.append(Constants.SEPARATOR_COMMA);
                    }
                }
                return sb.toString();
            }
            if (!(objM171126o instanceof C19318f[])) {
                return null;
            }
            C19318f[] c19318fArr = (C19318f[]) objM171126o;
            while (i < c19318fArr.length) {
                sb.append(c19318fArr[i].f150934a);
                sb.append('/');
                sb.append(c19318fArr[i].f150935b);
                i++;
                if (i != c19318fArr.length) {
                    sb.append(Constants.SEPARATOR_COMMA);
                }
            }
            return sb.toString();
        }

        /* JADX INFO: renamed from: o */
        public Object m171126o(ByteOrder byteOrder) throws Throwable {
            C19314b c19314b;
            byte b;
            String str;
            byte b2;
            Object str2;
            C19314b c19314b2 = null;
            try {
                c19314b = new C19314b(this.f150929d);
                try {
                    c19314b.m171104n(byteOrder);
                    int length = 0;
                    switch (this.f150926a) {
                        case 1:
                        case 6:
                            byte[] bArr = this.f150929d;
                            if (bArr.length != 1 || (b = bArr[0]) < 0 || b > 1) {
                                str2 = new String(bArr, p7f.ASCII);
                                try {
                                    c19314b.close();
                                    return str2;
                                } catch (IOException e) {
                                    Log.e(p7f.TAG, "IOException occurred while closing InputStream", e);
                                    return str2;
                                }
                            }
                            str = new String(new char[]{(char) (b + 48)});
                            try {
                                c19314b.close();
                                return str;
                            } catch (IOException e2) {
                                Log.e(p7f.TAG, "IOException occurred while closing InputStream", e2);
                                return str;
                            }
                        case 2:
                        case 7:
                            if (this.f150927b >= p7f.EXIF_ASCII_PREFIX.length) {
                                int i = 0;
                                while (true) {
                                    byte[] bArr2 = p7f.EXIF_ASCII_PREFIX;
                                    if (i >= bArr2.length) {
                                        length = bArr2.length;
                                    } else if (this.f150929d[i] == bArr2[i]) {
                                        i++;
                                    }
                                }
                            }
                            StringBuilder sb = new StringBuilder();
                            while (length < this.f150927b && (b2 = this.f150929d[length]) != 0) {
                                if (b2 >= 32) {
                                    sb.append((char) b2);
                                } else {
                                    sb.append('?');
                                }
                                length++;
                            }
                            str = sb.toString();
                            c19314b.close();
                            return str;
                        case 3:
                            int[] iArr = new int[this.f150927b];
                            while (true) {
                                str2 = iArr;
                                if (length < this.f150927b) {
                                    iArr[length] = c19314b.readUnsignedShort();
                                    length++;
                                }
                                c19314b.close();
                                return str2;
                            }
                        case 4:
                            long[] jArr = new long[this.f150927b];
                            while (true) {
                                str2 = jArr;
                                if (length < this.f150927b) {
                                    jArr[length] = c19314b.m171103m();
                                    length++;
                                }
                                c19314b.close();
                                return str2;
                            }
                        case 5:
                            C19318f[] c19318fArr = new C19318f[this.f150927b];
                            while (true) {
                                str2 = c19318fArr;
                                if (length < this.f150927b) {
                                    c19318fArr[length] = new C19318f(c19314b.m171103m(), c19314b.m171103m());
                                    length++;
                                }
                                c19314b.close();
                                return str2;
                            }
                        case 8:
                            int[] iArr2 = new int[this.f150927b];
                            while (true) {
                                str2 = iArr2;
                                if (length < this.f150927b) {
                                    iArr2[length] = c19314b.readShort();
                                    length++;
                                }
                                c19314b.close();
                                return str2;
                            }
                        case 9:
                            int[] iArr3 = new int[this.f150927b];
                            while (true) {
                                str2 = iArr3;
                                if (length < this.f150927b) {
                                    iArr3[length] = c19314b.readInt();
                                    length++;
                                }
                                c19314b.close();
                                return str2;
                            }
                        case 10:
                            C19318f[] c19318fArr2 = new C19318f[this.f150927b];
                            while (true) {
                                str2 = c19318fArr2;
                                if (length < this.f150927b) {
                                    c19318fArr2[length] = new C19318f(c19314b.readInt(), c19314b.readInt());
                                    length++;
                                }
                                c19314b.close();
                                return str2;
                            }
                        case 11:
                            double[] dArr = new double[this.f150927b];
                            while (true) {
                                str2 = dArr;
                                if (length < this.f150927b) {
                                    dArr[length] = c19314b.readFloat();
                                    length++;
                                }
                                c19314b.close();
                                return str2;
                            }
                        case 12:
                            double[] dArr2 = new double[this.f150927b];
                            while (true) {
                                str2 = dArr2;
                                if (length < this.f150927b) {
                                    dArr2[length] = c19314b.readDouble();
                                    length++;
                                }
                                c19314b.close();
                                return str2;
                            }
                        default:
                            try {
                                c19314b.close();
                                return null;
                            } catch (IOException e3) {
                                Log.e(p7f.TAG, "IOException occurred while closing InputStream", e3);
                                return null;
                            }
                    }
                } catch (IOException unused) {
                    if (c19314b != null) {
                        try {
                            c19314b.close();
                        } catch (IOException e4) {
                            Log.e(p7f.TAG, "IOException occurred while closing InputStream", e4);
                        }
                    }
                    return null;
                } catch (Throwable th) {
                    th = th;
                    c19314b2 = c19314b;
                    if (c19314b2 != null) {
                        try {
                            c19314b2.close();
                        } catch (IOException e5) {
                            Log.e(p7f.TAG, "IOException occurred while closing InputStream", e5);
                        }
                    }
                    throw th;
                }
            } catch (IOException unused2) {
                c19314b = null;
            } catch (Throwable th2) {
                th = th2;
            }
        }

        /* JADX INFO: renamed from: p */
        public int m171127p() {
            return p7f.IFD_FORMAT_BYTES_PER_FORMAT[this.f150926a] * this.f150927b;
        }

        public String toString() {
            return "(" + p7f.IFD_FORMAT_NAMES[this.f150926a] + ", data length:" + this.f150929d.length + ")";
        }

        public C19316d(int i, int i2, byte[] bArr) {
            this(i, i2, -1L, bArr);
        }
    }

    /* JADX INFO: renamed from: l.p7f$e */
    public static class C19317e {

        /* JADX INFO: renamed from: a */
        public final int f150930a;

        /* JADX INFO: renamed from: b */
        public final String f150931b;

        /* JADX INFO: renamed from: c */
        public final int f150932c;

        /* JADX INFO: renamed from: d */
        public final int f150933d;

        public C19317e(String str, int i, int i2) {
            this.f150931b = str;
            this.f150930a = i;
            this.f150932c = i2;
            this.f150933d = -1;
        }

        /* JADX INFO: renamed from: a */
        public boolean m171128a(int i) {
            int i2;
            int i3 = this.f150932c;
            if (i3 == 7 || i == 7 || i3 == i || (i2 = this.f150933d) == i) {
                return true;
            }
            if ((i3 == 4 || i2 == 4) && i == 3) {
                return true;
            }
            if ((i3 == 9 || i2 == 9) && i == 8) {
                return true;
            }
            return (i3 == 12 || i2 == 12) && i == 11;
        }

        public C19317e(String str, int i, int i2, int i3) {
            this.f150931b = str;
            this.f150930a = i;
            this.f150932c = i2;
            this.f150933d = i3;
        }
    }

    /* JADX INFO: renamed from: l.p7f$a */
    public class C19313a extends MediaDataSource {

        /* JADX INFO: renamed from: a */
        public long f150915a;

        /* JADX INFO: renamed from: b */
        public final /* synthetic */ C19319g f150916b;

        public C19313a(C19319g c19319g) {
            this.f150916b = c19319g;
        }

        @Override // android.media.MediaDataSource
        public long getSize() throws IOException {
            return -1L;
        }

        @Override // android.media.MediaDataSource
        public int readAt(long j, byte[] bArr, int i, int i2) throws IOException {
            if (i2 == 0) {
                return 0;
            }
            if (j < 0) {
                return -1;
            }
            try {
                long j2 = this.f150915a;
                if (j2 != j) {
                    if (j2 >= 0 && j >= j2 + ((long) this.f150916b.available())) {
                        return -1;
                    }
                    this.f150916b.m171130t(j);
                    this.f150915a = j;
                }
                if (i2 > this.f150916b.available()) {
                    i2 = this.f150916b.available();
                }
                int i3 = this.f150916b.read(bArr, i, i2);
                if (i3 >= 0) {
                    this.f150915a += (long) i3;
                    return i3;
                }
            } catch (IOException unused) {
            }
            this.f150915a = -1L;
            return -1;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
        }
    }

    /* JADX INFO: renamed from: l.p7f$f */
    public static class C19318f {

        /* JADX INFO: renamed from: a */
        public final long f150934a;

        /* JADX INFO: renamed from: b */
        public final long f150935b;

        public C19318f(long j, long j2) {
            if (j2 == 0) {
                this.f150934a = 0L;
                this.f150935b = 1L;
            } else {
                this.f150934a = j;
                this.f150935b = j2;
            }
        }

        /* JADX INFO: renamed from: a */
        public double m171129a() {
            return this.f150934a / this.f150935b;
        }

        public String toString() {
            return this.f150934a + "/" + this.f150935b;
        }

        public C19318f(double d) {
            this((long) (d * 10000.0d), 10000L);
        }
    }

    /* JADX INFO: renamed from: l.p7f$g */
    public static class C19319g extends C19314b {
        public C19319g(InputStream inputStream) throws IOException {
            super(inputStream);
            if (inputStream.markSupported()) {
                this.f150920a.mark(Api.BaseClientBuilder.API_PRIORITY_OTHER);
            } else {
                wg3.m206174a("Cannot create SeekableByteOrderedDataInputStream with stream that does not support mark/reset");
                throw null;
            }
        }

        /* JADX INFO: renamed from: t */
        public void m171130t(long j) throws IOException {
            int i = this.f150922c;
            if (i > j) {
                this.f150922c = 0;
                this.f150920a.reset();
            } else {
                j -= (long) i;
            }
            m171105q((int) j);
        }

        public C19319g(byte[] bArr) throws IOException {
            super(bArr);
            this.f150920a.mark(Api.BaseClientBuilder.API_PRIORITY_OTHER);
        }
    }

    @Deprecated
    public boolean getLatLong(float[] fArr) {
        double[] latLong = getLatLong();
        if (latLong == null) {
            return false;
        }
        fArr[0] = (float) latLong[0];
        fArr[1] = (float) latLong[1];
        return true;
    }

    public p7f(@NonNull String str) throws Throwable {
        C19317e[][] c19317eArr = EXIF_TAGS;
        this.mAttributes = new HashMap[c19317eArr.length];
        this.mAttributesOffsets = new HashSet(c19317eArr.length);
        this.mExifByteOrder = ByteOrder.BIG_ENDIAN;
        if (str != null) {
            initForFilename(str);
        } else {
            mnd0.m159157a("filename cannot be null");
            throw null;
        }
    }

    public p7f(@NonNull FileDescriptor fileDescriptor) throws Throwable {
        boolean z;
        C19317e[][] c19317eArr = EXIF_TAGS;
        this.mAttributes = new HashMap[c19317eArr.length];
        this.mAttributesOffsets = new HashSet(c19317eArr.length);
        this.mExifByteOrder = ByteOrder.BIG_ENDIAN;
        FileInputStream fileInputStream = null;
        if (fileDescriptor != null) {
            this.mAssetInputStream = null;
            this.mFilename = null;
            if (isSeekableFD(fileDescriptor)) {
                this.mSeekableFileDescriptor = fileDescriptor;
                try {
                    fileDescriptor = r7f.C19785a.m180138b(fileDescriptor);
                    z = true;
                } catch (Exception e) {
                    throw new IOException("Failed to duplicate file descriptor", e);
                }
            } else {
                this.mSeekableFileDescriptor = null;
                z = false;
            }
            try {
                FileInputStream fileInputStream2 = new FileInputStream(fileDescriptor);
                try {
                    loadAttributes(fileInputStream2);
                    r7f.m180131c(fileInputStream2);
                    if (z) {
                        r7f.m180130b(fileDescriptor);
                    }
                } catch (Throwable th) {
                    th = th;
                    fileInputStream = fileInputStream2;
                    r7f.m180131c(fileInputStream);
                    if (z) {
                        r7f.m180130b(fileDescriptor);
                    }
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } else {
            mnd0.m159157a("fileDescriptor cannot be null");
            throw null;
        }
    }

    public p7f(@NonNull InputStream inputStream) throws IOException {
        this(inputStream, 0);
    }

    public p7f(@NonNull File file) throws Throwable {
        C19317e[][] c19317eArr = EXIF_TAGS;
        this.mAttributes = new HashMap[c19317eArr.length];
        this.mAttributesOffsets = new HashSet(c19317eArr.length);
        this.mExifByteOrder = ByteOrder.BIG_ENDIAN;
        if (file != null) {
            initForFilename(file.getAbsolutePath());
        } else {
            mnd0.m159157a("file cannot be null");
            throw null;
        }
    }
}
