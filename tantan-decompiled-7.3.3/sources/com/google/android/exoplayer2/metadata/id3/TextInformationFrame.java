package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.C1945o;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.eclipse.jetty.http.HttpTokens;
import org.spongycastle.math.p135ec.Tnaf;
import p153l.bmk0;
import p153l.w11;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public final class TextInformationFrame extends Id3Frame {
    public static final Parcelable.Creator<TextInformationFrame> CREATOR = new C1928a();

    @Nullable
    public final String description;

    @Deprecated
    public final String value;
    public final ImmutableList<String> values;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.metadata.id3.TextInformationFrame$a */
    public class C1928a implements Parcelable.Creator<TextInformationFrame> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public TextInformationFrame createFromParcel(Parcel parcel) {
            return new TextInformationFrame(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public TextInformationFrame[] newArray(int i) {
            return new TextInformationFrame[i];
        }
    }

    public TextInformationFrame(Parcel parcel) {
        this((String) w11.m204369e(parcel.readString()), parcel.readString(), ImmutableList.copyOf((String[]) w11.m204369e(parcel.createStringArray())));
    }

    /* JADX INFO: renamed from: a */
    public static List<Integer> m10631a(String str) {
        ArrayList arrayList = new ArrayList();
        try {
            if (str.length() >= 10) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(5, 7))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(8, 10))));
                return arrayList;
            }
            if (str.length() >= 7) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(5, 7))));
                return arrayList;
            }
            if (str.length() >= 4) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
            }
            return arrayList;
        } catch (NumberFormatException unused) {
            return new ArrayList();
        }
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && TextInformationFrame.class == obj.getClass()) {
            TextInformationFrame textInformationFrame = (TextInformationFrame) obj;
            if (bmk0.m105123c(this.f7968id, textInformationFrame.f7968id) && bmk0.m105123c(this.description, textInformationFrame.description) && this.values.equals(textInformationFrame.values)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = (527 + this.f7968id.hashCode()) * 31;
        String str = this.description;
        return ((iHashCode + (str != null ? str.hashCode() : 0)) * 31) + this.values.hashCode();
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.android.exoplayer2.metadata.Metadata.Entry
    /* JADX INFO: renamed from: j */
    public void mo10589j(C1945o.b bVar) {
        String str = this.f7968id;
        str.getClass();
        byte b = -1;
        switch (str.hashCode()) {
            case 82815:
                if (str.equals("TAL")) {
                    b = 0;
                }
                break;
            case 82878:
                if (str.equals("TCM")) {
                    b = 1;
                }
                break;
            case 82897:
                if (str.equals("TDA")) {
                    b = 2;
                }
                break;
            case 83253:
                if (str.equals("TP1")) {
                    b = 3;
                }
                break;
            case 83254:
                if (str.equals("TP2")) {
                    b = 4;
                }
                break;
            case 83255:
                if (str.equals("TP3")) {
                    b = 5;
                }
                break;
            case 83341:
                if (str.equals("TRK")) {
                    b = 6;
                }
                break;
            case 83378:
                if (str.equals("TT2")) {
                    b = 7;
                }
                break;
            case 83536:
                if (str.equals("TXT")) {
                    b = 8;
                }
                break;
            case 83552:
                if (str.equals("TYE")) {
                    b = 9;
                }
                break;
            case 2567331:
                if (str.equals("TALB")) {
                    b = 10;
                }
                break;
            case 2569357:
                if (str.equals("TCOM")) {
                    b = 11;
                }
                break;
            case 2569891:
                if (str.equals("TDAT")) {
                    b = 12;
                }
                break;
            case 2570401:
                if (str.equals("TDRC")) {
                    b = HttpTokens.CARRIAGE_RETURN;
                }
                break;
            case 2570410:
                if (str.equals("TDRL")) {
                    b = 14;
                }
                break;
            case 2571565:
                if (str.equals("TEXT")) {
                    b = 15;
                }
                break;
            case 2575251:
                if (str.equals("TIT2")) {
                    b = Tnaf.POW_2_WIDTH;
                }
                break;
            case 2581512:
                if (str.equals("TPE1")) {
                    b = 17;
                }
                break;
            case 2581513:
                if (str.equals("TPE2")) {
                    b = 18;
                }
                break;
            case 2581514:
                if (str.equals("TPE3")) {
                    b = 19;
                }
                break;
            case 2583398:
                if (str.equals("TRCK")) {
                    b = 20;
                }
                break;
            case 2590194:
                if (str.equals("TYER")) {
                    b = 21;
                }
                break;
        }
        try {
            switch (b) {
                case 0:
                case 10:
                    bVar.m10815N(this.values.get(0));
                    break;
                case 1:
                case 11:
                    bVar.m10820S(this.values.get(0));
                    break;
                case 2:
                case 12:
                    String str2 = this.values.get(0);
                    bVar.m10833f0(Integer.valueOf(Integer.parseInt(str2.substring(2, 4)))).m10832e0(Integer.valueOf(Integer.parseInt(str2.substring(0, 2))));
                    break;
                case 3:
                case 17:
                    bVar.m10816O(this.values.get(0));
                    break;
                case 4:
                case 18:
                    bVar.m10814M(this.values.get(0));
                    break;
                case 5:
                case 19:
                    bVar.m10821T(this.values.get(0));
                    break;
                case 6:
                case 20:
                    String[] strArrM105119a1 = bmk0.m105119a1(this.values.get(0), "/");
                    bVar.m10843p0(Integer.valueOf(Integer.parseInt(strArrM105119a1[0]))).m10842o0(strArrM105119a1.length > 1 ? Integer.valueOf(Integer.parseInt(strArrM105119a1[1])) : null);
                    break;
                case 7:
                case 16:
                    bVar.m10840m0(this.values.get(0));
                    break;
                case 8:
                case 15:
                    bVar.m10845r0(this.values.get(0));
                    break;
                case 9:
                case 21:
                    bVar.m10834g0(Integer.valueOf(Integer.parseInt(this.values.get(0))));
                    break;
                case 13:
                    List<Integer> listM10631a = m10631a(this.values.get(0));
                    int size = listM10631a.size();
                    if (size != 1) {
                        if (size != 2) {
                            if (size == 3) {
                                bVar.m10832e0(listM10631a.get(2));
                            }
                        }
                        bVar.m10833f0(listM10631a.get(1));
                    }
                    bVar.m10834g0(listM10631a.get(0));
                    break;
                case 14:
                    List<Integer> listM10631a2 = m10631a(this.values.get(0));
                    int size2 = listM10631a2.size();
                    if (size2 != 1) {
                        if (size2 != 2) {
                            if (size2 == 3) {
                                bVar.m10835h0(listM10631a2.get(2));
                            }
                        }
                        bVar.m10836i0(listM10631a2.get(1));
                    }
                    bVar.m10837j0(listM10631a2.get(0));
                    break;
            }
        } catch (NumberFormatException | StringIndexOutOfBoundsException unused) {
        }
    }

    @Override // com.google.android.exoplayer2.metadata.id3.Id3Frame
    public String toString() {
        return this.f7968id + ": description=" + this.description + ": values=" + this.values;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f7968id);
        parcel.writeString(this.description);
        parcel.writeStringArray((String[]) this.values.toArray(new String[0]));
    }

    public TextInformationFrame(String str, @Nullable String str2, List<String> list) {
        super(str);
        w11.m204365a(!list.isEmpty());
        this.description = str2;
        ImmutableList<String> immutableListCopyOf = ImmutableList.copyOf((Collection) list);
        this.values = immutableListCopyOf;
        this.value = immutableListCopyOf.get(0);
    }

    public /* synthetic */ TextInformationFrame(Parcel parcel, C1928a c1928a) {
        this(parcel);
    }
}
