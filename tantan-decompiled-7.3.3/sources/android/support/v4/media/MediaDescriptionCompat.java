package android.support.v4.media;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.session.MediaSessionCompat;
import androidx.annotation.DoNotInline;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"BanParcelableUsage"})
public final class MediaDescriptionCompat implements Parcelable {
    public static final long BT_FOLDER_TYPE_ALBUMS = 2;
    public static final long BT_FOLDER_TYPE_ARTISTS = 3;
    public static final long BT_FOLDER_TYPE_GENRES = 4;
    public static final long BT_FOLDER_TYPE_MIXED = 0;
    public static final long BT_FOLDER_TYPE_PLAYLISTS = 5;
    public static final long BT_FOLDER_TYPE_TITLES = 1;
    public static final long BT_FOLDER_TYPE_YEARS = 6;
    public static final Parcelable.Creator<MediaDescriptionCompat> CREATOR = new C0016a();

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static final String DESCRIPTION_KEY_MEDIA_URI = "android.support.v4.media.description.MEDIA_URI";

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    public static final String DESCRIPTION_KEY_NULL_BUNDLE_FLAG = "android.support.v4.media.description.NULL_BUNDLE_FLAG";
    public static final String EXTRA_BT_FOLDER_TYPE = "android.media.extra.BT_FOLDER_TYPE";
    public static final String EXTRA_DOWNLOAD_STATUS = "android.media.extra.DOWNLOAD_STATUS";
    public static final long STATUS_DOWNLOADED = 2;
    public static final long STATUS_DOWNLOADING = 1;
    public static final long STATUS_NOT_DOWNLOADED = 0;
    private static final String TAG = "MediaDescriptionCompat";
    private final CharSequence mDescription;
    private MediaDescription mDescriptionFwk;
    private final Bundle mExtras;
    private final Bitmap mIcon;
    private final Uri mIconUri;
    private final String mMediaId;
    private final Uri mMediaUri;
    private final CharSequence mSubtitle;
    private final CharSequence mTitle;

    /* JADX INFO: renamed from: android.support.v4.media.MediaDescriptionCompat$a */
    public class C0016a implements Parcelable.Creator<MediaDescriptionCompat> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public MediaDescriptionCompat createFromParcel(Parcel parcel) {
            return MediaDescriptionCompat.m42a(MediaDescription.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public MediaDescriptionCompat[] newArray(int i) {
            return new MediaDescriptionCompat[i];
        }
    }

    /* JADX INFO: renamed from: android.support.v4.media.MediaDescriptionCompat$b */
    @RequiresApi(21)
    public static class C0017b {
        @DoNotInline
        /* JADX INFO: renamed from: a */
        public static MediaDescription m47a(MediaDescription.Builder builder) {
            return builder.build();
        }

        @DoNotInline
        /* JADX INFO: renamed from: b */
        public static MediaDescription.Builder m48b() {
            return new MediaDescription.Builder();
        }

        @Nullable
        @DoNotInline
        /* JADX INFO: renamed from: c */
        public static CharSequence m49c(MediaDescription mediaDescription) {
            return mediaDescription.getDescription();
        }

        @Nullable
        @DoNotInline
        /* JADX INFO: renamed from: d */
        public static Bundle m50d(MediaDescription mediaDescription) {
            return mediaDescription.getExtras();
        }

        @Nullable
        @DoNotInline
        /* JADX INFO: renamed from: e */
        public static Bitmap m51e(MediaDescription mediaDescription) {
            return mediaDescription.getIconBitmap();
        }

        @Nullable
        @DoNotInline
        /* JADX INFO: renamed from: f */
        public static Uri m52f(MediaDescription mediaDescription) {
            return mediaDescription.getIconUri();
        }

        @Nullable
        @DoNotInline
        /* JADX INFO: renamed from: g */
        public static String m53g(MediaDescription mediaDescription) {
            return mediaDescription.getMediaId();
        }

        @Nullable
        @DoNotInline
        /* JADX INFO: renamed from: h */
        public static CharSequence m54h(MediaDescription mediaDescription) {
            return mediaDescription.getSubtitle();
        }

        @Nullable
        @DoNotInline
        /* JADX INFO: renamed from: i */
        public static CharSequence m55i(MediaDescription mediaDescription) {
            return mediaDescription.getTitle();
        }

        @DoNotInline
        /* JADX INFO: renamed from: j */
        public static void m56j(MediaDescription.Builder builder, @Nullable CharSequence charSequence) {
            builder.setDescription(charSequence);
        }

        @DoNotInline
        /* JADX INFO: renamed from: k */
        public static void m57k(MediaDescription.Builder builder, @Nullable Bundle bundle) {
            builder.setExtras(bundle);
        }

        @DoNotInline
        /* JADX INFO: renamed from: l */
        public static void m58l(MediaDescription.Builder builder, @Nullable Bitmap bitmap) {
            builder.setIconBitmap(bitmap);
        }

        @DoNotInline
        /* JADX INFO: renamed from: m */
        public static void m59m(MediaDescription.Builder builder, @Nullable Uri uri) {
            builder.setIconUri(uri);
        }

        @DoNotInline
        /* JADX INFO: renamed from: n */
        public static void m60n(MediaDescription.Builder builder, @Nullable String str) {
            builder.setMediaId(str);
        }

        @DoNotInline
        /* JADX INFO: renamed from: o */
        public static void m61o(MediaDescription.Builder builder, @Nullable CharSequence charSequence) {
            builder.setSubtitle(charSequence);
        }

        @DoNotInline
        /* JADX INFO: renamed from: p */
        public static void m62p(MediaDescription.Builder builder, @Nullable CharSequence charSequence) {
            builder.setTitle(charSequence);
        }
    }

    /* JADX INFO: renamed from: android.support.v4.media.MediaDescriptionCompat$c */
    @RequiresApi(23)
    public static class C0018c {
        @Nullable
        @DoNotInline
        /* JADX INFO: renamed from: a */
        public static Uri m63a(MediaDescription mediaDescription) {
            return mediaDescription.getMediaUri();
        }

        @DoNotInline
        /* JADX INFO: renamed from: b */
        public static void m64b(MediaDescription.Builder builder, @Nullable Uri uri) {
            builder.setMediaUri(uri);
        }
    }

    /* JADX INFO: renamed from: android.support.v4.media.MediaDescriptionCompat$d */
    public static final class C0019d {

        /* JADX INFO: renamed from: a */
        public String f28a;

        /* JADX INFO: renamed from: b */
        public CharSequence f29b;

        /* JADX INFO: renamed from: c */
        public CharSequence f30c;

        /* JADX INFO: renamed from: d */
        public CharSequence f31d;

        /* JADX INFO: renamed from: e */
        public Bitmap f32e;

        /* JADX INFO: renamed from: f */
        public Uri f33f;

        /* JADX INFO: renamed from: g */
        public Bundle f34g;

        /* JADX INFO: renamed from: h */
        public Uri f35h;

        /* JADX INFO: renamed from: a */
        public MediaDescriptionCompat m65a() {
            return new MediaDescriptionCompat(this.f28a, this.f29b, this.f30c, this.f31d, this.f32e, this.f33f, this.f34g, this.f35h);
        }

        /* JADX INFO: renamed from: b */
        public C0019d m66b(@Nullable CharSequence charSequence) {
            this.f31d = charSequence;
            return this;
        }

        /* JADX INFO: renamed from: c */
        public C0019d m67c(@Nullable Bundle bundle) {
            this.f34g = bundle;
            return this;
        }

        /* JADX INFO: renamed from: d */
        public C0019d m68d(@Nullable Bitmap bitmap) {
            this.f32e = bitmap;
            return this;
        }

        /* JADX INFO: renamed from: e */
        public C0019d m69e(@Nullable Uri uri) {
            this.f33f = uri;
            return this;
        }

        /* JADX INFO: renamed from: f */
        public C0019d m70f(@Nullable String str) {
            this.f28a = str;
            return this;
        }

        /* JADX INFO: renamed from: g */
        public C0019d m71g(@Nullable Uri uri) {
            this.f35h = uri;
            return this;
        }

        /* JADX INFO: renamed from: h */
        public C0019d m72h(@Nullable CharSequence charSequence) {
            this.f30c = charSequence;
            return this;
        }

        /* JADX INFO: renamed from: i */
        public C0019d m73i(@Nullable CharSequence charSequence) {
            this.f29b = charSequence;
            return this;
        }
    }

    public MediaDescriptionCompat(String str, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, Bitmap bitmap, Uri uri, Bundle bundle, Uri uri2) {
        this.mMediaId = str;
        this.mTitle = charSequence;
        this.mSubtitle = charSequence2;
        this.mDescription = charSequence3;
        this.mIcon = bitmap;
        this.mIconUri = uri;
        this.mExtras = bundle;
        this.mMediaUri = uri2;
    }

    /* JADX INFO: renamed from: a */
    public static MediaDescriptionCompat m42a(Object obj) {
        Bundle bundle = null;
        if (obj == null) {
            return null;
        }
        C0019d c0019d = new C0019d();
        MediaDescription mediaDescription = (MediaDescription) obj;
        c0019d.m70f(C0017b.m53g(mediaDescription));
        c0019d.m73i(C0017b.m55i(mediaDescription));
        c0019d.m72h(C0017b.m54h(mediaDescription));
        c0019d.m66b(C0017b.m49c(mediaDescription));
        c0019d.m68d(C0017b.m51e(mediaDescription));
        c0019d.m69e(C0017b.m52f(mediaDescription));
        Bundle bundleM50d = C0017b.m50d(mediaDescription);
        if (bundleM50d != null) {
            bundleM50d = MediaSessionCompat.m106c(bundleM50d);
        }
        Uri uri = bundleM50d != null ? (Uri) bundleM50d.getParcelable(DESCRIPTION_KEY_MEDIA_URI) : null;
        if (uri == null) {
            bundle = bundleM50d;
        } else if (!bundleM50d.containsKey(DESCRIPTION_KEY_NULL_BUNDLE_FLAG) || bundleM50d.size() != 2) {
            bundleM50d.remove(DESCRIPTION_KEY_MEDIA_URI);
            bundleM50d.remove(DESCRIPTION_KEY_NULL_BUNDLE_FLAG);
            bundle = bundleM50d;
        }
        c0019d.m67c(bundle);
        if (uri != null) {
            c0019d.m71g(uri);
        } else {
            c0019d.m71g(C0018c.m63a(mediaDescription));
        }
        MediaDescriptionCompat mediaDescriptionCompatM65a = c0019d.m65a();
        mediaDescriptionCompatM65a.mDescriptionFwk = mediaDescription;
        return mediaDescriptionCompatM65a;
    }

    /* JADX INFO: renamed from: b */
    public Object m43b() {
        MediaDescription mediaDescription = this.mDescriptionFwk;
        if (mediaDescription != null) {
            return mediaDescription;
        }
        MediaDescription.Builder builderM48b = C0017b.m48b();
        C0017b.m60n(builderM48b, this.mMediaId);
        C0017b.m62p(builderM48b, this.mTitle);
        C0017b.m61o(builderM48b, this.mSubtitle);
        C0017b.m56j(builderM48b, this.mDescription);
        C0017b.m58l(builderM48b, this.mIcon);
        C0017b.m59m(builderM48b, this.mIconUri);
        C0017b.m57k(builderM48b, this.mExtras);
        C0018c.m64b(builderM48b, this.mMediaUri);
        MediaDescription mediaDescriptionM47a = C0017b.m47a(builderM48b);
        this.mDescriptionFwk = mediaDescriptionM47a;
        return mediaDescriptionM47a;
    }

    @Nullable
    /* JADX INFO: renamed from: c */
    public String m44c() {
        return this.mMediaId;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return ((Object) this.mTitle) + ", " + ((Object) this.mSubtitle) + ", " + ((Object) this.mDescription);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        ((MediaDescription) m43b()).writeToParcel(parcel, i);
    }
}
