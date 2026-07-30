package p149l;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseIntArray;
import androidx.annotation.RestrictTo;
import androidx.versionedparcelable.VersionedParcel;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public class n0l0 extends VersionedParcel {

    /* JADX INFO: renamed from: d */
    public final SparseIntArray f136565d;

    /* JADX INFO: renamed from: e */
    public final Parcel f136566e;

    /* JADX INFO: renamed from: f */
    public final int f136567f;

    /* JADX INFO: renamed from: g */
    public final int f136568g;

    /* JADX INFO: renamed from: h */
    public final String f136569h;

    /* JADX INFO: renamed from: i */
    public int f136570i;

    /* JADX INFO: renamed from: j */
    public int f136571j;

    /* JADX INFO: renamed from: k */
    public int f136572k;

    public n0l0(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new e01(), new e01(), new e01());
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    /* JADX INFO: renamed from: A */
    public void mo4102A(byte[] bArr) {
        Parcel parcel = this.f136566e;
        if (bArr == null) {
            parcel.writeInt(-1);
        } else {
            parcel.writeInt(bArr.length);
            this.f136566e.writeByteArray(bArr);
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    /* JADX INFO: renamed from: C */
    public void mo4104C(CharSequence charSequence) {
        TextUtils.writeToParcel(charSequence, this.f136566e, 0);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    /* JADX INFO: renamed from: E */
    public void mo4106E(int i) {
        this.f136566e.writeInt(i);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    /* JADX INFO: renamed from: G */
    public void mo4108G(Parcelable parcelable) {
        this.f136566e.writeParcelable(parcelable, 0);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    /* JADX INFO: renamed from: I */
    public void mo4110I(String str) {
        this.f136566e.writeString(str);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    /* JADX INFO: renamed from: a */
    public void mo4116a() {
        int i = this.f136570i;
        if (i >= 0) {
            int i2 = this.f136565d.get(i);
            int iDataPosition = this.f136566e.dataPosition();
            this.f136566e.setDataPosition(i2);
            this.f136566e.writeInt(iDataPosition - i2);
            this.f136566e.setDataPosition(iDataPosition);
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    /* JADX INFO: renamed from: b */
    public VersionedParcel mo4117b() {
        Parcel parcel = this.f136566e;
        int iDataPosition = parcel.dataPosition();
        int i = this.f136571j;
        if (i == this.f136567f) {
            i = this.f136568g;
        }
        return new n0l0(parcel, iDataPosition, i, this.f136569h + "  ", this.f3190a, this.f3191b, this.f3192c);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    /* JADX INFO: renamed from: g */
    public boolean mo4122g() {
        return this.f136566e.readInt() != 0;
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    /* JADX INFO: renamed from: i */
    public byte[] mo4124i() {
        int i = this.f136566e.readInt();
        if (i < 0) {
            return null;
        }
        byte[] bArr = new byte[i];
        this.f136566e.readByteArray(bArr);
        return bArr;
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    /* JADX INFO: renamed from: k */
    public CharSequence mo4126k() {
        return (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(this.f136566e);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    /* JADX INFO: renamed from: m */
    public boolean mo4128m(int i) {
        while (true) {
            int i2 = this.f136571j;
            int i3 = this.f136568g;
            int i4 = this.f136572k;
            if (i2 >= i3) {
                return i4 == i;
            }
            if (i4 == i) {
                return true;
            }
            if (String.valueOf(i4).compareTo(String.valueOf(i)) > 0) {
                return false;
            }
            this.f136566e.setDataPosition(this.f136571j);
            int i5 = this.f136566e.readInt();
            this.f136572k = this.f136566e.readInt();
            this.f136571j += i5;
        }
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    /* JADX INFO: renamed from: o */
    public int mo4130o() {
        return this.f136566e.readInt();
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    /* JADX INFO: renamed from: q */
    public <T extends Parcelable> T mo4132q() {
        return (T) this.f136566e.readParcelable(getClass().getClassLoader());
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    /* JADX INFO: renamed from: s */
    public String mo4134s() {
        return this.f136566e.readString();
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    /* JADX INFO: renamed from: w */
    public void mo4138w(int i) {
        mo4116a();
        this.f136570i = i;
        this.f136565d.put(i, this.f136566e.dataPosition());
        mo4106E(0);
        mo4106E(i);
    }

    @Override // androidx.versionedparcelable.VersionedParcel
    /* JADX INFO: renamed from: y */
    public void mo4140y(boolean z) {
        this.f136566e.writeInt(z ? 1 : 0);
    }

    public n0l0(Parcel parcel, int i, int i2, String str, e01<String, Method> e01Var, e01<String, Method> e01Var2, e01<String, Class> e01Var3) {
        super(e01Var, e01Var2, e01Var3);
        this.f136565d = new SparseIntArray();
        this.f136570i = -1;
        this.f136572k = -1;
        this.f136566e = parcel;
        this.f136567f = i;
        this.f136568g = i2;
        this.f136571j = i;
        this.f136569h = str;
    }
}
