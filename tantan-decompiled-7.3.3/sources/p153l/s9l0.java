package p153l;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseIntArray;
import androidx.annotation.RestrictTo;
import androidx.versionedparcelable.VersionedParcel;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public class s9l0 extends VersionedParcel {

    /* JADX INFO: renamed from: d */
    public final SparseIntArray f166948d;

    /* JADX INFO: renamed from: e */
    public final Parcel f166949e;

    /* JADX INFO: renamed from: f */
    public final int f166950f;

    /* JADX INFO: renamed from: g */
    public final int f166951g;

    /* JADX INFO: renamed from: h */
    public final String f166952h;

    /* JADX INFO: renamed from: i */
    public int f166953i;

    /* JADX INFO: renamed from: j */
    public int f166954j;

    /* JADX INFO: renamed from: k */
    public int f166955k;

    public s9l0(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new l01(), new l01(), new l01());
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    /* JADX INFO: renamed from: A */
    public void mo4104A(byte[] bArr) {
        Parcel parcel = this.f166949e;
        if (bArr == null) {
            parcel.writeInt(-1);
        } else {
            parcel.writeInt(bArr.length);
            this.f166949e.writeByteArray(bArr);
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    /* JADX INFO: renamed from: C */
    public void mo4106C(CharSequence charSequence) {
        TextUtils.writeToParcel(charSequence, this.f166949e, 0);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    /* JADX INFO: renamed from: E */
    public void mo4108E(int i) {
        this.f166949e.writeInt(i);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    /* JADX INFO: renamed from: G */
    public void mo4110G(Parcelable parcelable) {
        this.f166949e.writeParcelable(parcelable, 0);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    /* JADX INFO: renamed from: I */
    public void mo4112I(String str) {
        this.f166949e.writeString(str);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    /* JADX INFO: renamed from: a */
    public void mo4118a() {
        int i = this.f166953i;
        if (i >= 0) {
            int i2 = this.f166948d.get(i);
            int iDataPosition = this.f166949e.dataPosition();
            this.f166949e.setDataPosition(i2);
            this.f166949e.writeInt(iDataPosition - i2);
            this.f166949e.setDataPosition(iDataPosition);
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    /* JADX INFO: renamed from: b */
    public VersionedParcel mo4119b() {
        Parcel parcel = this.f166949e;
        int iDataPosition = parcel.dataPosition();
        int i = this.f166954j;
        if (i == this.f166950f) {
            i = this.f166951g;
        }
        return new s9l0(parcel, iDataPosition, i, this.f166952h + "  ", this.f3190a, this.f3191b, this.f3192c);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    /* JADX INFO: renamed from: g */
    public boolean mo4124g() {
        return this.f166949e.readInt() != 0;
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    /* JADX INFO: renamed from: i */
    public byte[] mo4126i() {
        int i = this.f166949e.readInt();
        if (i < 0) {
            return null;
        }
        byte[] bArr = new byte[i];
        this.f166949e.readByteArray(bArr);
        return bArr;
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    /* JADX INFO: renamed from: k */
    public CharSequence mo4128k() {
        return (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(this.f166949e);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    /* JADX INFO: renamed from: m */
    public boolean mo4130m(int i) {
        while (true) {
            int i2 = this.f166954j;
            int i3 = this.f166951g;
            int i4 = this.f166955k;
            if (i2 >= i3) {
                return i4 == i;
            }
            if (i4 == i) {
                return true;
            }
            if (String.valueOf(i4).compareTo(String.valueOf(i)) > 0) {
                return false;
            }
            this.f166949e.setDataPosition(this.f166954j);
            int i5 = this.f166949e.readInt();
            this.f166955k = this.f166949e.readInt();
            this.f166954j += i5;
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    /* JADX INFO: renamed from: o */
    public int mo4132o() {
        return this.f166949e.readInt();
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    /* JADX INFO: renamed from: q */
    public <T extends Parcelable> T mo4134q() {
        return (T) this.f166949e.readParcelable(getClass().getClassLoader());
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    /* JADX INFO: renamed from: s */
    public String mo4136s() {
        return this.f166949e.readString();
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    /* JADX INFO: renamed from: w */
    public void mo4140w(int i) {
        mo4118a();
        this.f166953i = i;
        this.f166948d.put(i, this.f166949e.dataPosition());
        mo4108E(0);
        mo4108E(i);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    /* JADX INFO: renamed from: y */
    public void mo4142y(boolean z) {
        this.f166949e.writeInt(z ? 1 : 0);
    }

    public s9l0(Parcel parcel, int i, int i2, String str, l01<String, Method> l01Var, l01<String, Method> l01Var2, l01<String, Class> l01Var3) {
        super(l01Var, l01Var2, l01Var3);
        this.f166948d = new SparseIntArray();
        this.f166953i = -1;
        this.f166955k = -1;
        this.f166949e = parcel;
        this.f166950f = i;
        this.f166951g = i2;
        this.f166954j = i;
        this.f166952h = str;
    }
}
