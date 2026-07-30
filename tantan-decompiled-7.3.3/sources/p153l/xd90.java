package p153l;

import android.content.Context;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.p051p1.mobile.putong.core.p058ui.banner.view.PrivilegeViewType;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(m88120d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\u0018\u0000 \u00042\u00020\u0001:\u0001\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, m88121d2 = {"Ll/xd90;", "", "<init>", "()V", "Companion", "a", "pay_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class xd90 {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: l.xd90$a, reason: from kotlin metadata */
    @Metadata(m88120d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\f\u001a\u00028\u0000\"\b\b\u0000\u0010\u0005*\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, m88121d2 = {"Ll/xd90$a;", "", "<init>", "()V", "Ll/n3m;", p7f.GPS_DIRECTION_TRUE, "Landroid/content/Context;", "context", "Landroid/view/ViewGroup;", "_root", "Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeViewType;", "type", "a", "(Landroid/content/Context;Landroid/view/ViewGroup;Lcom/p1/mobile/putong/core/ui/banner/view/PrivilegeViewType;)Ll/n3m;", "pay_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: l.xd90$a$a */
        @Metadata(m88122k = 3, m88123mv = {2, 2, 0}, m88125xi = 48)
        public static final /* synthetic */ class a {

            /* JADX INFO: renamed from: a */
            public static final /* synthetic */ int[] f193517a;

            static {
                int[] iArr = new int[PrivilegeViewType.values().length];
                try {
                    iArr[PrivilegeViewType.HAS_PRIVILEGE_VIEW.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[PrivilegeViewType.PROMOTION_BOTTOM_VIEW.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[PrivilegeViewType.SINGLE_TEXT_VIEW.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[PrivilegeViewType.SINGLE_TEXT_WITH_ICON_VIEW.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[PrivilegeViewType.ODIAMOND_SINGLE_VIEW.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                try {
                    iArr[PrivilegeViewType.DEFAULT_PRIVILEGE_VIEW.ordinal()] = 6;
                } catch (NoSuchFieldError unused6) {
                }
                try {
                    iArr[PrivilegeViewType.PRIVILEGE_TOP_VIEW.ordinal()] = 7;
                } catch (NoSuchFieldError unused7) {
                }
                try {
                    iArr[PrivilegeViewType.ENHANCED_PROMOTION_BANNER_VIEW.ordinal()] = 8;
                } catch (NoSuchFieldError unused8) {
                }
                try {
                    iArr[PrivilegeViewType.GUIDE_SIGNING_VIEW.ordinal()] = 9;
                } catch (NoSuchFieldError unused9) {
                }
                try {
                    iArr[PrivilegeViewType.PAYMENT_VIEW.ordinal()] = 10;
                } catch (NoSuchFieldError unused10) {
                }
                f193517a = iArr;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public final <T extends n3m> T m210445a(@NotNull Context context, @NotNull ViewGroup _root, @NotNull PrivilegeViewType type) {
            context.getClass();
            _root.getClass();
            type.getClass();
            switch (a.f193517a[type.ordinal()]) {
                case 1:
                    KeyEvent.Callback callbackInflate = LayoutInflater.from(context).inflate(rec0.f162418A0, _root, false);
                    callbackInflate.getClass();
                    return (T) callbackInflate;
                case 2:
                    KeyEvent.Callback callbackInflate2 = LayoutInflater.from(context).inflate(rec0.f162626y0, _root, false);
                    callbackInflate2.getClass();
                    return (T) callbackInflate2;
                case 3:
                    KeyEvent.Callback callbackInflate3 = LayoutInflater.from(context).inflate(rec0.f162434E0, _root, false);
                    callbackInflate3.getClass();
                    return (T) callbackInflate3;
                case 4:
                    KeyEvent.Callback callbackInflate4 = LayoutInflater.from(context).inflate(rec0.f162430D0, _root, false);
                    callbackInflate4.getClass();
                    return (T) callbackInflate4;
                case 5:
                    KeyEvent.Callback callbackInflate5 = LayoutInflater.from(context).inflate(rec0.f162442G0, _root, false);
                    callbackInflate5.getClass();
                    return (T) callbackInflate5;
                case 6:
                    KeyEvent.Callback callbackInflate6 = LayoutInflater.from(context).inflate(rec0.f162630z0, _root, false);
                    callbackInflate6.getClass();
                    return (T) callbackInflate6;
                case 7:
                    KeyEvent.Callback callbackInflate7 = LayoutInflater.from(context).inflate(rec0.f162426C0, _root, false);
                    callbackInflate7.getClass();
                    return (T) callbackInflate7;
                case 8:
                    KeyEvent.Callback callbackInflate8 = LayoutInflater.from(context).inflate(rec0.f162622x0, _root, false);
                    callbackInflate8.getClass();
                    return (T) callbackInflate8;
                case 9:
                    KeyEvent.Callback callbackInflate9 = LayoutInflater.from(context).inflate(rec0.f162438F0, _root, false);
                    callbackInflate9.getClass();
                    return (T) callbackInflate9;
                case 10:
                    KeyEvent.Callback callbackInflate10 = LayoutInflater.from(context).inflate(rec0.f162422B0, _root, false);
                    callbackInflate10.getClass();
                    return (T) callbackInflate10;
                default:
                    KeyEvent.Callback callbackInflate11 = LayoutInflater.from(context).inflate(rec0.f162630z0, _root, false);
                    callbackInflate11.getClass();
                    return (T) callbackInflate11;
            }
        }

        public Companion() {
        }
    }
}
