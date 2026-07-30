package p149l;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.CoreStaticData;
import com.p046p1.mobile.putong.core.p053ui.profile.loop.LoopInputType;
import com.p046p1.mobile.putong.core.p053ui.profile.loop.ProfileInfoLoopEditAct;
import com.p046p1.mobile.putong.core.p053ui.profile.loop.height.ProfileLoopSelectHeightFrag;
import com.p046p1.mobile.putong.core.p053ui.profile.views.ProfileLoopActionLayout;
import com.p046p1.mobile.putong.core.p053ui.profile.views.ProfileLoopEditUploadPhoto;
import com.p046p1.mobile.putong.core.p053ui.profile.views.WheelPicker;
import com.p046p1.mobile.putong.core.profile.R$string;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import p147v.VFrame;

/* JADX INFO: loaded from: classes4.dex */
public class mka0 implements s7m<jka0> {

    /* JADX INFO: renamed from: a */
    public TextView f134292a;

    /* JADX INFO: renamed from: b */
    public TextView f134293b;

    /* JADX INFO: renamed from: c */
    public VFrame f134294c;

    /* JADX INFO: renamed from: d */
    public WheelPicker f134295d;

    /* JADX INFO: renamed from: e */
    public ProfileLoopEditUploadPhoto f134296e;

    /* JADX INFO: renamed from: f */
    public ProfileLoopActionLayout f134297f;

    /* JADX INFO: renamed from: g */
    public final Context f134298g;

    /* JADX INFO: renamed from: h */
    public final ProfileLoopSelectHeightFrag f134299h;

    /* JADX INFO: renamed from: i */
    public jka0 f134300i;

    /* JADX INFO: renamed from: j */
    public int f134301j = -1;

    /* JADX INFO: renamed from: l.mka0$a */
    public static class C18487a {
        /* JADX INFO: renamed from: b */
        public static void m154946b(mka0 mka0Var, View view) {
            ViewGroup viewGroup = (ViewGroup) view;
            mka0Var.f134292a = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(0);
            mka0Var.f134293b = (TextView) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(1);
            mka0Var.f134294c = (VFrame) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2);
            mka0Var.f134295d = (WheelPicker) ((ViewGroup) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(2)).getChildAt(1);
            mka0Var.f134296e = (ProfileLoopEditUploadPhoto) ((ViewGroup) viewGroup.getChildAt(0)).getChildAt(3);
            mka0Var.f134297f = (ProfileLoopActionLayout) viewGroup.getChildAt(1);
        }

        /* JADX INFO: renamed from: c */
        public static View m154947c(mka0 mka0Var, LayoutInflater layoutInflater, ViewGroup viewGroup) {
            View viewInflate = layoutInflater.inflate(n6c0.f137385w0, viewGroup, false);
            m154946b(mka0Var, viewInflate);
            return viewInflate;
        }
    }

    public mka0(Context context, ProfileLoopSelectHeightFrag profileLoopSelectHeightFrag) {
        this.f134298g = context;
        this.f134299h = profileLoopSelectHeightFrag;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public /* synthetic */ void m154934q(WheelPicker wheelPicker, Object obj, int i) {
        if (obj instanceof String) {
            m154941s((String) obj);
        }
    }

    /* JADX INFO: renamed from: A3 */
    public void m154935A3(String str) {
        if (NullChecker.m81303a(str)) {
            this.f134292a.setText(str);
            this.f134292a.setTypeface(Typeface.DEFAULT_BOLD);
        }
        this.f134295d.setOnItemSelectedListener(new WheelPicker.InterfaceC8749a() { // from class: l.kka0
            @Override // com.p046p1.mobile.putong.core.p053ui.profile.views.WheelPicker.InterfaceC8749a
            /* JADX INFO: renamed from: a */
            public final void mo53063a(WheelPicker wheelPicker, Object obj, int i) {
                this.f123538a.m154934q(wheelPicker, obj, i);
            }
        });
        this.f134297f.m52969l(this.f134299h);
        m154940p().m51509a2().m51548W0(this.f134299h);
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f134298g;
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return m154936k(layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: k */
    public View m154936k(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return C18487a.m154947c(this, layoutInflater, viewGroup);
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(jka0 jka0Var) {
        this.f134300i = jka0Var;
    }

    /* JADX INFO: renamed from: m */
    public void m154938m(User user) {
        ArrayList arrayList = new ArrayList();
        String string = this.f134295d.getSelectItem().toString();
        if (!TextUtils.isEmpty(string)) {
            arrayList.add(string.replace(CoreStaticData.FriendPurposeDataType.HEIGHT_UNIT_STR, ""));
            user.profile.extensions.physical.height = arrayList;
        }
        this.f134296e.m53018W(user);
    }

    /* JADX INFO: renamed from: n */
    public Bundle m154939n() {
        return this.f134299h.getArguments();
    }

    /* JADX INFO: renamed from: p */
    public ProfileInfoLoopEditAct m154940p() {
        return (ProfileInfoLoopEditAct) this.f134298g;
    }

    /* JADX INFO: renamed from: s */
    public final void m154941s(String str) {
        this.f134296e.setVisible(!TextUtils.equals(str, this.f134298g.getString(R$string.f27884l2)));
    }

    /* JADX INFO: renamed from: u */
    public void m154942u(List<Media> list, int i) {
        this.f134296e.m53022a0(list);
    }

    /* JADX INFO: renamed from: v */
    public void m154943v(LoopInputType loopInputType) {
        List<String> listMo33794Zg = CoreModule.f17557o.m195057d().mo33794Zg();
        List<String> list = m154940p().m51509a2().m51559u0().profile.extensions.physical.height;
        xdl0.m208345M0(this.f134294c, true);
        if (lqa.m150968f() && this.f134299h.m51595U4() && !vwb.m200296J(listMo33794Zg)) {
            vwb.m200322e0(listMo33794Zg, new w9j() { // from class: l.lka0
                @Override // p149l.w9j
                public final Object call(Object obj) {
                    return Boolean.valueOf(((String) obj).equals(CoreModule.f17544b.getString(R$string.f27884l2)));
                }
            });
        }
        this.f134295d.setData(listMo33794Zg);
        this.f134301j = 20;
        if (!vwb.m200296J(list) && !TextUtils.isEmpty(list.get(0))) {
            if (list.get(0).matches("\\d+")) {
                this.f134301j = Integer.valueOf(list.get(0)).intValue() - 140;
            } else if (TextUtils.equals(list.get(0), this.f134298g.getString(R$string.f27884l2))) {
                this.f134301j = listMo33794Zg.size() - 1;
            }
        }
        int i = this.f134301j;
        if (i < 0 || i >= listMo33794Zg.size()) {
            this.f134301j = 0;
        }
        this.f134295d.setSelectedItemPosition(this.f134301j);
        m154944w(loopInputType, this.f134301j);
        if (lqa.m150968f() && this.f134299h.m51595U4()) {
            String strM169801m = pj90.m169801m(this.f134299h.f33455z);
            xdl0.m208360X(this.f134292a, 0);
            if (!TextUtils.isEmpty(strM169801m)) {
                xdl0.m208344M(this.f134293b, true);
                xdl0.m208360X(this.f134293b, t100.m186890d(12.0f));
                xdl0.m208360X(this.f134294c, t100.m186890d(27.0f));
                this.f134293b.setTextSize(15.0f);
                this.f134293b.setTextColor(Color.parseColor("#a9a9a9"));
                this.f134293b.setText(String.format("预计符合%s人的理想型", strM169801m));
            }
        }
        this.f134299h.m51607f5();
    }

    /* JADX INFO: renamed from: w */
    public final void m154944w(LoopInputType loopInputType, int i) {
        this.f134296e.setVisible(i != CoreModule.f17557o.m195057d().mo33794Zg().size() - 1);
    }

    @Override // p149l.s7m
    public void destroy() {
    }
}
