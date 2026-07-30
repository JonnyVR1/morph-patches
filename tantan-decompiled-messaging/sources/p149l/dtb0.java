package p149l;

import com.p046p1.mobile.putong.core.data.ProfileLikeCategoryType;
import com.p046p1.mobile.putong.data.Purpose;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(m87231d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0003J\u0017\u0010\b\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u000b\u0010\t¨\u0006\f"}, m87232d2 = {"Ll/dtb0;", "", "<init>", "()V", "", "c", "", ProfileLikeCategoryType.friendPurpose, "a", "(Ljava/lang/String;)Ljava/lang/String;", "fitReason", "b", "b_core_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class dtb0 {

    @NotNull
    public static final dtb0 INSTANCE = new dtb0();

    @NotNull
    /* JADX INFO: renamed from: a */
    public final String m113538a(@Nullable String friendPurpose) {
        if (friendPurpose == null) {
            return "你们都想交个朋友";
        }
        switch (friendPurpose.hashCode()) {
            case -1266283874:
                friendPurpose.equals("friend");
                return "你们都想交个朋友";
            case -894477624:
                return !friendPurpose.equals(Purpose.fall_in_love) ? "你们都想交个朋友" : "你们都想谈个恋爱";
            case 3076014:
                return !friendPurpose.equals("date") ? "你们都想交个朋友" : "你们都想出来约会";
            case 253538506:
                return !friendPurpose.equals("marriage") ? "你们都想交个朋友" : "你们都在找结婚对象";
            default:
                return "你们都想交个朋友";
        }
    }

    @NotNull
    /* JADX INFO: renamed from: b */
    public final String m113539b(@Nullable String fitReason) {
        if (fitReason == null) {
            return "default";
        }
        int iHashCode = fitReason.hashCode();
        if (iHashCode == -2021065568) {
            return !fitReason.equals(ProfileLikeCategoryType.friendPurpose) ? "default" : "purpose";
        }
        if (iHashCode != -696616932) {
            return (iHashCode == 288459765 && fitReason.equals("distance")) ? "distance" : "default";
        }
        return !fitReason.equals(ProfileLikeCategoryType.zodiac) ? "default" : "constellation";
    }

    /* JADX INFO: renamed from: c */
    public final void m113540c() {
        qib0.f154691G.m102371r0("https://static.tancdn.com/pe-webplatform/tYf1HL7yBDpDDckT28xVYZNJ.png");
    }
}
