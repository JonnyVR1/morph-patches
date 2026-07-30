package p153l;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.CoreStaticData;
import com.p051p1.mobile.putong.core.p058ui.profile.loop.LoopInputType;
import com.p051p1.mobile.putong.core.p058ui.profile.loop.ProfileInfoLoopEditAct;
import com.p051p1.mobile.putong.core.p058ui.profile.loop.height.ProfileLoopSelectHeightFrag;
import com.p051p1.mobile.putong.core.p058ui.profile.views.ProfileLoopActionLayout;
import com.p051p1.mobile.putong.core.p058ui.profile.views.ProfileLoopEditUploadPhoto;
import com.p051p1.mobile.putong.core.p058ui.profile.views.WheelPicker;
import com.p051p1.mobile.putong.core.profile.R$string;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import p151v.VFrame;

/* JADX INFO: loaded from: classes4.dex */
public class qsa0 implements iam<nsa0> {

    /* JADX INFO: renamed from: a */
    public TextView f159267a;

    /* JADX INFO: renamed from: b */
    public TextView f159268b;

    /* JADX INFO: renamed from: c */
    public VFrame f159269c;

    /* JADX INFO: renamed from: d */
    public WheelPicker f159270d;

    /* JADX INFO: renamed from: e */
    public ProfileLoopEditUploadPhoto f159271e;

    /* JADX INFO: renamed from: f */
    public ProfileLoopActionLayout f159272f;

    /* JADX INFO: renamed from: g */
    public final Context f159273g;

    /* JADX INFO: renamed from: h */
    public final ProfileLoopSelectHeightFrag f159274h;

    /* JADX INFO: renamed from: i */
    public nsa0 f159275i;

    /* JADX INFO: renamed from: j */
    public int f159276j = -1;

    /* JADX INFO: renamed from: l.qsa0$a */
    public static class C19644a {
        /* JADX INFO: renamed from: b */
        public static void m177754b(qsa0 qsa0Var, View view) {
            ViewGroup viewGroup = (ViewGroup) view;
            qsa0Var.f159267a = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
            qsa0Var.f159268b = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
            qsa0Var.f159269c = (VFrame) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
            qsa0Var.f159270d = (WheelPicker) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(1);
            qsa0Var.f159271e = (ProfileLoopEditUploadPhoto) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
            qsa0Var.f159272f = (ProfileLoopActionLayout) viewGroup.getChildAt(1);
        }

        /* JADX INFO: renamed from: c */
        public static View m177755c(qsa0 qsa0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
            View viewInflate = layoutInflater.inflate(sec0.f167599w0, viewGroup, false);
            m177754b(qsa0Var, viewInflate);
            return viewInflate;
        }
    }

    public qsa0(Context context, ProfileLoopSelectHeightFrag profileLoopSelectHeightFrag) {
        this.f159273g = context;
        this.f159274h = profileLoopSelectHeightFrag;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public /* synthetic */ void m177742q(WheelPicker wheelPicker, Object obj, int i) {
        if (obj instanceof String) {
            m177749s((String) obj);
        }
    }

    /* JADX INFO: renamed from: A3 */
    public void m177743A3(String str) {
        if (NullChecker.m82486a(str)) {
            this.f159267a.setText(str);
            this.f159267a.setTypeface(Typeface.DEFAULT_BOLD);
        }
        this.f159270d.setOnItemSelectedListener(new WheelPicker.InterfaceC8912a() { // from class: l.osa0
            @Override // com.p051p1.mobile.putong.core.p058ui.profile.views.WheelPicker.InterfaceC8912a
            /* JADX INFO: renamed from: a */
            public final void mo54246a(WheelPicker wheelPicker, Object obj, int i) {
                this.f148801a.m177742q(wheelPicker, obj, i);
            }
        });
        this.f159272f.m54152l(this.f159274h);
        m177748p().m52692b2().m52731W0(this.f159274h);
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f159273g;
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m177744k(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: k */
    public View m177744k(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return C19644a.m177755c(this, layoutInflater, viewGroup);
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(nsa0 nsa0Var) {
        this.f159275i = nsa0Var;
    }

    /* JADX INFO: renamed from: m */
    public void m177746m(User user) {
        ArrayList arrayList = new ArrayList();
        String string = this.f159270d.getSelectItem().toString();
        if (!TextUtils.isEmpty(string)) {
            arrayList.add(string.replace(CoreStaticData.FriendPurposeDataType.HEIGHT_UNIT_STR, ""));
            user.profile.extensions.physical.height = arrayList;
        }
        this.f159271e.m54201W(user);
    }

    /* JADX INFO: renamed from: n */
    public Bundle m177747n() {
        return this.f159274h.getArguments();
    }

    /* JADX INFO: renamed from: p */
    public ProfileInfoLoopEditAct m177748p() {
        return (ProfileInfoLoopEditAct) this.f159273g;
    }

    /* JADX INFO: renamed from: s */
    public final void m177749s(String str) {
        this.f159271e.setVisible(!TextUtils.equals(str, this.f159273g.getString(R$string.f28732l2)));
    }

    /* JADX INFO: renamed from: u */
    public void m177750u(List<Media> list, int i) {
        this.f159271e.m54205a0(list);
    }

    /* JADX INFO: renamed from: v */
    public void m177751v(LoopInputType loopInputType) {
        List<String> listMo34797Zg = CoreModule.f18276o.m132214d().mo34797Zg();
        List<String> list = m177748p().m52692b2().m52742u0().profile.extensions.physical.height;
        bnl0.m105525M0(this.f159269c, true);
        if (xra.m212787f() && this.f159274h.m52778U4() && !jyb.m147479J(listMo34797Zg)) {
            jyb.m147505e0(listMo34797Zg, new qcj() { // from class: l.psa0
                @Override // p153l.qcj
                public final Object call(Object obj) {
                    return Boolean.valueOf(((String) obj).equals(CoreModule.f18263b.getString(R$string.f28732l2)));
                }
            });
        }
        this.f159270d.setData(listMo34797Zg);
        this.f159276j = 20;
        if (!jyb.m147479J(list) && !TextUtils.isEmpty(list.get(0))) {
            if (list.get(0).matches("\\d+")) {
                this.f159276j = Integer.valueOf(list.get(0)).intValue() - 140;
            } else if (TextUtils.equals(list.get(0), this.f159273g.getString(R$string.f28732l2))) {
                this.f159276j = listMo34797Zg.size() - 1;
            }
        }
        int i = this.f159276j;
        if (i < 0 || i >= listMo34797Zg.size()) {
            this.f159276j = 0;
        }
        this.f159270d.setSelectedItemPosition(this.f159276j);
        m177752w(loopInputType, this.f159276j);
        if (xra.m212787f() && this.f159274h.m52778U4()) {
            String strM192426m = tr90.m192426m(this.f159274h.f34303z);
            bnl0.m105540X(this.f159267a, 0);
            if (!TextUtils.isEmpty(strM192426m)) {
                bnl0.m105524M(this.f159268b, true);
                bnl0.m105540X(this.f159268b, qa00.m175859d(12.0f));
                bnl0.m105540X(this.f159269c, qa00.m175859d(27.0f));
                this.f159268b.setTextSize(15.0f);
                this.f159268b.setTextColor(Color.parseColor("#a9a9a9"));
                this.f159268b.setText(String.format("预计符合%s人的理想型", strM192426m));
            }
        }
        this.f159274h.m52790f5();
    }

    /* JADX INFO: renamed from: w */
    public final void m177752w(LoopInputType loopInputType, int i) {
        this.f159271e.setVisible(i != CoreModule.f18276o.m132214d().mo34797Zg().size() - 1);
    }

    @Override // p153l.iam
    public void destroy() {
    }
}
