package com.p000p1.mobile.putong.data;

import android.graphics.Point;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.protobuf.nano.CodedOutputByteBufferNano;
import com.google.protobuf.nano.MessageNano;
import com.p000p1.mobile.putong.data.IdealTag;
import com.p000p1.mobile.putong.data.MediaLabel;
import com.p000p1.mobile.putong.data.Picture;
import com.p000p1.mobile.putong.data.tenum.TEnum;
import com.p1.mobile.android.app.App;
import com.p1.mobile.putong.remote_config.RemoteConfig;
import com.tantanapp.common.data.MessageNanoAdapter;
import com.tantanapp.common.data.ProtobufAdapter;
import com.tantanapp.common.data.ProtobufIndex;
import com.tantanapp.common.data.ValueObject;
import com.tantanapp.common.utils.NullChecker;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import l.j760;
import l.nb5;
import l.t100;
import l.vwb;
import l.w9j;
import l.wc40;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes12.dex */
public class Picture extends Media implements Cloneable, Serializable {
    public static final int FORMAT_BLUR = 3;
    public static final int FORMAT_MAX = 1;
    public static final int FORMAT_NO = 0;
    public static final int FORMAT_SQUARE = 2;
    public static final String TYPE = "picture";

    @NonNull
    @ProtobufIndex(index = 52)
    public AIPosition aiPosition;

    @Nullable
    @ProtobufIndex(index = 53)
    public List<Picture> attachments;

    @Nullable
    @ProtobufIndex(index = 54)
    public GaussianBlurParameters gaussianBlurParameters;

    @Nullable
    @ProtobufIndex(index = 56)
    public LivePhoto livePhoto;

    @NonNull
    @ProtobufIndex(index = 51)
    public Dimension size;
    public static final Picture EMPTY = new_();
    public static final int[] MAX_PROFILE_SIZE = {960, 960};
    public static final int[] SQUARE_SIZES = {128, 180, GivenGiftBrief.LUXURY_GIFT_LEVEL, 480, 640};
    public static final int[] SIZES = {180, GivenGiftBrief.LUXURY_GIFT_LEVEL, 480, 640, 720, 960};
    public static ProtobufAdapter<Picture> PROTOBUF_ADAPTER = new MessageNanoAdapter<Picture>() { // from class: com.p1.mobile.putong.data.Picture.1
        {
            ((ProtobufAdapter) this).wireFormat = 2;
        }

        public int computeAndCacheSize(Picture picture) {
            MediaLocalStatus mediaLocalStatus = picture.status;
            int iH = mediaLocalStatus != null ? CodedOutputByteBufferNano.h(1, mediaLocalStatus.ordinal()) : 0;
            String str = picture.url;
            if (str != null) {
                iH += CodedOutputByteBufferNano.o(2, str);
            }
            String str2 = picture.urlKey;
            if (str2 != null) {
                iH += CodedOutputByteBufferNano.o(3, str2);
            }
            String str3 = picture.name;
            if (str3 != null) {
                iH += CodedOutputByteBufferNano.o(4, str3);
            }
            String str4 = picture.mediaType;
            if (str4 != null) {
                iH += CodedOutputByteBufferNano.o(5, str4);
            }
            MediaMeta mediaMeta = picture.meta;
            if (mediaMeta != null) {
                iH += CodedOutputByteBufferNano.l(6, mediaMeta, MediaMeta.PROTOBUF_ADAPTER);
            }
            String str5 = picture.originUrl;
            if (str5 != null) {
                iH += CodedOutputByteBufferNano.o(7, str5);
            }
            int iB = iH + CodedOutputByteBufferNano.b(9, picture.isPortrait);
            List<MediaLabel> list = picture.labels;
            if (list != null) {
                iB += CodedOutputByteBufferNano.l(10, list, MediaLabel.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<String> list2 = picture.tags;
            if (list2 != null) {
                iB += CodedOutputByteBufferNano.l(11, list2, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            List<IdealTag> list3 = picture.tagIdealInfo;
            if (list3 != null) {
                iB += CodedOutputByteBufferNano.l(12, list3, IdealTag.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            Dimension dimension = picture.size;
            if (dimension != null) {
                iB += CodedOutputByteBufferNano.l(51, dimension, Dimension.PROTOBUF_ADAPTER);
            }
            AIPosition aIPosition = picture.aiPosition;
            if (aIPosition != null) {
                iB += CodedOutputByteBufferNano.l(52, aIPosition, AIPosition.PROTOBUF_ADAPTER);
            }
            List<Picture> list4 = picture.attachments;
            if (list4 != null) {
                iB += CodedOutputByteBufferNano.l(53, list4, Picture.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            GaussianBlurParameters gaussianBlurParameters = picture.gaussianBlurParameters;
            if (gaussianBlurParameters != null) {
                iB += CodedOutputByteBufferNano.l(54, gaussianBlurParameters, GaussianBlurParameters.PROTOBUF_ADAPTER);
            }
            MediaLocalStatus mediaLocalStatus2 = picture.status;
            if (mediaLocalStatus2 != null) {
                iB += CodedOutputByteBufferNano.l(55, mediaLocalStatus2, MediaLocalStatus.PROTOBUF_ADAPTER);
            }
            LivePhoto livePhoto = picture.livePhoto;
            if (livePhoto != null) {
                iB += CodedOutputByteBufferNano.l(56, livePhoto, LivePhoto.PROTOBUF_ADAPTER);
            }
            ((MessageNano) picture).cachedSize = iB;
            return iB;
        }

        /* JADX INFO: renamed from: parse, reason: merged with bridge method [inline-methods] */
        public Picture m18805parse(nb5 nb5Var) throws IOException {
            Picture picture = new Picture();
            Integer numValueOf = null;
            while (true) {
                switch (nb5Var.u()) {
                    case 0:
                        if (picture.status == null && numValueOf != null) {
                            picture.status = (MediaLocalStatus) MediaLocalStatus.JSON_ADAPTER.newTEnum(null, numValueOf.intValue());
                        }
                        if (picture.status == null) {
                            picture.status = (MediaLocalStatus) MediaLocalStatus.JSON_ADAPTER.defaultEnum();
                        }
                        if (picture.url == null) {
                            picture.url = "";
                        }
                        if (picture.urlKey == null) {
                            picture.urlKey = "";
                        }
                        if (picture.mediaType == null) {
                            picture.mediaType = "";
                        }
                        if (picture.tags == null) {
                            picture.tags = new ArrayList();
                        }
                        if (picture.size == null) {
                            picture.size = Dimension.new_();
                        }
                        if (picture.aiPosition == null) {
                            picture.aiPosition = AIPosition.new_();
                        }
                        break;
                    case 8:
                        numValueOf = Integer.valueOf(nb5Var.j());
                        continue;
                    case 18:
                        picture.url = nb5Var.s();
                        continue;
                    case 26:
                        picture.urlKey = nb5Var.s();
                        continue;
                    case 34:
                        picture.name = nb5Var.s();
                        continue;
                    case 42:
                        picture.mediaType = nb5Var.s();
                        continue;
                    case 50:
                        picture.meta = (MediaMeta) nb5Var.l(MediaMeta.PROTOBUF_ADAPTER);
                        continue;
                    case 58:
                        picture.originUrl = nb5Var.s();
                        continue;
                    case 72:
                        picture.isPortrait = nb5Var.g();
                        continue;
                    case 82:
                        picture.labels = (List) nb5Var.l(MediaLabel.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 90:
                        picture.tags = (List) nb5Var.l(ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 98:
                        picture.tagIdealInfo = (List) nb5Var.l(IdealTag.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 410:
                        picture.size = (Dimension) nb5Var.l(Dimension.PROTOBUF_ADAPTER);
                        continue;
                    case 418:
                        picture.aiPosition = (AIPosition) nb5Var.l(AIPosition.PROTOBUF_ADAPTER);
                        continue;
                    case 426:
                        picture.attachments = (List) nb5Var.l(Picture.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
                        continue;
                    case 434:
                        picture.gaussianBlurParameters = (GaussianBlurParameters) nb5Var.l(GaussianBlurParameters.PROTOBUF_ADAPTER);
                        continue;
                    case 442:
                        picture.status = (MediaLocalStatus) nb5Var.l(MediaLocalStatus.PROTOBUF_ADAPTER);
                        continue;
                    case 450:
                        picture.livePhoto = (LivePhoto) nb5Var.l(LivePhoto.PROTOBUF_ADAPTER);
                        continue;
                    default:
                        if (picture.status == null && numValueOf != null) {
                            picture.status = (MediaLocalStatus) MediaLocalStatus.JSON_ADAPTER.newTEnum(null, numValueOf.intValue());
                        }
                        if (picture.status == null) {
                            picture.status = (MediaLocalStatus) MediaLocalStatus.JSON_ADAPTER.defaultEnum();
                        }
                        if (picture.url == null) {
                            picture.url = "";
                        }
                        if (picture.urlKey == null) {
                            picture.urlKey = "";
                        }
                        if (picture.mediaType == null) {
                            picture.mediaType = "";
                        }
                        if (picture.tags == null) {
                            picture.tags = new ArrayList();
                        }
                        if (picture.size == null) {
                            picture.size = Dimension.new_();
                        }
                        if (picture.aiPosition == null) {
                            picture.aiPosition = AIPosition.new_();
                            return picture;
                        }
                        break;
                }
            }
            return picture;
        }

        public void serialize(Picture picture, CodedOutputByteBufferNano codedOutputByteBufferNano) throws IOException {
            MediaLocalStatus mediaLocalStatus = picture.status;
            if (mediaLocalStatus != null) {
                codedOutputByteBufferNano.G(1, mediaLocalStatus.ordinal());
            }
            String str = picture.url;
            if (str != null) {
                codedOutputByteBufferNano.R(2, str);
            }
            String str2 = picture.urlKey;
            if (str2 != null) {
                codedOutputByteBufferNano.R(3, str2);
            }
            String str3 = picture.name;
            if (str3 != null) {
                codedOutputByteBufferNano.R(4, str3);
            }
            String str4 = picture.mediaType;
            if (str4 != null) {
                codedOutputByteBufferNano.R(5, str4);
            }
            MediaMeta mediaMeta = picture.meta;
            if (mediaMeta != null) {
                codedOutputByteBufferNano.K(6, mediaMeta, MediaMeta.PROTOBUF_ADAPTER);
            }
            String str5 = picture.originUrl;
            if (str5 != null) {
                codedOutputByteBufferNano.R(7, str5);
            }
            codedOutputByteBufferNano.A(9, picture.isPortrait);
            List<MediaLabel> list = picture.labels;
            if (list != null) {
                codedOutputByteBufferNano.K(10, list, MediaLabel.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            List<String> list2 = picture.tags;
            if (list2 != null) {
                codedOutputByteBufferNano.K(11, list2, ProtobufAdapter.STRING_ADAPTER.ARRAY_ADAPTER());
            }
            List<IdealTag> list3 = picture.tagIdealInfo;
            if (list3 != null) {
                codedOutputByteBufferNano.K(12, list3, IdealTag.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            Dimension dimension = picture.size;
            if (dimension != null) {
                codedOutputByteBufferNano.K(51, dimension, Dimension.PROTOBUF_ADAPTER);
            }
            AIPosition aIPosition = picture.aiPosition;
            if (aIPosition != null) {
                codedOutputByteBufferNano.K(52, aIPosition, AIPosition.PROTOBUF_ADAPTER);
            }
            List<Picture> list4 = picture.attachments;
            if (list4 != null) {
                codedOutputByteBufferNano.K(53, list4, Picture.PROTOBUF_ADAPTER.ARRAY_ADAPTER());
            }
            GaussianBlurParameters gaussianBlurParameters = picture.gaussianBlurParameters;
            if (gaussianBlurParameters != null) {
                codedOutputByteBufferNano.K(54, gaussianBlurParameters, GaussianBlurParameters.PROTOBUF_ADAPTER);
            }
            MediaLocalStatus mediaLocalStatus2 = picture.status;
            if (mediaLocalStatus2 != null) {
                codedOutputByteBufferNano.K(55, mediaLocalStatus2, MediaLocalStatus.PROTOBUF_ADAPTER);
            }
            LivePhoto livePhoto = picture.livePhoto;
            if (livePhoto != null) {
                codedOutputByteBufferNano.K(56, livePhoto, LivePhoto.PROTOBUF_ADAPTER);
            }
        }
    };

    private ImageUri aboutWidth(int i) {
        return aboutWidth(i, userWebpInPicture() ? ".webp" : ".jpg");
    }

    private ImageUri atLeastWidth(int i, String str) {
        int[] iArr = SIZES;
        int i2 = iArr[0];
        for (int i3 : iArr) {
            if (i3 >= i) {
                return maxWidth(i3, str);
            }
        }
        int[] iArr2 = SIZES;
        return maxWidth(iArr2[iArr2.length - 1], str);
    }

    private ImageUri atMostHeight(int i, String str) {
        Dimension dimension = this.size;
        return atMostWidth((i * dimension.width) / Math.max(dimension.height, 10), str);
    }

    private ImageUri atMostShortDimension(int i, String str) {
        Dimension dimension = this.size;
        return dimension.width < dimension.height ? atMostWidth(i, str) : atMostHeight(i, str);
    }

    private ImageUri atMostWidth(int i, String str) {
        if (this.size.width < i) {
            return aspectRatioBiggest(str);
        }
        for (int length = SIZES.length - 1; length >= 0; length--) {
            int i2 = SIZES[length];
            if (i2 <= i) {
                return maxWidth(i2, str);
            }
        }
        return maxWidth(SIZES[0], str);
    }

    /* JADX INFO: renamed from: d */
    public static /* synthetic */ MediaLabel m914d(MediaLabel mediaLabel) {
        return mediaLabel;
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ String m915e(String str) {
        return str;
    }

    private ImageUri maxWidth1080(String str) {
        return maxWidth(1080, str);
    }

    private ImageUri maxWidth1440(String str) {
        return maxWidth(1440, str);
    }

    private ImageUri maxWidth640(String str) {
        return maxWidth(640, str);
    }

    private ImageUri maxWidth720(String str) {
        return maxWidth(720, str);
    }

    public static Picture new_() {
        Picture picture = new Picture();
        picture.nullCheck();
        return picture;
    }

    private ImageUri square1080(String str) {
        return square(1080, str);
    }

    private ImageUri square128(String str) {
        return square(128, str);
    }

    private ImageUri square1440(String str) {
        return square(1440, str);
    }

    private ImageUri square180(String str) {
        return square(180, str);
    }

    private ImageUri square480(String str) {
        return square(480, str);
    }

    private ImageUri square640(String str) {
        return square(640, str);
    }

    private ImageUri square720(String str) {
        return square(720, str);
    }

    private ImageUri squareAbout(int i) {
        return squareAbout(i, userWebpInPicture() ? ".webp" : ".jpg");
    }

    private ImageUri squareAtLeast(int i, String str) {
        for (int i2 : SQUARE_SIZES) {
            if (i2 >= i) {
                return square(i2, str);
            }
        }
        int[] iArr = SQUARE_SIZES;
        return square(iArr[iArr.length - 1], str);
    }

    public static boolean userWebpInPicture() {
        return !RemoteConfig.x().s("picture_format_config") && wc40.c();
    }

    public ImageUri aspectRatioBiggest(String str) {
        int i;
        int[] iArr = SIZES;
        int i2 = iArr[iArr.length - 1];
        int i3 = 0;
        while (true) {
            int[] iArr2 = SIZES;
            if (i3 >= iArr2.length) {
                i = i2;
                break;
            }
            int i4 = iArr2[i3];
            if (i4 > this.size.width) {
                i = i4;
                break;
            }
            i3++;
        }
        return new ImageUri(this.url, this.size, str, 1, i, !TEnum.equals(this.status, "normal"));
    }

    public ImageUri atMostLongDimension(int i, String str) {
        Dimension dimension = this.size;
        return dimension.width < dimension.height ? atMostHeight(i, str) : atMostWidth(i, str);
    }

    public int bigAspectRate() {
        Dimension dimension = this.size;
        int i = dimension.width;
        int i2 = dimension.height;
        if (i > i2 && i2 != 0) {
            return i / i2;
        }
        if (i2 <= i || i == 0) {
            return 0;
        }
        return i2 / i;
    }

    public ImageUri calculatedWidth(int i) {
        return aboutWidth(i);
    }

    @Override // com.p000p1.mobile.putong.data.Media
    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public Picture mo17714clone() {
        Picture picture = new Picture();
        picture.status = this.status;
        picture.url = this.url;
        picture.urlKey = this.urlKey;
        picture.name = this.name;
        picture.mediaType = this.mediaType;
        MediaMeta mediaMeta = this.meta;
        if (mediaMeta != null) {
            picture.meta = mediaMeta.m18443clone();
        }
        picture.originUrl = this.originUrl;
        picture.isPortrait = this.isPortrait;
        List<MediaLabel> list = this.labels;
        if (list != null) {
            picture.labels = ValueObject.util_map(list, new w9j() { // from class: l.fh70
                public final Object call(Object obj) {
                    return Picture.m914d((MediaLabel) obj);
                }
            });
        }
        List<String> list2 = this.tags;
        if (list2 != null) {
            picture.tags = ValueObject.util_map(list2, new w9j() { // from class: l.gh70
                public final Object call(Object obj) {
                    return Picture.m915e((String) obj);
                }
            });
        }
        List<IdealTag> list3 = this.tagIdealInfo;
        if (list3 != null) {
            picture.tagIdealInfo = ValueObject.util_map(list3, new w9j() { // from class: l.hh70
                public final Object call(Object obj) {
                    return ((IdealTag) obj).m18213clone();
                }
            });
        }
        Dimension dimension = this.size;
        if (dimension != null) {
            picture.size = dimension.m17988clone();
        }
        AIPosition aIPosition = this.aiPosition;
        if (aIPosition != null) {
            picture.aiPosition = aIPosition.m17610clone();
        }
        List<Picture> list4 = this.attachments;
        if (list4 != null) {
            picture.attachments = ValueObject.util_map(list4, new w9j() { // from class: l.ih70
                public final Object call(Object obj) {
                    return ((Picture) obj).mo17714clone();
                }
            });
        }
        GaussianBlurParameters gaussianBlurParameters = this.gaussianBlurParameters;
        if (gaussianBlurParameters != null) {
            picture.gaussianBlurParameters = gaussianBlurParameters.m18171clone();
        }
        LivePhoto livePhoto = this.livePhoto;
        if (livePhoto != null) {
            picture.livePhoto = livePhoto.m18357clone();
        }
        return picture;
    }

    @Override // com.p000p1.mobile.putong.data.Media
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Picture)) {
            return false;
        }
        Picture picture = (Picture) obj;
        return super.equals(obj) && ValueObject.util_equals(this.size, picture.size) && ValueObject.util_equals(this.aiPosition, picture.aiPosition) && ValueObject.util_equals(this.attachments, picture.attachments) && ValueObject.util_equals(this.gaussianBlurParameters, picture.gaussianBlurParameters) && ValueObject.util_equals(this.livePhoto, picture.livePhoto);
    }

    public float getAspectRate() {
        Dimension dimension = this.size;
        return (dimension.width * 1.0f) / dimension.height;
    }

    @Override // com.p000p1.mobile.putong.data.Media
    public String getClassParseName() {
        return "picture";
    }

    @Override // com.p000p1.mobile.putong.data.Media
    public int hashCode() {
        int i = ((ValueObject) this).hashCode;
        if (i != 0) {
            return i;
        }
        int iHashCode = super.hashCode() * 41;
        Dimension dimension = this.size;
        int iHashCode2 = (iHashCode + (dimension != null ? dimension.hashCode() : 0)) * 41;
        AIPosition aIPosition = this.aiPosition;
        int iHashCode3 = (iHashCode2 + (aIPosition != null ? aIPosition.hashCode() : 0)) * 41;
        List<Picture> list = this.attachments;
        int iHashCode4 = (iHashCode3 + (list != null ? list.hashCode() : 0)) * 41;
        GaussianBlurParameters gaussianBlurParameters = this.gaussianBlurParameters;
        int iHashCode5 = (iHashCode4 + (gaussianBlurParameters != null ? gaussianBlurParameters.hashCode() : 0)) * 41;
        LivePhoto livePhoto = this.livePhoto;
        int iHashCode6 = iHashCode5 + (livePhoto != null ? livePhoto.hashCode() : 0);
        ((ValueObject) this).hashCode = iHashCode6;
        return iHashCode6;
    }

    public boolean isAiFakePic() {
        return !vwb.J(this.labels) && this.labels.contains(MediaLabel.get(MediaLabel.WITH_AUDIT_AI_PICTURE));
    }

    public boolean isHorizontal() {
        Dimension dimension = this.size;
        return dimension.width > dimension.height;
    }

    public boolean isLabelJudge(MediaLabel mediaLabel) {
        return !vwb.J(this.labels) && this.labels.contains(mediaLabel);
    }

    public boolean isLow() {
        return !vwb.J(this.labels) && this.labels.contains(MediaLabel.get(MediaLabel.WITH_LOW));
    }

    public boolean isSquare() {
        return Math.abs(getAspectRate() - 1.0f) < 0.05f;
    }

    public boolean isVerificationCheckFail() {
        return !vwb.J(this.labels) && this.labels.contains(MediaLabel.get(MediaLabel.NOT_VERIFICATION));
    }

    public ImageUri jpgMaxWidth1080() {
        return maxWidth1080(userWebpInPicture() ? ".webp" : ".jpg");
    }

    public ImageUri jpgMaxWidth1440() {
        return maxWidth1440(userWebpInPicture() ? ".webp" : ".jpg");
    }

    public ImageUri jpgMaxWidth640() {
        return maxWidth640(userWebpInPicture() ? ".webp" : ".jpg");
    }

    public ImageUri jpgMaxWidth720() {
        return maxWidth720(userWebpInPicture() ? ".webp" : ".jpg");
    }

    public ImageUri jpgSquare1080() {
        return square1080(userWebpInPicture() ? ".webp" : ".jpg");
    }

    public ImageUri jpgSquare1440() {
        return square1440(userWebpInPicture() ? ".webp" : ".jpg");
    }

    public ImageUri jpgSquare640() {
        return square640(userWebpInPicture() ? ".webp" : ".jpg");
    }

    public ImageUri jpgSquare720() {
        return square720(userWebpInPicture() ? ".webp" : ".jpg");
    }

    public ImageUri maxWidth(int i, String str) {
        return new ImageUri(this.url, this.size, str, 1, i, !TEnum.equals(this.status, "normal"));
    }

    public ImageUri momentPictureSmall() {
        return atMostShortDimension(t100.d(74.0f));
    }

    @Override // com.p000p1.mobile.putong.data.Media
    public void nullCheck() {
        super.nullCheck();
        if (this.size == null) {
            this.size = Dimension.new_();
        }
        if (this.aiPosition == null) {
            this.aiPosition = AIPosition.new_();
        }
    }

    public ImageUri profile128() {
        return square128(userWebpInPicture() ? ".webp" : ".jpg");
    }

    public ImageUri profile180() {
        return square180(userWebpInPicture() ? ".webp" : ".jpg");
    }

    public ImageUri profile480() {
        return square480(userWebpInPicture() ? ".webp" : ".jpg");
    }

    public ImageUri profileBig() {
        return square640(userWebpInPicture() ? ".webp" : ".jpg");
    }

    public ImageUri profileMiddle() {
        return square640(userWebpInPicture() ? ".webp" : ".jpg");
    }

    public ImageUri profileSize(int i) {
        return squareAtLeast(i);
    }

    public ImageUri profileSmall() {
        return squareAtLeast(t100.d(42.0f));
    }

    public ImageUri profileSmalleOriginalSize() {
        int i = t100.F;
        String str = userWebpInPicture() ? ".webp" : ".jpg";
        for (int i2 : SIZES) {
            if (i2 >= i) {
                return new ImageUri(this.url, this.size, str, 1, i2, !TEnum.equals(this.status, "normal"));
            }
        }
        return jpgMaxWidth720();
    }

    public void removeLabel(final MediaLabel mediaLabel) {
        List<MediaLabel> list = this.labels;
        if (list == null) {
            return;
        }
        vwb.d0(list, new w9j() { // from class: l.dh70
            public final Object call(Object obj) {
                return Boolean.valueOf(TEnum.equals((MediaLabel) obj, mediaLabel));
            }
        });
    }

    public void removeLowLabel() {
        List<MediaLabel> list = this.labels;
        if (list == null) {
            return;
        }
        vwb.d0(list, new w9j() { // from class: l.eh70
            public final Object call(Object obj) {
                return Boolean.valueOf(TEnum.equals((MediaLabel) obj, MediaLabel.get(MediaLabel.WITH_LOW)));
            }
        });
    }

    public void setLabel(MediaLabel mediaLabel) {
        if (this.labels == null) {
            this.labels = new ArrayList();
        }
        if (this.labels.contains(mediaLabel)) {
            return;
        }
        this.labels.add(mediaLabel);
    }

    public void setLow() {
        if (this.labels == null) {
            this.labels = new ArrayList();
        }
        if (this.labels.contains(MediaLabel.get(MediaLabel.WITH_LOW))) {
            return;
        }
        this.labels.add(MediaLabel.get(MediaLabel.WITH_LOW));
    }

    public ImageUri square(int i, String str) {
        return new ImageUri(this.url, this.size, str, 2, i, !TEnum.equals(this.status, "normal"));
    }

    public j760<ImageUri, Point> stickerItemInMessages() {
        int iD = t100.d(App.h ? 128.0f : 144.0f);
        Dimension dimension = this.size;
        int i = dimension.width;
        int i2 = dimension.height;
        if (i > i2) {
            int iMin = Math.min(i, iD);
            Dimension dimension2 = this.size;
            return vwb.Y(aboutWidth(iMin, ".png"), new Point(iMin, (dimension2.height * iMin) / dimension2.width));
        }
        int iMin2 = Math.min(i2, iD);
        Dimension dimension3 = this.size;
        int i3 = (dimension3.width * iMin2) / dimension3.height;
        return vwb.Y(aboutWidth(i3, ".png"), new Point(i3, iMin2));
    }

    public ImageUri stickerPackage() {
        return maxWidth(180, ".png");
    }

    public ImageUri webpMaxWidth1080() {
        return maxWidth1080(".webp");
    }

    public static final class ImageUri {
        public String base;
        public String fileType;
        public int formatType;
        public int formatWidth;
        public boolean isLocal;
        public final Dimension orignalDimen;

        public ImageUri(String str, Dimension dimension, String str2, int i, int i2, boolean z) {
            this.base = str;
            this.orignalDimen = dimension;
            this.fileType = str2;
            this.formatWidth = i2;
            this.formatType = i;
            this.isLocal = z;
        }

        public boolean checkUrlBeanAvailable() {
            if (this.formatWidth <= 0 || !NullChecker.a(this.orignalDimen)) {
                return false;
            }
            Dimension dimension = this.orignalDimen;
            return dimension.width > 0 && dimension.height > 0;
        }

        public ImageUri copy(int i, int i2) {
            return new ImageUri(this.base, this.orignalDimen, this.fileType, i2, i, this.isLocal);
        }

        public boolean equals(Object obj) {
            ImageUri imageUri;
            String str;
            String str2;
            return (obj instanceof ImageUri) && (((str = (imageUri = (ImageUri) obj).base) == null && this.base == null) || str.equals(this.base)) && ((((str2 = this.fileType) == null && imageUri.fileType == null) || str2.equals(imageUri.fileType)) && this.formatType == imageUri.formatType && this.formatWidth == imageUri.formatWidth && this.isLocal == imageUri.isLocal);
        }

        public String formatted(int i) {
            String strConcat;
            if (i == -1) {
                i = this.formatWidth;
            }
            boolean zEquals = ".webp".equals(this.fileType);
            String str = this.base;
            if (zEquals) {
                if (str.endsWith(".jpg") || this.base.endsWith(".png")) {
                    String str2 = this.base;
                    strConcat = str2.substring(0, str2.length() - 4).concat(".webp");
                } else if (this.base.endsWith(".webp") || this.base.endsWith(".gif")) {
                    strConcat = this.base;
                } else {
                    strConcat = this.base + ".webp";
                }
            } else if (str.endsWith(".jpg") || this.base.endsWith(".gif") || this.base.endsWith(".webp") || this.base.endsWith(".png")) {
                strConcat = this.base;
            } else {
                strConcat = this.base + ".jpg";
            }
            int i2 = this.formatType;
            if (i2 == 2) {
                return strConcat + "?format=" + i + "x" + i;
            }
            if (i2 == 1) {
                return strConcat + "?format=max_" + i + "xX";
            }
            if (i2 != 3) {
                return strConcat;
            }
            return strConcat + "?format=blur";
        }

        public ImageUri copy(int i, int i2, String str) {
            return new ImageUri(this.base, this.orignalDimen, str, i2, i, this.isLocal);
        }

        public ImageUri copy(int i) {
            return copy(i, this.formatType);
        }

        public String formatted() {
            return formatted(-1);
        }
    }

    private ImageUri squareAbout(int i, String str) {
        return squareAtLeast((i * 7) / 10, str);
    }

    public ImageUri aboutWidth(int i, String str) {
        return atLeastWidth((i * 7) / 10, str);
    }

    private ImageUri atMostShortDimension(int i) {
        return atMostShortDimension(i, userWebpInPicture() ? ".webp" : ".jpg");
    }

    private ImageUri atMostHeight(int i) {
        return atMostHeight(i, userWebpInPicture() ? ".webp" : ".jpg");
    }

    public ImageUri maxWidth(int i) {
        return maxWidth(i, userWebpInPicture() ? ".webp" : ".jpg");
    }

    public ImageUri square(int i) {
        return square(i, userWebpInPicture() ? ".webp" : ".jpg");
    }

    private ImageUri squareAtLeast(int i) {
        return squareAtLeast(i, userWebpInPicture() ? ".webp" : ".jpg");
    }

    private ImageUri atLeastWidth(int i) {
        return atLeastWidth(i, userWebpInPicture() ? ".webp" : ".jpg");
    }

    private ImageUri atMostWidth(int i) {
        return atMostWidth(i, userWebpInPicture() ? ".webp" : ".jpg");
    }

    public ImageUri aspectRatioBiggest() {
        return aspectRatioBiggest(userWebpInPicture() ? ".webp" : ".jpg");
    }
}
