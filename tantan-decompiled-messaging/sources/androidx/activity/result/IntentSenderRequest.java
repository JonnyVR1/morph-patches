package androidx.activity.result;

import android.annotation.SuppressLint;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"BanParcelableUsage"})
public final class IntentSenderRequest implements Parcelable {

    @NonNull
    public static final Parcelable.Creator<IntentSenderRequest> CREATOR = new C0053a();

    @Nullable
    private final Intent mFillInIntent;
    private final int mFlagsMask;
    private final int mFlagsValues;

    @NonNull
    private final IntentSender mIntentSender;

    /* JADX INFO: renamed from: androidx.activity.result.IntentSenderRequest$a */
    public class C0053a implements Parcelable.Creator<IntentSenderRequest> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public IntentSenderRequest createFromParcel(Parcel parcel) {
            return new IntentSenderRequest(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public IntentSenderRequest[] newArray(int i) {
            return new IntentSenderRequest[i];
        }
    }

    public IntentSenderRequest(@NonNull Parcel parcel) {
        this.mIntentSender = (IntentSender) parcel.readParcelable(IntentSender.class.getClassLoader());
        this.mFillInIntent = (Intent) parcel.readParcelable(Intent.class.getClassLoader());
        this.mFlagsMask = parcel.readInt();
        this.mFlagsValues = parcel.readInt();
    }

    @Nullable
    /* JADX INFO: renamed from: a */
    public Intent m220a() {
        return this.mFillInIntent;
    }

    /* JADX INFO: renamed from: b */
    public int m221b() {
        return this.mFlagsMask;
    }

    /* JADX INFO: renamed from: c */
    public int m222c() {
        return this.mFlagsValues;
    }

    @NonNull
    /* JADX INFO: renamed from: d */
    public IntentSender m223d() {
        return this.mIntentSender;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i) {
        parcel.writeParcelable(this.mIntentSender, i);
        parcel.writeParcelable(this.mFillInIntent, i);
        parcel.writeInt(this.mFlagsMask);
        parcel.writeInt(this.mFlagsValues);
    }

    /* JADX INFO: renamed from: androidx.activity.result.IntentSenderRequest$b */
    public static final class C0054b {

        /* JADX INFO: renamed from: a */
        public IntentSender f97a;

        /* JADX INFO: renamed from: b */
        public Intent f98b;

        /* JADX INFO: renamed from: c */
        public int f99c;

        /* JADX INFO: renamed from: d */
        public int f100d;

        public C0054b(@NonNull PendingIntent pendingIntent) {
            this(pendingIntent.getIntentSender());
        }

        @NonNull
        /* JADX INFO: renamed from: a */
        public IntentSenderRequest m226a() {
            return new IntentSenderRequest(this.f97a, this.f98b, this.f99c, this.f100d);
        }

        @NonNull
        /* JADX INFO: renamed from: b */
        public C0054b m227b(@Nullable Intent intent) {
            this.f98b = intent;
            return this;
        }

        @NonNull
        /* JADX INFO: renamed from: c */
        public C0054b m228c(int i, int i2) {
            this.f100d = i;
            this.f99c = i2;
            return this;
        }

        public C0054b(@NonNull IntentSender intentSender) {
            this.f97a = intentSender;
        }
    }

    public IntentSenderRequest(@NonNull IntentSender intentSender, @Nullable Intent intent, int i, int i2) {
        this.mIntentSender = intentSender;
        this.mFillInIntent = intent;
        this.mFlagsMask = i;
        this.mFlagsValues = i2;
    }
}
