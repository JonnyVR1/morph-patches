package com.p051p1.mobile.putong.core.p058ui.lovebuzz.common;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.immomo.momomediaext.sei.BaseSei;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.app.PutongFrag;
import com.p051p1.mobile.putong.core.data.Active;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p153l.ah2;
import p153l.apy;
import p153l.bpy;
import p153l.eri0;
import p153l.iri0;
import p153l.jyb;
import p153l.k8w;
import p153l.kg2;
import p153l.num0;
import p153l.oum0;
import p153l.pf60;
import p153l.val0;
import p153l.wal0;
import p153l.x20;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(m88120d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\u0018\u0000 12\u00020\u0001:\u00012B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u0005\u0010\u0003J!\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0014¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000f\u001a\u00020\u00042\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0014¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0011\u0010\u0003J\u000f\u0010\u0012\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0012\u0010\u0003J7\u0010\u0018\u001a*\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00160\u00140\u0013j\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00160\u0014`\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001a\u001a\u00020\u0004¢\u0006\u0004\b\u001a\u0010\u0003J\u001f\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u00152\u0006\u0010\u001c\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010!\u001a\u00020 2\u0006\u0010\u001b\u001a\u00020\u0015H\u0002¢\u0006\u0004\b!\u0010\"R\"\u0010)\u001a\u00020\u001d8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\"\u00100\u001a\u00020 8\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/¨\u00063"}, m88121d2 = {"Lcom/p1/mobile/putong/core/ui/lovebuzz/common/BaseBuzzSearchFrag;", "Lcom/p1/mobile/putong/app/PutongFrag;", "<init>", "()V", "", "d4", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "inflateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;", "Landroid/os/Bundle;", "sis", "g4", "(Landroid/os/Bundle;)V", "onResume", "onStop", "Ljava/util/ArrayList;", "Ll/pf60;", "", "Ll/x20;", "Lkotlin/collections/ArrayList;", "O4", "()Ljava/util/ArrayList;", "o", "type", "modeType", "Ll/kg2;", "N4", "(Ljava/lang/String;Ljava/lang/String;)Ll/kg2;", "Ll/ah2;", "M4", "(Ljava/lang/String;)Ll/ah2;", BaseSei.f14626Z, "Ll/kg2;", "Q4", "()Ll/kg2;", "S4", "(Ll/kg2;)V", "viewModel", "A", "Ll/ah2;", "P4", "()Ll/ah2;", "R4", "(Ll/ah2;)V", "presenter", "Companion", "a", "buzz_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class BaseBuzzSearchFrag extends PutongFrag {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    public ah2 presenter;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    public kg2 viewModel;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.lovebuzz.common.BaseBuzzSearchFrag$a, reason: from kotlin metadata */
    @Metadata(m88120d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u000b¨\u0006\r"}, m88121d2 = {"Lcom/p1/mobile/putong/core/ui/lovebuzz/common/BaseBuzzSearchFrag$a;", "", "<init>", "()V", "", "type", "modeType", "Lcom/p1/mobile/putong/core/ui/lovebuzz/common/BaseBuzzSearchFrag;", "a", "(Ljava/lang/String;Ljava/lang/String;)Lcom/p1/mobile/putong/core/ui/lovebuzz/common/BaseBuzzSearchFrag;", "PAGE_TYPE", "Ljava/lang/String;", "MODE_TYPE", "buzz_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: b */
        public static /* synthetic */ BaseBuzzSearchFrag m48103b(Companion companion, String str, String str2, int i, Object obj) {
            if ((i & 2) != 0) {
                str2 = Active.TYPE;
            }
            return companion.m48104a(str, str2);
        }

        @NotNull
        /* JADX INFO: renamed from: a */
        public final BaseBuzzSearchFrag m48104a(@NotNull String type, @Nullable String modeType) {
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
    public final ah2 m48095M4(String type) {
        int iHashCode = type.hashCode();
        if (iHashCode != -1019560155) {
            if (iHashCode != 1332422126) {
                if (iHashCode == 1740758636 && type.equals("memojiBuzz")) {
                    return new bpy(this, type);
                }
            } else if (type.equals("videoBuzz")) {
                return new wal0(this, type);
            }
        } else if (type.equals("voiceBuzz")) {
            return new oum0(this, type);
        }
        Act act = act();
        act.getClass();
        return new iri0(act, type);
    }

    /* JADX INFO: renamed from: N4 */
    public final kg2 m48096N4(String type, String modeType) {
        int iHashCode = type.hashCode();
        if (iHashCode != -1019560155) {
            if (iHashCode != 1332422126) {
                if (iHashCode == 1740758636 && type.equals("memojiBuzz")) {
                    Act act = act();
                    act.getClass();
                    return new apy(act, type, modeType);
                }
            } else if (type.equals("videoBuzz")) {
                Act act2 = act();
                act2.getClass();
                return new val0(act2, type, modeType);
            }
        } else if (type.equals("voiceBuzz")) {
            Act act3 = act();
            act3.getClass();
            return new num0(act3, type, modeType);
        }
        Act act4 = act();
        act4.getClass();
        return new eri0(act4, type);
    }

    @Override // com.p051p1.mobile.putong.app.PutongFrag
    @NotNull
    /* JADX INFO: renamed from: O4, reason: merged with bridge method [inline-methods] */
    public ArrayList<pf60<String, x20>> mo30631C4() {
        ArrayList<pf60<String, x20>> arrayListM147507f0 = jyb.m147507f0(new pf60[0]);
        arrayListM147507f0.getClass();
        arrayListM147507f0.addAll(m48098P4().m97772x0());
        arrayListM147507f0.addAll(super.mo30631C4());
        return arrayListM147507f0;
    }

    @NotNull
    /* JADX INFO: renamed from: P4 */
    public final ah2 m48098P4() {
        ah2 ah2Var = this.presenter;
        if (ah2Var != null) {
            return ah2Var;
        }
        Intrinsics.m88391r("presenter");
        return null;
    }

    @NotNull
    /* JADX INFO: renamed from: Q4 */
    public final kg2 m48099Q4() {
        kg2 kg2Var = this.viewModel;
        if (kg2Var != null) {
            return kg2Var;
        }
        Intrinsics.m88391r("viewModel");
        return null;
    }

    /* JADX INFO: renamed from: R4 */
    public final void m48100R4(@NotNull ah2 ah2Var) {
        ah2Var.getClass();
        this.presenter = ah2Var;
    }

    /* JADX INFO: renamed from: S4 */
    public final void m48101S4(@NotNull kg2 kg2Var) {
        kg2Var.getClass();
        this.viewModel = kg2Var;
    }

    @Override // com.p051p1.mobile.putong.app.PutongFrag, com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: d4 */
    public void mo21582d4() {
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
        m48101S4(m48096N4(string, str));
        m48100R4(m48095M4(string));
        super.mo21582d4();
        m48098P4().mo52715C(m48099Q4());
    }

    @Override // com.p051p1.mobile.android.app.Frag
    /* JADX INFO: renamed from: g4 */
    public void mo21585g4(@Nullable Bundle sis) {
        super.mo21585g4(sis);
        m48099Q4().mo99387r();
        m48098P4().mo97758H0();
    }

    @Override // com.p051p1.mobile.android.app.Frag
    @NotNull
    public View inflateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container) {
        inflater.getClass();
        return m48099Q4().inflateView(inflater, container);
    }

    /* JADX INFO: renamed from: o */
    public final void m48102o() {
        if (k8w.INSTANCE.m148752a(act())) {
            m48099Q4().m149718g0();
        }
    }

    @Override // com.p051p1.mobile.android.app.Frag, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        m48098P4().mo97766U0();
    }

    @Override // com.p051p1.mobile.android.app.Frag, androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        m48098P4().mo97767V0();
    }
}
