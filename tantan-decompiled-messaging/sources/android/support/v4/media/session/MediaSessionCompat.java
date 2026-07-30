package android.support.v4.media.session;

import android.annotation.SuppressLint;
import android.media.MediaDescription;
import android.media.session.MediaSession;
import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import android.support.v4.media.MediaDescriptionCompat;
import android.util.Log;
import androidx.annotation.DoNotInline;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p149l.ig3;
import p149l.o0l0;

/* JADX INFO: loaded from: classes.dex */
public class MediaSessionCompat {

    /* JADX INFO: renamed from: a */
    public final MediaControllerCompat f53a;

    @SuppressLint({"BanParcelableUsage"})
    public static final class ResultReceiverWrapper implements Parcelable {
        public static final Parcelable.Creator<ResultReceiverWrapper> CREATOR = new C0027a();
        ResultReceiver mResultReceiver;

        /* JADX INFO: renamed from: android.support.v4.media.session.MediaSessionCompat$ResultReceiverWrapper$a */
        public class C0027a implements Parcelable.Creator<ResultReceiverWrapper> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public ResultReceiverWrapper createFromParcel(Parcel parcel) {
                return new ResultReceiverWrapper(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public ResultReceiverWrapper[] newArray(int i) {
                return new ResultReceiverWrapper[i];
            }
        }

        public ResultReceiverWrapper(Parcel parcel) {
            this.mResultReceiver = (ResultReceiver) ResultReceiver.CREATOR.createFromParcel(parcel);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            this.mResultReceiver.writeToParcel(parcel, i);
        }
    }

    @RestrictTo({RestrictTo.Scope.LIBRARY})
    /* JADX INFO: renamed from: a */
    public static void m104a(@Nullable Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader(MediaSessionCompat.class.getClassLoader());
        }
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    /* JADX INFO: renamed from: c */
    public static Bundle m105c(@Nullable Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        m104a(bundle);
        try {
            bundle.isEmpty();
            return bundle;
        } catch (BadParcelableException unused) {
            Log.e("MediaSessionCompat", "Could not unparcel the data.");
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public MediaControllerCompat m106b() {
        return this.f53a;
    }

    @SuppressLint({"BanParcelableUsage"})
    public static final class Token implements Parcelable {
        public static final Parcelable.Creator<Token> CREATOR = new C0028a();

        @GuardedBy("mLock")
        private InterfaceC0035b mExtraBinder;
        private final Object mInner;
        private final Object mLock;

        @GuardedBy("mLock")
        private o0l0 mSession2Token;

        /* JADX INFO: renamed from: android.support.v4.media.session.MediaSessionCompat$Token$a */
        public class C0028a implements Parcelable.Creator<Token> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public Token createFromParcel(Parcel parcel) {
                return new Token(parcel.readParcelable(null));
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public Token[] newArray(int i) {
                return new Token[i];
            }
        }

        public Token(Object obj, InterfaceC0035b interfaceC0035b, o0l0 o0l0Var) {
            this.mLock = new Object();
            this.mInner = obj;
            this.mExtraBinder = interfaceC0035b;
            this.mSession2Token = o0l0Var;
        }

        /* JADX INFO: renamed from: a */
        public static Token m115a(Object obj) {
            return m116b(obj, null);
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY})
        /* JADX INFO: renamed from: b */
        public static Token m116b(Object obj, InterfaceC0035b interfaceC0035b) {
            if (obj != null) {
                if (obj instanceof MediaSession.Token) {
                    return new Token(obj, interfaceC0035b);
                }
                ig3.m135964a("token is not a valid MediaSession.Token object");
            }
            return null;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY})
        /* JADX INFO: renamed from: c */
        public InterfaceC0035b m117c() {
            InterfaceC0035b interfaceC0035b;
            synchronized (this.mLock) {
                interfaceC0035b = this.mExtraBinder;
            }
            return interfaceC0035b;
        }

        /* JADX INFO: renamed from: d */
        public Object m118d() {
            return this.mInner;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY})
        /* JADX INFO: renamed from: e */
        public void m119e(InterfaceC0035b interfaceC0035b) {
            synchronized (this.mLock) {
                this.mExtraBinder = interfaceC0035b;
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Token)) {
                return false;
            }
            Object obj2 = this.mInner;
            Object obj3 = ((Token) obj).mInner;
            if (obj2 == null) {
                return obj3 == null;
            }
            if (obj3 == null) {
                return false;
            }
            return obj2.equals(obj3);
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
        /* JADX INFO: renamed from: f */
        public void m120f(o0l0 o0l0Var) {
            synchronized (this.mLock) {
                this.mSession2Token = o0l0Var;
            }
        }

        public int hashCode() {
            Object obj = this.mInner;
            if (obj == null) {
                return 0;
            }
            return obj.hashCode();
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable((Parcelable) this.mInner, i);
        }

        public Token(Object obj, InterfaceC0035b interfaceC0035b) {
            this(obj, interfaceC0035b, null);
        }

        public Token(Object obj) {
            this(obj, null, null);
        }
    }

    @SuppressLint({"BanParcelableUsage"})
    public static final class QueueItem implements Parcelable {
        public static final Parcelable.Creator<QueueItem> CREATOR = new C0025a();
        public static final int UNKNOWN_ID = -1;
        private final MediaDescriptionCompat mDescription;
        private final long mId;
        private MediaSession.QueueItem mItemFwk;

        /* JADX INFO: renamed from: android.support.v4.media.session.MediaSessionCompat$QueueItem$a */
        public class C0025a implements Parcelable.Creator<QueueItem> {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public QueueItem createFromParcel(Parcel parcel) {
                return new QueueItem(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public QueueItem[] newArray(int i) {
                return new QueueItem[i];
            }
        }

        /* JADX INFO: renamed from: android.support.v4.media.session.MediaSessionCompat$QueueItem$b */
        @RequiresApi(21)
        public static class C0026b {
            @DoNotInline
            /* JADX INFO: renamed from: a */
            public static MediaDescription m111a(MediaSession.QueueItem queueItem) {
                return queueItem.getDescription();
            }

            @DoNotInline
            /* JADX INFO: renamed from: b */
            public static long m112b(MediaSession.QueueItem queueItem) {
                return queueItem.getQueueId();
            }
        }

        public QueueItem(MediaSession.QueueItem queueItem, MediaDescriptionCompat mediaDescriptionCompat, long j) {
            if (mediaDescriptionCompat == null) {
                ig3.m135964a("Description cannot be null");
                throw null;
            }
            if (j == -1) {
                ig3.m135964a("Id cannot be QueueItem.UNKNOWN_ID");
                throw null;
            }
            this.mDescription = mediaDescriptionCompat;
            this.mId = j;
            this.mItemFwk = queueItem;
        }

        /* JADX INFO: renamed from: a */
        public static QueueItem m107a(Object obj) {
            if (obj == null) {
                return null;
            }
            MediaSession.QueueItem queueItem = (MediaSession.QueueItem) obj;
            return new QueueItem(queueItem, MediaDescriptionCompat.m41a(C0026b.m111a(queueItem)), C0026b.m112b(queueItem));
        }

        /* JADX INFO: renamed from: b */
        public static List<QueueItem> m108b(List<?> list) {
            if (list == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList(list.size());
            Iterator<?> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(m107a(it.next()));
            }
            return arrayList;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public String toString() {
            return "MediaSession.QueueItem {Description=" + this.mDescription + ", Id=" + this.mId + " }";
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            this.mDescription.writeToParcel(parcel, i);
            parcel.writeLong(this.mId);
        }

        public QueueItem(Parcel parcel) {
            this.mDescription = MediaDescriptionCompat.CREATOR.createFromParcel(parcel);
            this.mId = parcel.readLong();
        }
    }
}
