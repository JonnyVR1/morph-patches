package com.p046p1.mobile.putong.core.p053ui.lovebuzz.common;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.immomo.momomediaext.sei.BaseSei;
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.putong.app.PutongFrag;
import com.p046p1.mobile.putong.core.data.Active;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p149l.d30;
import p149l.dg2;
import p149l.dgy;
import p149l.egy;
import p149l.eii0;
import p149l.iii0;
import p149l.j760;
import p149l.jlm0;
import p149l.klm0;
import p149l.m6w;
import p149l.q1l0;
import p149l.r1l0;
import p149l.tg2;
import p149l.vwb;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(m87231d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\u0018\u0000 12\u00020\u0001:\u00012B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0005\u0010\u0003J!\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0014¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000f\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0014¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0011\u0010\u0003J\u000f\u0010\u0012\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0012\u0010\u0003J7\u0010\u0018\u001a*\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00160\u00140\u0013j\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00160\u0014`\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001a\u001a\u00020\u0004¢\u0006\u0004\b\u001a\u0010\u0003J\u001f\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u00152\u0006\u0010\u001c\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010!\u001a\u00020 2\u0006\u0010\u001b\u001a\u00020\u0015H\u0002¢\u0006\u0004\b!\u0010\"R\"\u0010)\u001a\u00020\u001d8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\"\u00100\u001a\u00020 8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/¨\u00063"}, m87232d2 = {"Lcom/p1/mobile/putong/core/ui/lovebuzz/common/BaseBuzzSearchFrag;", "Lcom/p1/mobile/putong/app/PutongFrag;", "<init>", "()V", "", "d4", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "inflateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "Landroid/os/Bundle;", "sis", "g4", "(Landroid/os/Bundle;)V", "onResume", "onStop", "Ljava/util/ArrayList;", "Ll/j760;", "", "Ll/d30;", "Lkotlin/collections/ArrayList;", "O4", "()Ljava/util/ArrayList;", "o", "type", "modeType", "Ll/dg2;", "N4", "(Ljava/lang/String;Ljava/lang/String;)Ll/dg2;", "Ll/tg2;", "M4", "(Ljava/lang/String;)Ll/tg2;", BaseSei.f13932Z, "Ll/dg2;", "Q4", "()Ll/dg2;", "S4", "(Ll/dg2;)V", "viewModel", "A", "Ll/tg2;", "P4", "()Ll/tg2;", "R4", "(Ll/tg2;)V", "presenter", "Companion", "a", "buzz_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public final class BaseBuzzSearchFrag extends PutongFrag {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    public tg2 presenter;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    public dg2 viewModel;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.lovebuzz.common.BaseBuzzSearchFrag$a, reason: from kotlin metadata */
    @Metadata(m87231d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u000b¨\u0006\r"}, m87232d2 = {"Lcom/p1/mobile/putong/core/ui/lovebuzz/common/BaseBuzzSearchFrag$a;", "", "<init>", "()V", "", "type", "modeType", "Lcom/p1/mobile/putong/core/ui/lovebuzz/common/BaseBuzzSearchFrag;", "a", "(Ljava/lang/String;Ljava/lang/String;)Lcom/p1/mobile/putong/core/ui/lovebuzz/common/BaseBuzzSearchFrag;", "PAGE_TYPE", "Ljava/lang/String;", "MODE_TYPE", "buzz_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: b */
        public static /* synthetic */ BaseBuzzSearchFrag m46920b(Companion companion, String str, String str2, int i, Object obj) {
            if ((i & 2) != 0) {
                str2 = Active.TYPE;
            }
            return companion.m46921a(str, str2);
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public final BaseBuzzSearchFrag m46921a(@NotNull String type, @Nullable String modeType) {
            type.getClass();
            BaseBuzzSearchFrag baseBuzzSearchFrag = new BaseBuzzSearchFrag();
            Bundle bundle = new Bundle();
            bundle.putString("page_type", type);
            bundle.putString("mode_type", modeType);
            baseBuzzSearchFrag.setArguments(bundle);
            return baseBuzzSearchFrag;
        }

        public Companion() {
        }
    }

    /* JADX INFO: renamed from: M4 */
    public final tg2 m46912M4(String type) {
        int iHashCode = type.hashCode();
        if (iHashCode != -1019560155) {
            if (iHashCode != 1332422126) {
                if (iHashCode == 1740758636 && type.equals("memojiBuzz")) {
                    return new egy(this, type);
                }
            } else if (type.equals("videoBuzz")) {
                return new r1l0(this, type);
            }
        } else if (type.equals("voiceBuzz")) {
            return new klm0(this, type);
        }
        Act act = act();
        act.getClass();
        return new iii0(act, type);
    }

    /* JADX INFO: renamed from: N4 */
    public final dg2 m46913N4(String type, String modeType) {
        int iHashCode = type.hashCode();
        if (iHashCode != -1019560155) {
            if (iHashCode != 1332422126) {
                if (iHashCode == 1740758636 && type.equals("memojiBuzz")) {
                    Act act = act();
                    act.getClass();
                    return new dgy(act, type, modeType);
                }
            } else if (type.equals("videoBuzz")) {
                Act act2 = act();
                act2.getClass();
                return new q1l0(act2, type, modeType);
            }
        } else if (type.equals("voiceBuzz")) {
            Act act3 = act();
            act3.getClass();
            return new jlm0(act3, type, modeType);
        }
        Act act4 = act();
        act4.getClass();
        return new eii0(act4, type);
    }

    @Override // com.p046p1.mobile.putong.app.PutongFrag
    @NotNull
    /* JADX INFO: renamed from: O4, reason: merged with bridge method [inline-methods] */
    public ArrayList<j760<String, d30>> mo29633C4() {
        ArrayList<j760<String, d30>> arrayListM200324f0 = vwb.m200324f0(new j760[0]);
        arrayListM200324f0.getClass();
        arrayListM200324f0.addAll(m46915P4().m188797x0());
        arrayListM200324f0.addAll(super.mo29633C4());
        return arrayListM200324f0;
    }

    @NotNull
    /* JADX INFO: renamed from: P4 */
    public final tg2 m46915P4() {
        tg2 tg2Var = this.presenter;
        if (tg2Var != null) {
            return tg2Var;
        }
        Intrinsics.m87502r("presenter");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: Q4 */
    public final dg2 m46916Q4() {
        dg2 dg2Var = this.viewModel;
        if (dg2Var != null) {
            return dg2Var;
        }
        Intrinsics.m87502r("viewModel");
        return null;
    }

    /* JADX INFO: renamed from: R4 */
    public final void m46917R4(@NotNull tg2 tg2Var) {
        tg2Var.getClass();
        this.presenter = tg2Var;
    }

    /* JADX INFO: renamed from: S4 */
    public final void m46918S4(@NotNull dg2 dg2Var) {
        dg2Var.getClass();
        this.viewModel = dg2Var;
    }

    @Override // com.p046p1.mobile.putong.app.PutongFrag, com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: d4 */
    public void mo20583d4() {
        String string;
        String string2;
        Bundle arguments = getArguments();
        String str = "";
        if (arguments == null || (string = arguments.getString("page_type")) == null) {
            string = "";
        }
        Bundle arguments2 = getArguments();
        if (arguments2 != null && (string2 = arguments2.getString("mode_type")) != null) {
            str = string2;
        }
        m46918S4(m46913N4(string, str));
        m46917R4(m46912M4(string));
        super.mo20583d4();
        m46915P4().mo51532C(m46916Q4());
    }

    @Override // com.p046p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: g4 */
    public void mo20586g4(@Nullable Bundle sis) {
        super.mo20586g4(sis);
        m46916Q4().mo111599r();
        m46915P4().mo146810H0();
    }

    @Override // com.p046p1.mobile.android.app.Frag
    @NotNull
    public View inflateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container) {
        inflater.getClass();
        return m46916Q4().inflateView(inflater, container);
    }

    /* JADX INFO: renamed from: o */
    public final void m46919o() {
        if (m6w.INSTANCE.m153296a(act())) {
            m46916Q4().m111588g0();
        }
    }

    @Override // com.p046p1.mobile.android.app.Frag, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        m46915P4().mo136403U0();
    }

    @Override // com.p046p1.mobile.android.app.Frag, androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        m46915P4().mo136404V0();
    }
}
