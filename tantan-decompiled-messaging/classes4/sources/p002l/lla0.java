package p002l;

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
import android.widget.TextView;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.core.p001ui.profile.loop.LoopInputType;
import com.p000p1.mobile.putong.core.p001ui.profile.loop.ProfileInfoLoopEditAct;
import com.p000p1.mobile.putong.core.p001ui.profile.loop.base.LoopSelectFillData;
import com.p000p1.mobile.putong.core.p001ui.profile.loop.input.ProfileLoopSelectInputFrag;
import com.p000p1.mobile.putong.core.p001ui.profile.views.ProfileLoopActionLayout;
import com.p000p1.mobile.putong.core.p001ui.profile.views.ProfileLoopEditPetUploadPhoto;
import com.p000p1.mobile.putong.core.p001ui.profile.views.ProfileLoopEditUploadPhoto;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.profile.R;
import com.p1.mobile.putong.data.Media;
import com.p1.mobile.putong.data.User;
import com.tantanapp.common.utils.NullChecker;
import java.util.ArrayList;
import java.util.List;
import l.a5c0;
import l.c1c0;
import l.e30;
import l.e3c0;
import l.eqh0;
import l.lqa;
import l.mla0;
import l.n6c0;
import l.pj90;
import l.s7m;
import l.t100;
import l.xdl0;
import v.VList;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class lla0 implements s7m<jla0> {

    /* JADX INFO: renamed from: a */
    public TextView f14923a;

    /* JADX INFO: renamed from: b */
    public TextView f14924b;

    /* JADX INFO: renamed from: c */
    public VList f14925c;

    /* JADX INFO: renamed from: d */
    public ProfileLoopEditUploadPhoto f14926d;

    /* JADX INFO: renamed from: e */
    public ProfileLoopEditPetUploadPhoto f14927e;

    /* JADX INFO: renamed from: f */
    public ProfileLoopActionLayout f14928f;

    /* JADX INFO: renamed from: g */
    public FrameLayout f14929g;

    /* JADX INFO: renamed from: h */
    public jla0 f14930h;

    /* JADX INFO: renamed from: i */
    public C0666c f14931i;

    /* JADX INFO: renamed from: j */
    public Context f14932j;

    /* JADX INFO: renamed from: k */
    public ProfileLoopSelectInputFrag f14933k;

    /* JADX INFO: renamed from: l.lla0$a */
    public class C0664a implements AdapterView.OnItemClickListener {
        public C0664a() {
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            lla0.this.f14930h.m16020L0(i);
        }
    }

    /* JADX INFO: renamed from: l.lla0$c */
    public class C0666c extends BaseAdapter {

        /* JADX INFO: renamed from: a */
        public ArrayList<LoopSelectFillData> f14936a = new ArrayList<>();

        /* JADX INFO: renamed from: b */
        public jla0 f14937b;

        public C0666c(jla0 jla0Var) {
            this.f14937b = jla0Var;
        }

        @Override // android.widget.Adapter
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public LoopSelectFillData getItem(int i) {
            return this.f14936a.get(i);
        }

        /* JADX INFO: renamed from: b */
        public void m17313b(ArrayList<LoopSelectFillData> arrayList) {
            this.f14936a.clear();
            this.f14936a.addAll(arrayList);
            notifyDataSetChanged();
        }

        @Override // android.widget.Adapter
        public int getCount() {
            return this.f14936a.size();
        }

        @Override // android.widget.Adapter
        public long getItemId(int i) {
            return i;
        }

        @Override // android.widget.Adapter
        public View getView(int i, View view, ViewGroup viewGroup) {
            C0667d c0667d;
            if (view == null) {
                view = LayoutInflater.from(lla0.this.act()).inflate(n6c0.w, viewGroup, false);
                c0667d = lla0.this.new C0667d();
                c0667d.f14939a = (TextView) view.findViewById(a5c0.Y);
                c0667d.f14940b = (ImageView) view.findViewById(a5c0.a);
                c0667d.f14941c = view.findViewById(a5c0.y);
                view.setTag(a5c0.z, c0667d);
            } else {
                c0667d = (C0667d) view.getTag(a5c0.z);
            }
            LoopSelectFillData item = getItem(i);
            if (i == 0 && TextUtils.equals(item.m2063c(), lla0.this.f14933k.getString(R.string.V2))) {
                c0667d.f14939a.setTextColor(Color.parseColor("#e6000000"));
                c0667d.f14939a.setTypeface(Typeface.DEFAULT_BOLD);
                xdl0.M0(c0667d.f14940b, true);
                c0667d.f14940b.setImageDrawable(lla0.this.f14933k.getResources().getDrawable(e3c0.s));
            } else {
                c0667d.f14939a.setTypeface(Typeface.DEFAULT);
                xdl0.M(c0667d.f14940b, item.m2065e() || item.m2071k());
                c0667d.f14940b.setImageDrawable(lla0.this.f14933k.getResources().getDrawable(e3c0.r0));
            }
            if (item.m2064d() == LoopSelectFillData.LoopSelectType.SELECT_JUST_TEXT) {
                xdl0.W(c0667d.f14941c, t100.d(40.0f));
                xdl0.V(c0667d.f14941c, t100.d(40.0f));
                xdl0.X(c0667d.f14941c, t100.d(6.0f));
                xdl0.U(c0667d.f14941c, t100.d(6.0f));
                c0667d.f14939a.setTypeface(eqh0.c(3));
                c0667d.f14939a.setGravity(17);
                xdl0.W(c0667d.f14939a, 0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) c0667d.f14939a.getLayoutParams();
                layoutParams.gravity = 17;
                c0667d.f14939a.setLayoutParams(layoutParams);
                boolean zM2066f = item.m2066f();
                View view2 = c0667d.f14941c;
                if (zM2066f) {
                    view2.setBackgroundResource(e3c0.p0);
                    c0667d.f14939a.setTextColor(-1);
                    c0667d.f14939a.setTextSize(16.0f);
                } else {
                    view2.setBackgroundResource(e3c0.q0);
                    c0667d.f14939a.setTextColor(-13487566);
                    c0667d.f14939a.setTextSize(16.0f);
                }
            } else if (item.m2066f()) {
                c0667d.f14941c.setBackgroundResource(e3c0.t0);
                c0667d.f14939a.setTextColor(lla0.this.f14933k.getResources().getColor(c1c0.f));
                xdl0.M0(c0667d.f14940b, true);
                c0667d.f14940b.setImageDrawable(lla0.this.f14933k.getResources().getDrawable(e3c0.h));
            } else {
                c0667d.f14941c.setBackgroundResource(e3c0.s0);
                c0667d.f14939a.setTextColor(Color.parseColor("#cf000000"));
            }
            c0667d.f14939a.setText(item.m2063c());
            return view;
        }
    }

    /* JADX INFO: renamed from: l.lla0$d */
    public class C0667d {

        /* JADX INFO: renamed from: a */
        public TextView f14939a;

        /* JADX INFO: renamed from: b */
        public ImageView f14940b;

        /* JADX INFO: renamed from: c */
        public View f14941c;

        public C0667d() {
        }
    }

    public lla0(Context context, ProfileLoopSelectInputFrag profileLoopSelectInputFrag) {
        this.f14932j = context;
        this.f14933k = profileLoopSelectInputFrag;
    }

    /* JADX INFO: renamed from: r */
    private void m17295r() {
        this.f14928f.m3527l(this.f14933k);
        if (TextUtils.equals("from_card_guide_improve_profile", this.f14933k.f1274F)) {
            this.f14928f.setNextButton(m17300f().getResources().getString(R.string.f));
        }
        m17300f().m1991a2().m2030W0(this.f14933k);
        C0666c c0666c = new C0666c(this.f14930h);
        this.f14931i = c0666c;
        this.f14925c.setAdapter(c0666c);
        this.f14925c.setOnItemClickListener(new C0664a());
        this.f14929g.setOnClickListener(new ViewOnClickListenerC0665b());
        xdl0.M(this.f14924b, lqa.g());
    }

    @Nullable
    /* JADX INFO: renamed from: C0 */
    public Context m17296C0() {
        return this.f14932j;
    }

    /* JADX INFO: renamed from: c */
    public View m17297c(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return mla0.b(this, layoutInflater, viewGroup);
    }

    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public void m17302i1(jla0 jla0Var) {
        this.f14930h = jla0Var;
    }

    /* JADX INFO: renamed from: e */
    public Bundle m17299e() {
        return this.f14933k.getArguments();
    }

    /* JADX INFO: renamed from: f */
    public ProfileInfoLoopEditAct m17300f() {
        return (ProfileInfoLoopEditAct) this.f14932j;
    }

    /* JADX INFO: renamed from: i */
    public void m17301i() {
        this.f14928f.m3522g();
    }

    public View inflateView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewM17297c = m17297c(layoutInflater, viewGroup);
        m17295r();
        return viewM17297c;
    }

    /* JADX INFO: renamed from: j */
    public void m17303j() {
        xdl0.M(this.f14929g, false);
    }

    /* JADX INFO: renamed from: k */
    public void m17304k(User user) {
        this.f14927e.setUser(user);
        this.f14927e.m3567u0(this.f14933k.pageId());
        m17311u();
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m17305l(String str) {
        this.f14927e.m3555i0(str, this.f14933k.pageId());
    }

    /* JADX INFO: renamed from: m */
    public void m17306m(List<Media> list, int i) {
        if (this.f14930h.m16012A0()) {
            this.f14927e.m3565s0(act(), list, new e30() { // from class: l.kla0
                public final void call(Object obj) {
                    this.f14372a.m17305l((String) obj);
                }
            });
        } else {
            this.f14926d.m3580a0(list);
        }
    }

    /* JADX INFO: renamed from: n */
    public void m17307n(ArrayList<LoopSelectFillData> arrayList) {
        this.f14931i.m17313b(arrayList);
    }

    /* JADX INFO: renamed from: p */
    public void m17308p(LoopInputType loopInputType) {
        if (loopInputType == LoopInputType.HOMETOWN && lqa.g()) {
            xdl0.M(this.f14924b, false);
        }
        xdl0.M(this.f14924b, false);
        if (lqa.f() && this.f14933k.m2081U4()) {
            String strM = pj90.m(loopInputType);
            xdl0.X(this.f14923a, 0);
            if (!TextUtils.isEmpty(strM)) {
                xdl0.M(this.f14924b, true);
                xdl0.X(this.f14924b, t100.d(12.0f));
                xdl0.X(this.f14925c, t100.d(20.0f));
                this.f14924b.setTextSize(15.0f);
                this.f14924b.setTextColor(Color.parseColor("#a9a9a9"));
                this.f14924b.setText(String.format("预计符合%s人的理想型", strM));
            }
        }
        LoopInputType loopInputType2 = LoopInputType.QUALIFICATION;
        TextView textView = this.f14923a;
        if (loopInputType == loopInputType2) {
            textView.setText(R.string.o1);
        } else {
            textView.setText(loopInputType.title);
        }
        if (this.f14930h.m16012A0()) {
            xdl0.c0(this.f14925c, 0);
        }
        LoopInputType loopInputType3 = LoopInputType.GAME_NAME;
        if (loopInputType == loopInputType3 || loopInputType == LoopInputType.GAME_TOGETHER || loopInputType == LoopInputType.GAME_VOICE) {
            xdl0.M(this.f14924b, false);
        }
        if (this.f14930h.m16012A0() && this.f14933k.m2082V4()) {
            xdl0.M(this.f14924b, true);
            String str = "他";
            if (!CoreModule.P().a().eg() && (CoreModule.P().a().N8() || !CoreModule.c.e0.na().isFemale())) {
                str = "她";
            }
            this.f14924b.setText("你有宠物吗？上传更多宠物照片，萌化" + str + "们");
            xdl0.U(this.f14924b, t100.d(10.0f));
            xdl0.X(this.f14925c, t100.d(6.0f));
        }
        if (TextUtils.equals("from_card_guide_improve_profile", this.f14933k.f1274F)) {
            xdl0.M(this.f14924b, true);
            String str2 = this.f14933k.f1275G;
            if (TextUtils.isEmpty(str2)) {
                this.f14924b.setText("根据你的选择，自动生成留言发送");
            } else {
                User userPa = CoreModule.c.e0.Pa(str2);
                boolean zA = NullChecker.a(userPa);
                TextView textView2 = this.f14924b;
                if (zA) {
                    textView2.setText("根据你的选择，自动生成留言发送给" + userPa.getPronoun());
                } else {
                    textView2.setText("根据你的选择，自动生成留言发送");
                }
            }
            if (loopInputType == loopInputType3) {
                this.f14923a.setText("在玩的游戏（多选）");
            }
            xdl0.X(this.f14923a, 4);
            xdl0.X(this.f14924b, t100.d(12.0f));
            xdl0.X(this.f14925c, 0);
            this.f14924b.setTextSize(15.0f);
            this.f14924b.setTextColor(Color.parseColor("#a9a9a9"));
            xdl0.M0(this.f14924b, true);
        }
    }

    /* JADX INFO: renamed from: q */
    public void m17309q() {
        xdl0.M(this.f14929g, true);
    }

    /* JADX INFO: renamed from: s */
    public void m17310s(String str) {
        this.f14927e.m3568v0(str, this.f14933k.pageId());
    }

    /* JADX INFO: renamed from: u */
    public void m17311u() {
        this.f14928f.m3526k();
    }

    public void destroy() {
    }

    /* JADX INFO: renamed from: l.lla0$b */
    public class ViewOnClickListenerC0665b implements View.OnClickListener {
        public ViewOnClickListenerC0665b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
        }
    }
}
