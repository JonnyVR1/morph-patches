package p153l;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.CoreStaticData;
import com.p051p1.mobile.putong.core.p058ui.profile.loop.LoopInputType;
import com.p051p1.mobile.putong.core.p058ui.profile.loop.ProfileInfoLoopEditAct;
import com.p051p1.mobile.putong.core.p058ui.profile.loop.base.LoopSelectFillData;
import com.p051p1.mobile.putong.core.p058ui.profile.loop.input.ProfileLoopSelectInputFrag;
import com.p051p1.mobile.putong.core.p058ui.profile.views.ProfileLoopActionLayout;
import com.p051p1.mobile.putong.core.p058ui.profile.views.ProfileLoopEditPetUploadPhoto;
import com.p051p1.mobile.putong.core.p058ui.profile.views.ProfileLoopEditUploadPhoto;
import com.p051p1.mobile.putong.core.profile.R$string;
import com.p051p1.mobile.putong.data.Media;
import com.p051p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import p151v.VList;

/* JADX INFO: loaded from: classes4.dex */
public class pta0 implements iam<nta0> {

    /* JADX INFO: renamed from: a */
    public TextView f154003a;

    /* JADX INFO: renamed from: b */
    public TextView f154004b;

    /* JADX INFO: renamed from: c */
    public VList f154005c;

    /* JADX INFO: renamed from: d */
    public ProfileLoopEditUploadPhoto f154006d;

    /* JADX INFO: renamed from: e */
    public ProfileLoopEditPetUploadPhoto f154007e;

    /* JADX INFO: renamed from: f */
    public ProfileLoopActionLayout f154008f;

    /* JADX INFO: renamed from: g */
    public FrameLayout f154009g;

    /* JADX INFO: renamed from: h */
    public nta0 f154010h;

    /* JADX INFO: renamed from: i */
    public C19442c f154011i;

    /* JADX INFO: renamed from: j */
    public Context f154012j;

    /* JADX INFO: renamed from: k */
    public ProfileLoopSelectInputFrag f154013k;

    /* JADX INFO: renamed from: l.pta0$a */
    public class C19440a implements AdapterView.OnItemClickListener {
        public C19440a() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            pta0.this.f154010h.m164711L0(i);
        }
    }

    /* JADX INFO: renamed from: l.pta0$c */
    public class C19442c extends BaseAdapter {

        /* JADX INFO: renamed from: a */
        public ArrayList<LoopSelectFillData> f154016a = new ArrayList<>();

        /* JADX INFO: renamed from: b */
        public nta0 f154017b;

        public C19442c(nta0 nta0Var) {
            this.f154017b = nta0Var;
        }

        @Override // android.widget.Adapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public LoopSelectFillData getItem(int i) {
            return this.f154016a.get(i);
        }

        /* JADX INFO: renamed from: b */
        public void m173752b(ArrayList<LoopSelectFillData> arrayList) {
            this.f154016a.clear();
            this.f154016a.addAll(arrayList);
            notifyDataSetChanged();
        }

        @Override // android.widget.Adapter
        public int getCount() {
            return this.f154016a.size();
        }

        @Override // android.widget.Adapter
        public long getItemId(int i) {
            return i;
        }

        @Override // android.widget.Adapter
        public View getView(int i, View view, ViewGroup viewGroup) {
            C19443d c19443d;
            if (view == null) {
                view = LayoutInflater.from(pta0.this.getAct()).inflate(sec0.f167598w, viewGroup, false);
                c19443d = pta0.this.new C19443d();
                c19443d.f154019a = (TextView) view.findViewById(gdc0.f103666Y);
                c19443d.f154020b = (ImageView) view.findViewById(gdc0.f103668a);
                c19443d.f154021c = view.findViewById(gdc0.f103697y);
                view.setTag(gdc0.f103698z, c19443d);
            } else {
                c19443d = (C19443d) view.getTag(gdc0.f103698z);
            }
            LoopSelectFillData item = getItem(i);
            if (i == 0 && TextUtils.equals(item.m52760c(), pta0.this.f154013k.getString(R$string.f28641V2))) {
                c19443d.f154019a.setTextColor(Color.parseColor("#e6000000"));
                c19443d.f154019a.setTypeface(Typeface.DEFAULT_BOLD);
                bnl0.m105525M0(c19443d.f154020b, true);
                c19443d.f154020b.setImageDrawable(pta0.this.f154013k.getResources().getDrawable(kbc0.f124907s));
            } else {
                c19443d.f154019a.setTypeface(Typeface.DEFAULT);
                bnl0.m105524M(c19443d.f154020b, item.m52762e() || item.m52768k());
                c19443d.f154020b.setImageDrawable(pta0.this.f154013k.getResources().getDrawable(kbc0.f124905r0));
            }
            if (item.m52761d() == LoopSelectFillData.LoopSelectType.SELECT_JUST_TEXT) {
                bnl0.m105539W(c19443d.f154021c, qa00.m175859d(40.0f));
                bnl0.m105538V(c19443d.f154021c, qa00.m175859d(40.0f));
                bnl0.m105540X(c19443d.f154021c, qa00.m175859d(6.0f));
                bnl0.m105537U(c19443d.f154021c, qa00.m175859d(6.0f));
                c19443d.f154019a.setTypeface(lyh0.m156283c(3));
                c19443d.f154019a.setGravity(17);
                bnl0.m105539W(c19443d.f154019a, 0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) c19443d.f154019a.getLayoutParams();
                layoutParams.gravity = 17;
                c19443d.f154019a.setLayoutParams(layoutParams);
                boolean zM52763f = item.m52763f();
                View view2 = c19443d.f154021c;
                if (zM52763f) {
                    view2.setBackgroundResource(kbc0.f124899p0);
                    c19443d.f154019a.setTextColor(-1);
                    c19443d.f154019a.setTextSize(16.0f);
                } else {
                    view2.setBackgroundResource(kbc0.f124902q0);
                    c19443d.f154019a.setTextColor(-13487566);
                    c19443d.f154019a.setTextSize(16.0f);
                }
            } else if (item.m52763f()) {
                c19443d.f154021c.setBackgroundResource(kbc0.f124911t0);
                c19443d.f154019a.setTextColor(pta0.this.f154013k.getResources().getColor(j9c0.f118869f));
                bnl0.m105525M0(c19443d.f154020b, true);
                c19443d.f154020b.setImageDrawable(pta0.this.f154013k.getResources().getDrawable(kbc0.f124874h));
            } else {
                c19443d.f154021c.setBackgroundResource(kbc0.f124908s0);
                c19443d.f154019a.setTextColor(Color.parseColor("#cf000000"));
            }
            c19443d.f154019a.setText(item.m52760c());
            return view;
        }
    }

    /* JADX INFO: renamed from: l.pta0$d */
    public class C19443d {

        /* JADX INFO: renamed from: a */
        public TextView f154019a;

        /* JADX INFO: renamed from: b */
        public ImageView f154020b;

        /* JADX INFO: renamed from: c */
        public View f154021c;

        public C19443d() {
        }
    }

    public pta0(Context context, ProfileLoopSelectInputFrag profileLoopSelectInputFrag) {
        this.f154012j = context;
        this.f154013k = profileLoopSelectInputFrag;
    }

    /* JADX INFO: renamed from: r */
    private void m173736r() {
        this.f154008f.m54152l(this.f154013k);
        if (TextUtils.equals(CoreStaticData.ProfileFromType.FROM_CARD_GUIDE_IMPROVE_PROFILE, this.f154013k.f34300F)) {
            this.f154008f.setNextButton(m173740f().getResources().getString(R$string.f28693f));
        }
        m173740f().m52692b2().m52731W0(this.f154013k);
        C19442c c19442c = new C19442c(this.f154010h);
        this.f154011i = c19442c;
        this.f154005c.setAdapter((ListAdapter) c19442c);
        this.f154005c.setOnItemClickListener(new C19440a());
        this.f154009g.setOnClickListener(new ViewOnClickListenerC19441b());
        bnl0.m105524M(this.f154004b, xra.m212788g());
    }

    @Override // p153l.iam
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f154012j;
    }

    /* JADX INFO: renamed from: c */
    public View m173737c(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return qta0.m177906b(this, layoutInflater, viewGroup);
    }

    @Override // p153l.iam
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void mo22064i1(nta0 nta0Var) {
        this.f154010h = nta0Var;
    }

    /* JADX INFO: renamed from: e */
    public Bundle m173739e() {
        return this.f154013k.getArguments();
    }

    /* JADX INFO: renamed from: f */
    public ProfileInfoLoopEditAct m173740f() {
        return (ProfileInfoLoopEditAct) this.f154012j;
    }

    /* JADX INFO: renamed from: i */
    public void m173741i() {
        this.f154008f.m54147g();
    }

    @Override // p153l.iam
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewM173737c = m173737c(layoutInflater, viewGroup);
        m173736r();
        return viewM173737c;
    }

    /* JADX INFO: renamed from: j */
    public void m173742j() {
        bnl0.m105524M(this.f154009g, false);
    }

    /* JADX INFO: renamed from: k */
    public void m173743k(User user) {
        this.f154007e.setUser(user);
        this.f154007e.m54192u0(this.f154013k.pageId());
        m173750u();
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m173744l(String str) {
        this.f154007e.m54180i0(str, this.f154013k.pageId());
    }

    /* JADX INFO: renamed from: m */
    public void m173745m(List<Media> list, int i) {
        if (this.f154010h.m164703A0()) {
            this.f154007e.m54190s0(getAct(), list, new y20() { // from class: l.ota0
                @Override // p153l.y20
                public final void call(Object obj) {
                    this.f148938a.m173744l((String) obj);
                }
            });
        } else {
            this.f154006d.m54205a0(list);
        }
    }

    /* JADX INFO: renamed from: n */
    public void m173746n(ArrayList<LoopSelectFillData> arrayList) {
        this.f154011i.m173752b(arrayList);
    }

    /* JADX INFO: renamed from: p */
    public void m173747p(LoopInputType loopInputType) {
        if (loopInputType == LoopInputType.HOMETOWN && xra.m212788g()) {
            bnl0.m105524M(this.f154004b, false);
        }
        bnl0.m105524M(this.f154004b, false);
        if (xra.m212787f() && this.f154013k.m52778U4()) {
            String strM192426m = tr90.m192426m(loopInputType);
            bnl0.m105540X(this.f154003a, 0);
            if (!TextUtils.isEmpty(strM192426m)) {
                bnl0.m105524M(this.f154004b, true);
                bnl0.m105540X(this.f154004b, qa00.m175859d(12.0f));
                bnl0.m105540X(this.f154005c, qa00.m175859d(20.0f));
                this.f154004b.setTextSize(15.0f);
                this.f154004b.setTextColor(Color.parseColor("#a9a9a9"));
                this.f154004b.setText(String.format("预计符合%s人的理想型", strM192426m));
            }
        }
        LoopInputType loopInputType2 = LoopInputType.QUALIFICATION;
        TextView textView = this.f154003a;
        if (loopInputType == loopInputType2) {
            textView.setText(R$string.f28749o1);
        } else {
            textView.setText(loopInputType.title);
        }
        if (this.f154010h.m164703A0()) {
            bnl0.m105548c0(this.f154005c, 0);
        }
        LoopInputType loopInputType3 = LoopInputType.GAME_NAME;
        if (loopInputType == loopInputType3 || loopInputType == LoopInputType.GAME_TOGETHER || loopInputType == LoopInputType.GAME_VOICE) {
            bnl0.m105524M(this.f154004b, false);
        }
        if (this.f154010h.m164703A0() && this.f154013k.m52779V4()) {
            bnl0.m105524M(this.f154004b, true);
            String str = "他";
            if (!CoreModule.m30933P().m143405a().mo34494eg() && (CoreModule.m30933P().m143405a().mo34377N8() || !CoreModule.f18264c.f20381e0.m116593na().isFemale())) {
                str = "她";
            }
            this.f154004b.setText("你有宠物吗？上传更多宠物照片，萌化" + str + "们");
            bnl0.m105537U(this.f154004b, qa00.m175859d(10.0f));
            bnl0.m105540X(this.f154005c, qa00.m175859d(6.0f));
        }
        if (TextUtils.equals(CoreStaticData.ProfileFromType.FROM_CARD_GUIDE_IMPROVE_PROFILE, this.f154013k.f34300F)) {
            bnl0.m105524M(this.f154004b, true);
            String str2 = this.f154013k.f34301G;
            if (TextUtils.isEmpty(str2)) {
                this.f154004b.setText("根据你的选择，自动生成留言发送");
            } else {
                User userM116503Pa = CoreModule.f18264c.f20381e0.m116503Pa(str2);
                boolean zM82486a = NullChecker.m82486a(userM116503Pa);
                TextView textView2 = this.f154004b;
                if (zM82486a) {
                    textView2.setText("根据你的选择，自动生成留言发送给" + userM116503Pa.getPronoun());
                } else {
                    textView2.setText("根据你的选择，自动生成留言发送");
                }
            }
            if (loopInputType == loopInputType3) {
                this.f154003a.setText("在玩的游戏（多选）");
            }
            bnl0.m105540X(this.f154003a, 4);
            bnl0.m105540X(this.f154004b, qa00.m175859d(12.0f));
            bnl0.m105540X(this.f154005c, 0);
            this.f154004b.setTextSize(15.0f);
            this.f154004b.setTextColor(Color.parseColor("#a9a9a9"));
            bnl0.m105525M0(this.f154004b, true);
        }
    }

    /* JADX INFO: renamed from: q */
    public void m173748q() {
        bnl0.m105524M(this.f154009g, true);
    }

    /* JADX INFO: renamed from: s */
    public void m173749s(String str) {
        this.f154007e.m54193v0(str, this.f154013k.pageId());
    }

    /* JADX INFO: renamed from: u */
    public void m173750u() {
        this.f154008f.m54151k();
    }

    @Override // p153l.iam
    public void destroy() {
    }

    /* JADX INFO: renamed from: l.pta0$b */
    public class ViewOnClickListenerC19441b implements View.OnClickListener {
        public ViewOnClickListenerC19441b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }
}
