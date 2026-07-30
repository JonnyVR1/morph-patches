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
import p153l.t9l0;
import p153l.wg3;

/* JADX INFO: loaded from: classes.dex */
public class MediaSessionCompat {

    /* JADX INFO: renamed from: a */
    public final MediaControllerCompat f53a;

    @SuppressLint({"BanParcelableUsage"})
    public static final class ResultReceiverWrapper implements Parcelable {
        public static final Parcelable.Creator<ResultReceiverWrapper> CREATOR = new C0028a();
        ResultReceiver mResultReceiver;

        /* JADX INFO: renamed from: android.support.v4.media.session.MediaSessionCompat$ResultReceiverWrapper$a */
        public class C0028a implements Parcelable.Creator<ResultReceiverWrapper> {
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
    public static void m105a(@Nullable Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader(MediaSessionCompat.class.getClassLoader());
        }
    }

    @Nullable
    @RestrictTo({RestrictTo.Scope.LIBRARY})
    /* JADX INFO: renamed from: c */
    public static Bundle m106c(@Nullable Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        m105a(bundle);
        try {
            bundle.isEmpty();
            return bundle;
        } catch (BadParcelableException unused) {
            Log.e("MediaSessionCompat", "Could not unparcel the data.");
            return null;
        }
    }

    /* JADX INFO: renamed from: b */
    public MediaControllerCompat m107b() {
        return this.f53a;
    }

    @SuppressLint({"BanParcelableUsage"})
    public static final class Token implements Parcelable {
        public static final Parcelable.Creator<Token> CREATOR = new C0029a();

        @GuardedBy("mLock")
        private InterfaceC0036b mExtraBinder;
        private final Object mInner;
        private final Object mLock;

        @GuardedBy("mLock")
        private t9l0 mSession2Token;

        /* JADX INFO: renamed from: android.support.v4.media.session.MediaSessionCompat$Token$a */
        public class C0029a implements Parcelable.Creator<Token> {
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

        public Token(Object obj, InterfaceC0036b interfaceC0036b, t9l0 t9l0Var) {
            this.mLock = new Object();
            this.mInner = obj;
            this.mExtraBinder = interfaceC0036b;
            this.mSession2Token = t9l0Var;
        }

        /* JADX INFO: renamed from: a */
        public static Token m116a(Object obj) {
            return m117b(obj, null);
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY})
        /* JADX INFO: renamed from: b */
        public static Token m117b(Object obj, InterfaceC0036b interfaceC0036b) {
            if (obj != null) {
                if (obj instanceof MediaSession.Token) {
                    return new Token(obj, interfaceC0036b);
                }
                wg3.m206174a("token is not a valid MediaSession.Token object");
            }
            return null;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY})
        /* JADX INFO: renamed from: c */
        public InterfaceC0036b m118c() {
            InterfaceC0036b interfaceC0036b;
            synchronized (this.mLock) {
                interfaceC0036b = this.mExtraBinder;
            }
            return interfaceC0036b;
        }

        /* JADX INFO: renamed from: d */
        public Object m119d() {
            return this.mInner;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @RestrictTo({RestrictTo.Scope.LIBRARY})
        /* JADX INFO: renamed from: e */
        public void m120e(InterfaceC0036b interfaceC0036b) {
            synchronized (this.mLock) {
                this.mExtraBinder = interfaceC0036b;
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
        public void m121f(t9l0 t9l0Var) {
            synchronized (this.mLock) {
                this.mSession2Token = t9l0Var;
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

        public Token(Object obj, InterfaceC0036b interfaceC0036b) {
            this(obj, interfaceC0036b, null);
        }

        public Token(Object obj) {
            this(obj, null, null);
        }
    }

    @SuppressLint({"BanParcelableUsage"})
    public static final class QueueItem implements Parcelable {
        public static final Parcelable.Creator<QueueItem> CREATOR = new C0026a();
        public static final int UNKNOWN_ID = -1;
        private final MediaDescriptionCompat mDescription;
        private final long mId;
        private MediaSession.QueueItem mItemFwk;

        /* JADX INFO: renamed from: android.support.v4.media.session.MediaSessionCompat$QueueItem$a */
        public class C0026a implements Parcelable.Creator<QueueItem> {
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
        public static class C0027b {
            @DoNotInline
            /* JADX INFO: renamed from: a */
            public static MediaDescription m112a(MediaSession.QueueItem queueItem) {
                return queueItem.getDescription();
            }

            @DoNotInline
            /* JADX INFO: renamed from: b */
            public static long m113b(MediaSession.QueueItem queueItem) {
                return queueItem.getQueueId();
            }
        }

        public QueueItem(MediaSession.QueueItem queueItem, MediaDescriptionCompat mediaDescriptionCompat, long j) {
            if (mediaDescriptionCompat == null) {
                wg3.m206174a("Description cannot be null");
                throw null;
            }
            if (j == -1) {
                wg3.m206174a("Id cannot be QueueItem.UNKNOWN_ID");
                throw null;
            }
            this.mDescription = mediaDescriptionCompat;
            this.mId = j;
            this.mItemFwk = queueItem;
        }

        /* JADX INFO: renamed from: a */
        public static QueueItem m108a(Object obj) {
            if (obj == null) {
                return null;
            }
            MediaSession.QueueItem queueItem = (MediaSession.QueueItem) obj;
            return new QueueItem(queueItem, MediaDescriptionCompat.m42a(C0027b.m112a(queueItem)), C0027b.m113b(queueItem));
        }

        /* JADX INFO: renamed from: b */
        public static List<QueueItem> m109b(List<?> list) {
            if (list == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList(list.size());
            Iterator<?> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(m108a(it.next()));
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
