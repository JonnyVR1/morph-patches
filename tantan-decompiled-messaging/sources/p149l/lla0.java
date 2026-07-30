package p149l;

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
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.CoreStaticData;
import com.p046p1.mobile.putong.core.p053ui.profile.loop.LoopInputType;
import com.p046p1.mobile.putong.core.p053ui.profile.loop.ProfileInfoLoopEditAct;
import com.p046p1.mobile.putong.core.p053ui.profile.loop.base.LoopSelectFillData;
import com.p046p1.mobile.putong.core.p053ui.profile.loop.input.ProfileLoopSelectInputFrag;
import com.p046p1.mobile.putong.core.p053ui.profile.views.ProfileLoopActionLayout;
import com.p046p1.mobile.putong.core.p053ui.profile.views.ProfileLoopEditPetUploadPhoto;
import com.p046p1.mobile.putong.core.p053ui.profile.views.ProfileLoopEditUploadPhoto;
import com.p046p1.mobile.putong.core.profile.R$string;
import com.p046p1.mobile.putong.data.Media;
import com.p046p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import p147v.VList;

/* JADX INFO: loaded from: classes4.dex */
public class lla0 implements s7m<jla0> {

    /* JADX INFO: renamed from: a */
    public TextView f128665a;

    /* JADX INFO: renamed from: b */
    public TextView f128666b;

    /* JADX INFO: renamed from: c */
    public VList f128667c;

    /* JADX INFO: renamed from: d */
    public ProfileLoopEditUploadPhoto f128668d;

    /* JADX INFO: renamed from: e */
    public ProfileLoopEditPetUploadPhoto f128669e;

    /* JADX INFO: renamed from: f */
    public ProfileLoopActionLayout f128670f;

    /* JADX INFO: renamed from: g */
    public FrameLayout f128671g;

    /* JADX INFO: renamed from: h */
    public jla0 f128672h;

    /* JADX INFO: renamed from: i */
    public C18253c f128673i;

    /* JADX INFO: renamed from: j */
    public Context f128674j;

    /* JADX INFO: renamed from: k */
    public ProfileLoopSelectInputFrag f128675k;

    /* JADX INFO: renamed from: l.lla0$a */
    public class C18251a implements AdapterView.OnItemClickListener {
        public C18251a() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            lla0.this.f128672h.m142038L0(i);
        }
    }

    /* JADX INFO: renamed from: l.lla0$c */
    public class C18253c extends BaseAdapter {

        /* JADX INFO: renamed from: a */
        public ArrayList<LoopSelectFillData> f128678a = new ArrayList<>();

        /* JADX INFO: renamed from: b */
        public jla0 f128679b;

        public C18253c(jla0 jla0Var) {
            this.f128679b = jla0Var;
        }

        @Override // android.widget.Adapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public LoopSelectFillData getItem(int i) {
            return this.f128678a.get(i);
        }

        /* JADX INFO: renamed from: b */
        public void m150465b(ArrayList<LoopSelectFillData> arrayList) {
            this.f128678a.clear();
            this.f128678a.addAll(arrayList);
            notifyDataSetChanged();
        }

        @Override // android.widget.Adapter
        public int getCount() {
            return this.f128678a.size();
        }

        @Override // android.widget.Adapter
        public long getItemId(int i) {
            return i;
        }

        @Override // android.widget.Adapter
        public View getView(int i, View view, ViewGroup viewGroup) {
            C18254d c18254d;
            if (view == null) {
                view = LayoutInflater.from(lla0.this.getAct()).inflate(n6c0.f137384w, viewGroup, false);
                c18254d = lla0.this.new C18254d();
                c18254d.f128681a = (TextView) view.findViewById(a5c0.f67671Y);
                c18254d.f128682b = (ImageView) view.findViewById(a5c0.f67673a);
                c18254d.f128683c = view.findViewById(a5c0.f67702y);
                view.setTag(a5c0.f67703z, c18254d);
            } else {
                c18254d = (C18254d) view.getTag(a5c0.f67703z);
            }
            LoopSelectFillData item = getItem(i);
            if (i == 0 && TextUtils.equals(item.m51577c(), lla0.this.f128675k.getString(R$string.f27793V2))) {
                c18254d.f128681a.setTextColor(Color.parseColor("#e6000000"));
                c18254d.f128681a.setTypeface(Typeface.DEFAULT_BOLD);
                xdl0.m208345M0(c18254d.f128682b, true);
                c18254d.f128682b.setImageDrawable(lla0.this.f128675k.getResources().getDrawable(e3c0.f89144s));
            } else {
                c18254d.f128681a.setTypeface(Typeface.DEFAULT);
                xdl0.m208344M(c18254d.f128682b, item.m51579e() || item.m51585k());
                c18254d.f128682b.setImageDrawable(lla0.this.f128675k.getResources().getDrawable(e3c0.f89142r0));
            }
            if (item.m51578d() == LoopSelectFillData.LoopSelectType.SELECT_JUST_TEXT) {
                xdl0.m208359W(c18254d.f128683c, t100.m186890d(40.0f));
                xdl0.m208358V(c18254d.f128683c, t100.m186890d(40.0f));
                xdl0.m208360X(c18254d.f128683c, t100.m186890d(6.0f));
                xdl0.m208357U(c18254d.f128683c, t100.m186890d(6.0f));
                c18254d.f128681a.setTypeface(eqh0.m117752c(3));
                c18254d.f128681a.setGravity(17);
                xdl0.m208359W(c18254d.f128681a, 0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) c18254d.f128681a.getLayoutParams();
                layoutParams.gravity = 17;
                c18254d.f128681a.setLayoutParams(layoutParams);
                boolean zM51580f = item.m51580f();
                View view2 = c18254d.f128683c;
                if (zM51580f) {
                    view2.setBackgroundResource(e3c0.f89136p0);
                    c18254d.f128681a.setTextColor(-1);
                    c18254d.f128681a.setTextSize(16.0f);
                } else {
                    view2.setBackgroundResource(e3c0.f89139q0);
                    c18254d.f128681a.setTextColor(-13487566);
                    c18254d.f128681a.setTextSize(16.0f);
                }
            } else if (item.m51580f()) {
                c18254d.f128683c.setBackgroundResource(e3c0.f89148t0);
                c18254d.f128681a.setTextColor(lla0.this.f128675k.getResources().getColor(c1c0.f78249f));
                xdl0.m208345M0(c18254d.f128682b, true);
                c18254d.f128682b.setImageDrawable(lla0.this.f128675k.getResources().getDrawable(e3c0.f89111h));
            } else {
                c18254d.f128683c.setBackgroundResource(e3c0.f89145s0);
                c18254d.f128681a.setTextColor(Color.parseColor("#cf000000"));
            }
            c18254d.f128681a.setText(item.m51577c());
            return view;
        }
    }

    /* JADX INFO: renamed from: l.lla0$d */
    public class C18254d {

        /* JADX INFO: renamed from: a */
        public TextView f128681a;

        /* JADX INFO: renamed from: b */
        public ImageView f128682b;

        /* JADX INFO: renamed from: c */
        public View f128683c;

        public C18254d() {
        }
    }

    public lla0(Context context, ProfileLoopSelectInputFrag profileLoopSelectInputFrag) {
        this.f128674j = context;
        this.f128675k = profileLoopSelectInputFrag;
    }

    /* JADX INFO: renamed from: r */
    private void m150449r() {
        this.f128670f.m52969l(this.f128675k);
        if (TextUtils.equals(CoreStaticData.ProfileFromType.FROM_CARD_GUIDE_IMPROVE_PROFILE, this.f128675k.f33452F)) {
            this.f128670f.setNextButton(m150453f().getResources().getString(R$string.f27845f));
        }
        m150453f().m51509a2().m51548W0(this.f128675k);
        C18253c c18253c = new C18253c(this.f128672h);
        this.f128673i = c18253c;
        this.f128667c.setAdapter((ListAdapter) c18253c);
        this.f128667c.setOnItemClickListener(new C18251a());
        this.f128671g.setOnClickListener(new ViewOnClickListenerC18252b());
        xdl0.m208344M(this.f128666b, lqa.m150969g());
    }

    @Override // p149l.s7m
    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context getContext() {
        return this.f128674j;
    }

    /* JADX INFO: renamed from: c */
    public View m150450c(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return mla0.m155137b(this, layoutInflater, viewGroup);
    }

    @Override // p149l.s7m
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void mo21065i1(jla0 jla0Var) {
        this.f128672h = jla0Var;
    }

    /* JADX INFO: renamed from: e */
    public Bundle m150452e() {
        return this.f128675k.getArguments();
    }

    /* JADX INFO: renamed from: f */
    public ProfileInfoLoopEditAct m150453f() {
        return (ProfileInfoLoopEditAct) this.f128674j;
    }

    /* JADX INFO: renamed from: i */
    public void m150454i() {
        this.f128670f.m52964g();
    }

    @Override // p149l.s7m
    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewM150450c = m150450c(layoutInflater, viewGroup);
        m150449r();
        return viewM150450c;
    }

    /* JADX INFO: renamed from: j */
    public void m150455j() {
        xdl0.m208344M(this.f128671g, false);
    }

    /* JADX INFO: renamed from: k */
    public void m150456k(User user) {
        this.f128669e.setUser(user);
        this.f128669e.m53009u0(this.f128675k.pageId());
        m150463u();
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m150457l(String str) {
        this.f128669e.m52997i0(str, this.f128675k.pageId());
    }

    /* JADX INFO: renamed from: m */
    public void m150458m(List<Media> list, int i) {
        if (this.f128672h.m142030A0()) {
            this.f128669e.m53007s0(getAct(), list, new e30() { // from class: l.kla0
                @Override // p149l.e30
                public final void call(Object obj) {
                    this.f123645a.m150457l((String) obj);
                }
            });
        } else {
            this.f128668d.m53022a0(list);
        }
    }

    /* JADX INFO: renamed from: n */
    public void m150459n(ArrayList<LoopSelectFillData> arrayList) {
        this.f128673i.m150465b(arrayList);
    }

    /* JADX INFO: renamed from: p */
    public void m150460p(LoopInputType loopInputType) {
        if (loopInputType == LoopInputType.HOMETOWN && lqa.m150969g()) {
            xdl0.m208344M(this.f128666b, false);
        }
        xdl0.m208344M(this.f128666b, false);
        if (lqa.m150968f() && this.f128675k.m51595U4()) {
            String strM169801m = pj90.m169801m(loopInputType);
            xdl0.m208360X(this.f128665a, 0);
            if (!TextUtils.isEmpty(strM169801m)) {
                xdl0.m208344M(this.f128666b, true);
                xdl0.m208360X(this.f128666b, t100.m186890d(12.0f));
                xdl0.m208360X(this.f128667c, t100.m186890d(20.0f));
                this.f128666b.setTextSize(15.0f);
                this.f128666b.setTextColor(Color.parseColor("#a9a9a9"));
                this.f128666b.setText(String.format("预计符合%s人的理想型", strM169801m));
            }
        }
        LoopInputType loopInputType2 = LoopInputType.QUALIFICATION;
        TextView textView = this.f128665a;
        if (loopInputType == loopInputType2) {
            textView.setText(R$string.f27901o1);
        } else {
            textView.setText(loopInputType.title);
        }
        if (this.f128672h.m142030A0()) {
            xdl0.m208368c0(this.f128667c, 0);
        }
        LoopInputType loopInputType3 = LoopInputType.GAME_NAME;
        if (loopInputType == loopInputType3 || loopInputType == LoopInputType.GAME_TOGETHER || loopInputType == LoopInputType.GAME_VOICE) {
            xdl0.m208344M(this.f128666b, false);
        }
        if (this.f128672h.m142030A0() && this.f128675k.m51596V4()) {
            xdl0.m208344M(this.f128666b, true);
            String str = "他";
            if (!CoreModule.m29935P().m94651a().mo33491eg() && (CoreModule.m29935P().m94651a().mo33374N8() || !CoreModule.f17545c.f19639e0.m169520na().isFemale())) {
                str = "她";
            }
            this.f128666b.setText("你有宠物吗？上传更多宠物照片，萌化" + str + "们");
            xdl0.m208357U(this.f128666b, t100.m186890d(10.0f));
            xdl0.m208360X(this.f128667c, t100.m186890d(6.0f));
        }
        if (TextUtils.equals(CoreStaticData.ProfileFromType.FROM_CARD_GUIDE_IMPROVE_PROFILE, this.f128675k.f33452F)) {
            xdl0.m208344M(this.f128666b, true);
            String str2 = this.f128675k.f33453G;
            if (TextUtils.isEmpty(str2)) {
                this.f128666b.setText("根据你的选择，自动生成留言发送");
            } else {
                User userM169430Pa = CoreModule.f17545c.f19639e0.m169430Pa(str2);
                boolean zM81303a = NullChecker.m81303a(userM169430Pa);
                TextView textView2 = this.f128666b;
                if (zM81303a) {
                    textView2.setText("根据你的选择，自动生成留言发送给" + userM169430Pa.getPronoun());
                } else {
                    textView2.setText("根据你的选择，自动生成留言发送");
                }
            }
            if (loopInputType == loopInputType3) {
                this.f128665a.setText("在玩的游戏（多选）");
            }
            xdl0.m208360X(this.f128665a, 4);
            xdl0.m208360X(this.f128666b, t100.m186890d(12.0f));
            xdl0.m208360X(this.f128667c, 0);
            this.f128666b.setTextSize(15.0f);
            this.f128666b.setTextColor(Color.parseColor("#a9a9a9"));
            xdl0.m208345M0(this.f128666b, true);
        }
    }

    /* JADX INFO: renamed from: q */
    public void m150461q() {
        xdl0.m208344M(this.f128671g, true);
    }

    /* JADX INFO: renamed from: s */
    public void m150462s(String str) {
        this.f128669e.m53010v0(str, this.f128675k.pageId());
    }

    /* JADX INFO: renamed from: u */
    public void m150463u() {
        this.f128670f.m52968k();
    }

    @Override // p149l.s7m
    public void destroy() {
    }

    /* JADX INFO: renamed from: l.lla0$b */
    public class ViewOnClickListenerC18252b implements View.OnClickListener {
        public ViewOnClickListenerC18252b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }
}
