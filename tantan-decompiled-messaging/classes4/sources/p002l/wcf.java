package p002l;

import android.os.ResultReceiver;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import com.facebook.drawee.view.SimpleDraweeView;
import com.p000p1.mobile.putong.core.p001ui.profile.exp.ExpEditItemView;
import com.p000p1.mobile.putong.core.p001ui.profile.exp.item.AbstractC0064c;
import com.p1.mobile.android.app.c;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.api.o;
import com.p1.mobile.putong.core.data.LabelData;
import com.p1.mobile.putong.core.data.MbtiInfo;
import com.p1.mobile.putong.core.view.CardLabelShowView3;
import com.p1.mobile.putong.data.CharacterEvaluate;
import com.p1.mobile.putong.data.SettingGroups;
import com.p1.mobile.putong.ui.webview.mk.MkWebViewAct;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import l.e30;
import l.f6c0;
import l.mcr;
import l.mkd0;
import l.o6j0;
import l.pj90;
import l.qib0;
import l.t100;
import l.u4c0;
import l.vex;
import l.w9j;
import l.wn90;
import l.x2c0;
import l.xdl0;
import v.VLinear;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class wcf extends AbstractC0064c {

    /* JADX INFO: renamed from: A */
    public SimpleDraweeView f21629A;

    /* JADX INFO: renamed from: u */
    public ExpEditItemView f21630u;

    /* JADX INFO: renamed from: v */
    public ExpEditItemView f21631v;

    /* JADX INFO: renamed from: w */
    public VLinear f21632w;

    /* JADX INFO: renamed from: x */
    public VText f21633x;

    /* JADX INFO: renamed from: y */
    public VText f21634y;

    /* JADX INFO: renamed from: z */
    public CardLabelShowView3 f21635z;

    /* JADX INFO: renamed from: l.wcf$a */
    public class ViewOnClickListenerC0878a implements View.OnClickListener {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ boolean[] f21636a;

        public ViewOnClickListenerC0878a(boolean[] zArr) {
            this.f21636a = zArr;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            String str = (String) CoreModule.c.e0.p9().profile.extensions.basic.mbti.get(0);
            wn90.F().c = false;
            this.f21636a[0] = true;
            wcf.this.m1624x().act().startActivity(MkWebViewAct.e2(wcf.this.m1624x().act(), "", pj90.n + str + "&uid=" + CoreModule.H().userId(), true, true, true, true, (ResultReceiver) null));
        }
    }

    public wcf(@NonNull a1m a1mVar, mcr mcrVar) {
        super(a1mVar, mcrVar);
    }

    /* JADX INFO: renamed from: S */
    public static /* synthetic */ Boolean m24493S(boolean[] zArr, c cVar) {
        boolean z = false;
        if (cVar == c.i && zArr[0] && wn90.F().c) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    /* JADX INFO: renamed from: W */
    public static /* synthetic */ void m24497W(Throwable th) {
    }

    /* JADX INFO: renamed from: X */
    public final /* synthetic */ void m24498X(boolean[] zArr, String str, View view) {
        o6j0.c("e_test_mbti", "p_edit_profile_view", new o6j0.a[0]);
        wn90.F().c = false;
        zArr[0] = true;
        m1624x().act().startActivity(MkWebViewAct.e2(m1624x().act(), "", str, true, true, true, true, (ResultReceiver) null));
    }

    /* JADX INFO: renamed from: Y */
    public final /* synthetic */ void m24499Y(CharacterEvaluate characterEvaluate, View view) {
        o.r3(m1624x().act(), m1624x().m9268i2(), o.s3(o.T, m1624x().userId(), characterEvaluate.hideCharacter, "my_profile"));
    }

    /* JADX INFO: renamed from: Z */
    public void m24500Z(String str) {
        MbtiInfo mbtiInfoA = vex.a(str);
        if (NullChecker.b(mbtiInfoA)) {
            this.f21633x.setText(String.format("%s%s", mbtiInfoA.key, mbtiInfoA.character));
            this.f21634y.setText(mbtiInfoA.desc);
            qib0.G.L0(this.f21629A, mbtiInfoA.pic);
            ArrayList arrayList = new ArrayList();
            for (String str2 : mbtiInfoA.labels) {
                LabelData labelData = new LabelData();
                labelData.name = str2;
                arrayList.add(labelData);
            }
            this.f21635z.setTestKey("mbti");
            this.f21635z.setLabel(arrayList);
        }
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.profile.exp.item.AbstractC0062a
    /* JADX INFO: renamed from: m */
    public String mo1613m() {
        return "我的社交性格";
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.profile.exp.item.AbstractC0062a
    /* JADX INFO: renamed from: n */
    public String mo1614n() {
        return "character";
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.profile.exp.item.AbstractC0062a
    /* JADX INFO: renamed from: y */
    public View mo1625y(ViewGroup viewGroup) {
        ExpEditItemView expEditItemView = new ExpEditItemView(viewGroup.getContext());
        this.f21630u = expEditItemView;
        expEditItemView.m1275d("我的MBTI", x2c0.Ds);
        VLinear vLinearInflate = LayoutInflater.from(viewGroup.getContext()).inflate(f6c0.u2, (ViewGroup) null);
        this.f21632w = vLinearInflate;
        vLinearInflate.setPadding(0, t100.e, 0, 0);
        xdl0.M(this.f21632w, false);
        this.f21629A = this.f21632w.findViewById(u4c0.c8);
        this.f21633x = this.f21632w.findViewById(u4c0.e8);
        this.f21634y = this.f21632w.findViewById(u4c0.b8);
        this.f21635z = this.f21632w.findViewById(u4c0.d8);
        ExpEditItemView expEditItemView2 = new ExpEditItemView(viewGroup.getContext());
        this.f21631v = expEditItemView2;
        expEditItemView2.m1275d("内在性格测试", x2c0.Bs);
        LinearLayout linearLayout = new LinearLayout(viewGroup.getContext());
        linearLayout.setOrientation(1);
        linearLayout.addView(this.f21630u);
        linearLayout.addView(this.f21632w);
        linearLayout.addView(this.f21631v.getDividerView());
        linearLayout.addView(this.f21631v);
        return linearLayout;
    }

    @Override // com.p000p1.mobile.putong.core.p001ui.profile.exp.item.AbstractC0062a
    /* JADX INFO: renamed from: z */
    public void mo1626z() {
        final boolean[] zArr = {false};
        boolean zQ = wn90.Q(CoreModule.c.e0.na());
        ExpEditItemView expEditItemView = this.f21630u;
        if (zQ) {
            expEditItemView.m1274c("", 2);
            xdl0.M(this.f21632w, true);
            ViewOnClickListenerC0878a viewOnClickListenerC0878a = new ViewOnClickListenerC0878a(zArr);
            xdl0.E0(this.f21632w, viewOnClickListenerC0878a);
            xdl0.E0(this.f21630u, viewOnClickListenerC0878a);
            m24500Z((String) m1624x().m9268i2().profile.extensions.basic.mbti.get(0));
        } else {
            expEditItemView.m1274c("添加", 1);
            xdl0.M(this.f21632w, false);
            final String str = String.format(pj90.o, "edit_profile");
            xdl0.E0(this.f21630u, new View.OnClickListener() { // from class: l.rcf
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f18459a.m24498X(zArr, str, view);
                }
            });
        }
        final CharacterEvaluate characterEvaluate = ((SettingGroups) CoreModule.c.e0.R.get()).characterEvaluate;
        if (characterEvaluate == null || TextUtils.isEmpty(characterEvaluate.classification)) {
            xdl0.M(this.f21631v, false);
            xdl0.M(this.f21631v.getDividerView(), false);
        } else {
            xdl0.E0(this.f21631v, new View.OnClickListener() { // from class: l.scf
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f18922a.m24499Y(characterEvaluate, view);
                }
            });
        }
        m1624x().lifecycle().filter(new w9j() { // from class: l.tcf
            public final Object call(Object obj) {
                return wcf.m24493S(zArr, (c) obj);
            }
        }).take(1).subscribe(mkd0.H(new e30() { // from class: l.ucf
            public final void call(Object obj) {
                CoreModule.c.e0.W9(CoreModule.H().userId());
            }
        }, new e30() { // from class: l.vcf
            public final void call(Object obj) {
                wcf.m24497W((Throwable) obj);
            }
        }));
    }
}
