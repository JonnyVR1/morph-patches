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
    public static final Parcelable.Creator<MediaDescriptionCompat> CREATOR = new C0015a();

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
    public class C0015a implements Parcelable.Creator<MediaDescriptionCompat> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public MediaDescriptionCompat createFromParcel(Parcel parcel) {
            return MediaDescriptionCompat.m41a(MediaDescription.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public MediaDescriptionCompat[] newArray(int i) {
            return new MediaDescriptionCompat[i];
        }
    }

    /* JADX INFO: renamed from: android.support.v4.media.MediaDescriptionCompat$b */
    @RequiresApi(21)
    public static class C0016b {
        @DoNotInline
        /* JADX INFO: renamed from: a */
        public static MediaDescription m46a(MediaDescription.Builder builder) {
            return builder.build();
        }

        @DoNotInline
        /* JADX INFO: renamed from: b */
        public static MediaDescription.Builder m47b() {
            return new MediaDescription.Builder();
        }

        @Nullable
        @DoNotInline
        /* JADX INFO: renamed from: c */
        public static CharSequence m48c(MediaDescription mediaDescription) {
            return mediaDescription.getDescription();
        }

        @Nullable
        @DoNotInline
        /* JADX INFO: renamed from: d */
        public static Bundle m49d(MediaDescription mediaDescription) {
            return mediaDescription.getExtras();
        }

        @Nullable
        @DoNotInline
        /* JADX INFO: renamed from: e */
        public static Bitmap m50e(MediaDescription mediaDescription) {
            return mediaDescription.getIconBitmap();
        }

        @Nullable
        @DoNotInline
        /* JADX INFO: renamed from: f */
        public static Uri m51f(MediaDescription mediaDescription) {
            return mediaDescription.getIconUri();
        }

        @Nullable
        @DoNotInline
        /* JADX INFO: renamed from: g */
        public static String m52g(MediaDescription mediaDescription) {
            return mediaDescription.getMediaId();
        }

        @Nullable
        @DoNotInline
        /* JADX INFO: renamed from: h */
        public static CharSequence m53h(MediaDescription mediaDescription) {
            return mediaDescription.getSubtitle();
        }

        @Nullable
        @DoNotInline
        /* JADX INFO: renamed from: i */
        public static CharSequence m54i(MediaDescription mediaDescription) {
            return mediaDescription.getTitle();
        }

        @DoNotInline
        /* JADX INFO: renamed from: j */
        public static void m55j(MediaDescription.Builder builder, @Nullable CharSequence charSequence) {
            builder.setDescription(charSequence);
        }

        @DoNotInline
        /* JADX INFO: renamed from: k */
        public static void m56k(MediaDescription.Builder builder, @Nullable Bundle bundle) {
            builder.setExtras(bundle);
        }

        @DoNotInline
        /* JADX INFO: renamed from: l */
        public static void m57l(MediaDescription.Builder builder, @Nullable Bitmap bitmap) {
            builder.setIconBitmap(bitmap);
        }

        @DoNotInline
        /* JADX INFO: renamed from: m */
        public static void m58m(MediaDescription.Builder builder, @Nullable Uri uri) {
            builder.setIconUri(uri);
        }

        @DoNotInline
        /* JADX INFO: renamed from: n */
        public static void m59n(MediaDescription.Builder builder, @Nullable String str) {
            builder.setMediaId(str);
        }

        @DoNotInline
        /* JADX INFO: renamed from: o */
        public static void m60o(MediaDescription.Builder builder, @Nullable CharSequence charSequence) {
            builder.setSubtitle(charSequence);
        }

        @DoNotInline
        /* JADX INFO: renamed from: p */
        public static void m61p(MediaDescription.Builder builder, @Nullable CharSequence charSequence) {
            builder.setTitle(charSequence);
        }
    }

    /* JADX INFO: renamed from: android.support.v4.media.MediaDescriptionCompat$c */
    @RequiresApi(23)
    public static class C0017c {
        @Nullable
        @DoNotInline
        /* JADX INFO: renamed from: a */
        public static Uri m62a(MediaDescription mediaDescription) {
            return mediaDescription.getMediaUri();
        }

        @DoNotInline
        /* JADX INFO: renamed from: b */
        public static void m63b(MediaDescription.Builder builder, @Nullable Uri uri) {
            builder.setMediaUri(uri);
        }
    }

    /* JADX INFO: renamed from: android.support.v4.media.MediaDescriptionCompat$d */
    public static final class C0018d {

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
        public MediaDescriptionCompat m64a() {
            return new MediaDescriptionCompat(this.f28a, this.f29b, this.f30c, this.f31d, this.f32e, this.f33f, this.f34g, this.f35h);
        }

        /* JADX INFO: renamed from: b */
        public C0018d m65b(@Nullable CharSequence charSequence) {
            this.f31d = charSequence;
            return this;
        }

        /* JADX INFO: renamed from: c */
        public C0018d m66c(@Nullable Bundle bundle) {
            this.f34g = bundle;
            return this;
        }

        /* JADX INFO: renamed from: d */
        public C0018d m67d(@Nullable Bitmap bitmap) {
            this.f32e = bitmap;
            return this;
        }

        /* JADX INFO: renamed from: e */
        public C0018d m68e(@Nullable Uri uri) {
            this.f33f = uri;
            return this;
        }

        /* JADX INFO: renamed from: f */
        public C0018d m69f(@Nullable String str) {
            this.f28a = str;
            return this;
        }

        /* JADX INFO: renamed from: g */
        public C0018d m70g(@Nullable Uri uri) {
            this.f35h = uri;
            return this;
        }

        /* JADX INFO: renamed from: h */
        public C0018d m71h(@Nullable CharSequence charSequence) {
            this.f30c = charSequence;
            return this;
        }

        /* JADX INFO: renamed from: i */
        public C0018d m72i(@Nullable CharSequence charSequence) {
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
    public static MediaDescriptionCompat m41a(Object obj) {
        Bundle bundle = null;
        if (obj == null) {
            return null;
        }
        C0018d c0018d = new C0018d();
        MediaDescription mediaDescription = (MediaDescription) obj;
        c0018d.m69f(C0016b.m52g(mediaDescription));
        c0018d.m72i(C0016b.m54i(mediaDescription));
        c0018d.m71h(C0016b.m53h(mediaDescription));
        c0018d.m65b(C0016b.m48c(mediaDescription));
        c0018d.m67d(C0016b.m50e(mediaDescription));
        c0018d.m68e(C0016b.m51f(mediaDescription));
        Bundle bundleM49d = C0016b.m49d(mediaDescription);
        if (bundleM49d != null) {
            bundleM49d = MediaSessionCompat.m105c(bundleM49d);
        }
        Uri uri = bundleM49d != null ? (Uri) bundleM49d.getParcelable(DESCRIPTION_KEY_MEDIA_URI) : null;
        if (uri == null) {
            bundle = bundleM49d;
        } else if (!bundleM49d.containsKey(DESCRIPTION_KEY_NULL_BUNDLE_FLAG) || bundleM49d.size() != 2) {
            bundleM49d.remove(DESCRIPTION_KEY_MEDIA_URI);
            bundleM49d.remove(DESCRIPTION_KEY_NULL_BUNDLE_FLAG);
            bundle = bundleM49d;
        }
        c0018d.m66c(bundle);
        if (uri != null) {
            c0018d.m70g(uri);
        } else {
            c0018d.m70g(C0017c.m62a(mediaDescription));
        }
        MediaDescriptionCompat mediaDescriptionCompatM64a = c0018d.m64a();
        mediaDescriptionCompatM64a.mDescriptionFwk = mediaDescription;
        return mediaDescriptionCompatM64a;
    }

    /* JADX INFO: renamed from: b */
    public Object m42b() {
        MediaDescription mediaDescription = this.mDescriptionFwk;
        if (mediaDescription != null) {
            return mediaDescription;
        }
        MediaDescription.Builder builderM47b = C0016b.m47b();
        C0016b.m59n(builderM47b, this.mMediaId);
        C0016b.m61p(builderM47b, this.mTitle);
        C0016b.m60o(builderM47b, this.mSubtitle);
        C0016b.m55j(builderM47b, this.mDescription);
        C0016b.m57l(builderM47b, this.mIcon);
        C0016b.m58m(builderM47b, this.mIconUri);
        C0016b.m56k(builderM47b, this.mExtras);
        C0017c.m63b(builderM47b, this.mMediaUri);
        MediaDescription mediaDescriptionM46a = C0016b.m46a(builderM47b);
        this.mDescriptionFwk = mediaDescriptionM46a;
        return mediaDescriptionM46a;
    }

    @Nullable
    /* JADX INFO: renamed from: c */
    public String m43c() {
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
        ((MediaDescription) m42b()).writeToParcel(parcel, i);
    }
}
