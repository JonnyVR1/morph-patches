package com.p051p1.mobile.putong.data;

import android.text.TextUtils;
import com.google.firebase.remoteconfig.FirebaseRemoteConfig;
import com.p051p1.mobile.putong.core.data.FaceidToken;
import com.tantanapp.common.data.ConvertedJsonAdapter;
import com.tantanapp.common.data.JsonAdapter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import p153l.jyb;

/* JADX INFO: loaded from: classes12.dex */
public class Converter {
    public static final JsonAdapter<AIPosition> AIPOSITION;
    public static final JsonAdapter<Double> API_DATE_BOXED;
    public static final JsonAdapter<Double> API_TIME;
    public static final ThreadLocal<GregorianCalendar> CALENDAR;
    private static final ThreadLocal<SimpleDateFormat> DATE_FORMAT;
    public static final JsonAdapter<Dimension> DIMENSION;
    public static final JsonAdapter<DoublePair> DOUBLE_PAIR;
    public static final JsonAdapter<String> FACEID_ID;
    public static final JsonAdapter<String> GROUP_ID;
    public static final JsonAdapter<String> MOMENT_ID;
    public static final JsonAdapter<String> MPQ_ID;
    public static final JsonAdapter<String> PACKAGE_ID;
    public static final JsonAdapter<String> QUESTION_ID;
    public static final JsonAdapter<Media> RAW_PICTURE_TO_MEDIA;
    public static final JsonAdapter<Picture> RAW_PICTURE_TO_PICTURE;
    public static final JsonAdapter<String> SCENARIO_ID;
    public static final JsonAdapter<String> SCHOOL_ID;
    public static final JsonAdapter<String> STICKER_ID;
    private static final ThreadLocal<SimpleDateFormat> TIME_FORMAT;
    public static final JsonAdapter<String> USER_ID;
    public static final JsonAdapter<String> USER_ID_FROM_ARRAY_OF_BOXED;

    public static class GroupIdBoxedConverter extends IdBoxedConverter {
        public GroupIdBoxedConverter(String str) {
            super(str);
        }

        @Override // com.p1.mobile.putong.data.Converter.IdBoxedConverter, com.tantanapp.common.data.ConvertedJsonAdapter
        /* JADX INFO: renamed from: to, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
        public String mo60910to(IdBoxed idBoxed) {
            return "group".equals(idBoxed.type) ? idBoxed.f39607id : super.mo60910to(idBoxed);
        }
    }

    public static class IdBoxedConverter extends ConvertedJsonAdapter<IdBoxed, String> {
        private final String type;

        public IdBoxedConverter(String str) {
            super(IdBoxed.JSON_ADAPTER);
            this.type = str;
        }

        @Override // com.tantanapp.common.data.ConvertedJsonAdapter
        public IdBoxed from(String str) {
            if (str == null) {
                return null;
            }
            return new IdBoxed(str, this.type);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // com.tantanapp.common.data.ConvertedJsonAdapter
        /* JADX INFO: renamed from: to */
        public String mo60910to(IdBoxed idBoxed) {
            if (idBoxed == null || !this.type.equals(idBoxed.type)) {
                return null;
            }
            return idBoxed.f39607id;
        }
    }

    static {
        JsonAdapter<Integer> jsonAdapter = JsonAdapter.INT_ADAPTER;
        DIMENSION = new ConvertedJsonAdapter<List<Integer>, Dimension>(JsonAdapter.ARRAY_ADAPTER(jsonAdapter)) { // from class: com.p1.mobile.putong.data.Converter.1
            @Override // com.tantanapp.common.data.ConvertedJsonAdapter
            public List<Integer> from(Dimension dimension) {
                if (dimension == null) {
                    return null;
                }
                return jyb.m147507f0(Integer.valueOf(dimension.width), Integer.valueOf(dimension.height));
            }

            @Override // com.tantanapp.common.data.ConvertedJsonAdapter
            /* JADX INFO: renamed from: to, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
            public Dimension mo60910to(List<Integer> list) {
                if (list == null || list.size() < 2) {
                    return null;
                }
                return new Dimension(list.get(0).intValue(), list.get(1).intValue());
            }
        };
        AIPOSITION = new ConvertedJsonAdapter<List<Integer>, AIPosition>(JsonAdapter.ARRAY_ADAPTER(jsonAdapter)) { // from class: com.p1.mobile.putong.data.Converter.2
            @Override // com.tantanapp.common.data.ConvertedJsonAdapter
            public List<Integer> from(AIPosition aIPosition) {
                if (aIPosition == null) {
                    return null;
                }
                return jyb.m147507f0(Integer.valueOf(aIPosition.f39565x), Integer.valueOf(aIPosition.f39566y));
            }

            @Override // com.tantanapp.common.data.ConvertedJsonAdapter
            /* JADX INFO: renamed from: to, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
            public AIPosition mo60910to(List<Integer> list) {
                if (list == null || list.size() < 2) {
                    return null;
                }
                return new AIPosition(list.get(0).intValue(), list.get(1).intValue());
            }
        };
        DOUBLE_PAIR = new ConvertedJsonAdapter<List<Double>, DoublePair>(JsonAdapter.ARRAY_ADAPTER(JsonAdapter.DOUBLE_ADAPTER)) { // from class: com.p1.mobile.putong.data.Converter.3
            @Override // com.tantanapp.common.data.ConvertedJsonAdapter
            public List<Double> from(DoublePair doublePair) {
                if (doublePair == null) {
                    return null;
                }
                return doublePair.isEmpty ? new ArrayList() : jyb.m147507f0(Double.valueOf(doublePair.first), Double.valueOf(doublePair.second));
            }

            @Override // com.tantanapp.common.data.ConvertedJsonAdapter
            /* JADX INFO: renamed from: to, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
            public DoublePair mo60910to(List<Double> list) {
                if (list == null || list.size() < 2) {
                    return null;
                }
                return new DoublePair(list.get(0).doubleValue(), list.get(1).doubleValue());
            }
        };
        USER_ID_FROM_ARRAY_OF_BOXED = new ConvertedJsonAdapter<List<IdBoxed>, String>(JsonAdapter.ARRAY_ADAPTER(IdBoxed.JSON_ADAPTER)) { // from class: com.p1.mobile.putong.data.Converter.4
            @Override // com.tantanapp.common.data.ConvertedJsonAdapter
            public List<IdBoxed> from(String str) {
                if (str == null) {
                    return null;
                }
                return jyb.m147507f0(new IdBoxed(str, "user"));
            }

            @Override // com.tantanapp.common.data.ConvertedJsonAdapter
            /* JADX INFO: renamed from: to, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
            public String mo60910to(List<IdBoxed> list) {
                if (list == null || list.isEmpty() || !list.get(0).type.equals("user")) {
                    return null;
                }
                return list.get(0).f39607id;
            }
        };
        QUESTION_ID = new IdBoxedConverter("question");
        USER_ID = new IdBoxedConverter("user");
        PACKAGE_ID = new IdBoxedConverter("package");
        STICKER_ID = new IdBoxedConverter("sticker");
        MOMENT_ID = new IdBoxedConverter("moment");
        SCENARIO_ID = new IdBoxedConverter(MatchFrom.scenario);
        SCHOOL_ID = new IdBoxedConverter("school");
        MPQ_ID = new IdBoxedConverter(PrivateAnswer.REAL_TYPE);
        FACEID_ID = new IdBoxedConverter(FaceidToken.TYPE);
        GROUP_ID = new GroupIdBoxedConverter("user");
        JsonAdapter<String> jsonAdapter2 = JsonAdapter.STRING_ADAPTER;
        API_TIME = new ConvertedJsonAdapter<String, Double>(jsonAdapter2) { // from class: com.p1.mobile.putong.data.Converter.5
            @Override // com.tantanapp.common.data.ConvertedJsonAdapter
            public String from(Double d) {
                if (d == null) {
                    return null;
                }
                return Converter.dateToApiTimeString(d.doubleValue());
            }

            @Override // com.tantanapp.common.data.ConvertedJsonAdapter
            /* JADX INFO: renamed from: to, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
            public Double mo60910to(String str) {
                return str == null ? Double.valueOf(Double.MIN_VALUE) : Double.valueOf(Converter.apiTimeStringToDate(str));
            }
        };
        API_DATE_BOXED = new ConvertedJsonAdapter<String, Double>(jsonAdapter2) { // from class: com.p1.mobile.putong.data.Converter.6
            @Override // com.tantanapp.common.data.ConvertedJsonAdapter
            public String from(Double d) {
                if (d == null) {
                    return null;
                }
                return Converter.dateToApiDateString(d.doubleValue());
            }

            @Override // com.tantanapp.common.data.ConvertedJsonAdapter
            /* JADX INFO: renamed from: to, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
            public Double mo60910to(String str) {
                return str == null ? Double.valueOf(Double.MIN_VALUE) : Double.valueOf(Converter.apiDateStringToDate(str));
            }
        };
        RAW_PICTURE_TO_MEDIA = new ConvertedJsonAdapter<RawPicture, Media>(RawPicture.JSON_ADAPTER) { // from class: com.p1.mobile.putong.data.Converter.7
            @Override // com.tantanapp.common.data.ConvertedJsonAdapter
            public RawPicture from(Media media) {
                if (media != null) {
                    return Converter.mediaToRawPicture(media);
                }
                return null;
            }

            @Override // com.tantanapp.common.data.ConvertedJsonAdapter
            /* JADX INFO: renamed from: to, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
            public Media mo60910to(RawPicture rawPicture) {
                if (rawPicture != null) {
                    return Converter.rawPictureToCorrectType(rawPicture);
                }
                return null;
            }
        };
        RAW_PICTURE_TO_PICTURE = new ConvertedJsonAdapter<RawPicture, Picture>(RawPicture.JSON_ADAPTER) { // from class: com.p1.mobile.putong.data.Converter.8
            @Override // com.tantanapp.common.data.ConvertedJsonAdapter
            public RawPicture from(Picture picture) {
                if (picture != null) {
                    return Converter.mediaToRawPicture(picture);
                }
                return null;
            }

            @Override // com.tantanapp.common.data.ConvertedJsonAdapter
            /* JADX INFO: renamed from: to, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
            public Picture mo60910to(RawPicture rawPicture) {
                if (rawPicture != null) {
                    return (Picture) Converter.rawPictureToCorrectPictureType(rawPicture);
                }
                return null;
            }
        };
        CALENDAR = new ThreadLocal<GregorianCalendar>() { // from class: com.p1.mobile.putong.data.Converter.9
            @Override // java.lang.ThreadLocal
            public GregorianCalendar initialValue() {
                return new GregorianCalendar(TimeZone.getTimeZone("UTC"), Locale.US);
            }
        };
        TIME_FORMAT = new ThreadLocal<SimpleDateFormat>() { // from class: com.p1.mobile.putong.data.Converter.10
            @Override // java.lang.ThreadLocal
            public SimpleDateFormat initialValue() {
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.US);
                simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
                return simpleDateFormat;
            }
        };
        DATE_FORMAT = new ThreadLocal<SimpleDateFormat>() { // from class: com.p1.mobile.putong.data.Converter.11
            @Override // java.lang.ThreadLocal
            public SimpleDateFormat initialValue() {
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd", Locale.US);
                simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
                return simpleDateFormat;
            }
        };
    }

    public static void addMediaAttrs(Media media, RawPicture rawPicture) {
        media.mediaType = rawPicture.mediaType;
        String str = rawPicture.url;
        media.url = str;
        media.urlKey = Media.URL_TO_CACHEKEY(str);
        media.name = rawPicture.name;
        MediaLocalStatus mediaLocalStatus = rawPicture.status;
        if (mediaLocalStatus == null) {
            media.status = MediaLocalStatus.get("normal");
        } else {
            media.status = mediaLocalStatus;
        }
        media.isPortrait = rawPicture.isPortrait;
        media.labels = rawPicture.labels;
    }

    public static double apiDateStringToDate(String str) {
        return TextUtils.isEmpty(str) ? FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE : customDateParse(str);
    }

    public static double apiTimeStringToDate(String str) {
        return TextUtils.isEmpty(str) ? FirebaseRemoteConfig.DEFAULT_VALUE_FOR_DOUBLE : customTimeParse(str);
    }

    private static double customDateParse(String str) {
        int i = Integer.parseInt(str.substring(0, 4));
        int i2 = Integer.parseInt(str.substring(5, 7));
        int i3 = Integer.parseInt(str.substring(8, 10));
        GregorianCalendar gregorianCalendar = CALENDAR.get();
        gregorianCalendar.set(i, i2 - 1, i3, 0, 0, 0);
        gregorianCalendar.set(14, 0);
        return gregorianCalendar.getTimeInMillis();
    }

    private static double customTimeParse(String str) {
        int i;
        int i2 = Integer.parseInt(str.substring(0, 4));
        int i3 = Integer.parseInt(str.substring(5, 7));
        int i4 = Integer.parseInt(str.substring(8, 10));
        int i5 = Integer.parseInt(str.substring(11, 13));
        int i6 = Integer.parseInt(str.substring(14, 16));
        int i7 = Integer.parseInt(str.substring(17, 19));
        if (str.length() <= 21 || str.length() > 26) {
            i = str.length() > 26 ? Integer.parseInt(str.substring(20, 26)) : 0;
        } else {
            i = Integer.parseInt(str.substring(20, str.length() - 1));
        }
        GregorianCalendar gregorianCalendar = CALENDAR.get();
        gregorianCalendar.set(i2, i3 - 1, i4, i5, i6, i7);
        gregorianCalendar.set(14, 0);
        return gregorianCalendar.getTimeInMillis() + ((((double) i) * 1.0d) / 1000.0d);
    }

    public static String dateToApiDateString(double d) {
        if (d != -231321.22322312d) {
            return DATE_FORMAT.get().format(new Date((long) d));
        }
        return null;
    }

    public static String dateToApiTimeString(double d) {
        if (d == -231321.22322312d) {
            return null;
        }
        long j = (long) d;
        String string = Long.toString(((j % 1000) * 1000) + Math.round((d - j) * 1000.0d));
        return TIME_FORMAT.get().format(new Date((j / 1000) * 1000)) + "." + "000000".substring(0, 6 - string.length()).concat(string) + "+0000";
    }

    public static RawPicture mediaToRawPicture(Media media) {
        Video video;
        Picture picture;
        RawPicture rawPicture = new RawPicture();
        if (!(media instanceof Video) || (picture = (video = (Video) media).cover) == null) {
            rawPicture.mediaType = media.mediaType;
            rawPicture.name = media.name;
            rawPicture.url = media.url;
            rawPicture.isPortrait = media.isPortrait;
            rawPicture.labels = media.labels;
            rawPicture.tags = media.tags;
            if (media instanceof Audio) {
                rawPicture.duration = ((Audio) media).duration;
            } else if (media instanceof Picture) {
                Picture picture2 = (Picture) media;
                rawPicture.size = picture2.size;
                rawPicture.aiPosition = picture2.aiPosition;
                if (picture2.attachments != null) {
                    rawPicture.attachments = new ArrayList();
                    int size = picture2.attachments.size();
                    for (int i = 0; i < size; i++) {
                        rawPicture.attachments.add(mediaToRawPicture(picture2.attachments.get(i)));
                    }
                }
                LivePhoto livePhoto = picture2.livePhoto;
                if (livePhoto != null) {
                    rawPicture.livePhoto = livePhoto;
                }
            } else if (media instanceof Video) {
                Video video2 = (Video) media;
                rawPicture.size = video2.size;
                rawPicture.duration = video2.duration;
            }
        } else {
            rawPicture.mediaType = picture.mediaType;
            rawPicture.name = picture.name;
            rawPicture.url = picture.url;
            rawPicture.size = picture.size;
            rawPicture.attachments = new ArrayList();
            RawPicture rawPicture2 = new RawPicture();
            rawPicture2.mediaType = video.mediaType;
            rawPicture2.name = video.name;
            rawPicture2.url = video.url;
            rawPicture2.size = video.size;
            rawPicture2.duration = video.duration;
            rawPicture2.tags = video.tags;
            rawPicture.attachments.add(rawPicture2);
            rawPicture2.audio = video.audio;
            rawPicture2.status = video.status;
            rawPicture2.gif = video.gif;
            rawPicture.tags = video.tags;
            rawPicture.isPortrait = video.isPortrait;
        }
        rawPicture.status = media.status;
        return rawPicture;
    }

    public static Media rawPictureToCorrectPictureType(RawPicture rawPicture) {
        List<RawPicture> list = rawPicture.attachments;
        if (list != null && list.size() > 0 && rawPicture.attachments.get(0).mediaType.contains("video")) {
            RawPicture rawPicture2 = rawPicture.attachments.get(0);
            Video video = new Video();
            Picture pictureNew_ = Picture.new_();
            video.cover = pictureNew_;
            pictureNew_.gaussianBlurParameters = rawPicture.gaussianBlurParameters;
            video.audio = rawPicture2.audio;
            video.gif = rawPicture2.gif;
            addMediaAttrs(pictureNew_, rawPicture);
            video.cover.size = rawPicture.size;
            video.tags = rawPicture.tags;
            addMediaAttrs(video, rawPicture2);
            video.duration = rawPicture2.duration;
            video.size = rawPicture2.size;
            video.isPortrait = rawPicture2.isPortrait;
            return video;
        }
        if (!rawPicture.mediaType.contains("image") && !rawPicture.mediaType.contains("svga")) {
            if (!rawPicture.mediaType.contains("video")) {
                return null;
            }
            Video video2 = new Video();
            video2.size = rawPicture.size;
            addMediaAttrs(video2, rawPicture);
            video2.duration = rawPicture.duration;
            video2.size = rawPicture.size;
            video2.tags = rawPicture.tags;
            video2.isPortrait = rawPicture.isPortrait;
            return video2;
        }
        Picture picture = new Picture();
        addMediaAttrs(picture, rawPicture);
        picture.size = rawPicture.size;
        picture.aiPosition = rawPicture.aiPosition;
        List<RawPicture> list2 = rawPicture.attachments;
        if (list2 != null && !list2.isEmpty()) {
            picture.attachments = new ArrayList();
            int size = rawPicture.attachments.size();
            for (int i = 0; i < size; i++) {
                Media mediaRawPictureToCorrectPictureType = rawPictureToCorrectPictureType(rawPicture.attachments.get(i));
                if (mediaRawPictureToCorrectPictureType instanceof Picture) {
                    picture.attachments.add((Picture) mediaRawPictureToCorrectPictureType);
                }
            }
        }
        LivePhoto livePhoto = rawPicture.livePhoto;
        if (livePhoto != null) {
            picture.livePhoto = livePhoto;
        }
        picture.gaussianBlurParameters = rawPicture.gaussianBlurParameters;
        picture.isPortrait = rawPicture.isPortrait;
        picture.tags = rawPicture.tags;
        return picture;
    }

    public static Media rawPictureToCorrectType(RawPicture rawPicture) {
        if (!rawPicture.mediaType.contains("audio")) {
            return rawPictureToCorrectPictureType(rawPicture);
        }
        Audio audio = new Audio();
        addMediaAttrs(audio, rawPicture);
        audio.duration = rawPicture.duration;
        return audio;
    }

    public static String dateToApiTimeString(long j) {
        if (j == -231321.22322312d) {
            return null;
        }
        String string = Long.toString((j % 1000) * 1000);
        return TIME_FORMAT.get().format(new Date((j / 1000) * 1000)) + "." + "000000".substring(0, 6 - string.length()).concat(string) + "+0000";
    }
}
