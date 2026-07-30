package com.p000p1.mobile.putong.core.newui.profile.newmine.newprofile.task;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.graphics.drawable.shapes.RoundRectShape;
import android.net.Uri;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.facebook.drawee.generic.RoundingParams;
import com.p1.mobile.android.app.Act;
import com.p1.mobile.android.app.c;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.MyTabTask;
import com.p1.mobile.putong.core.data.TaskAvatarDesc;
import com.p1.mobile.putong.core.data.TaskButtonDesc;
import com.p1.mobile.putong.core.ui.VText_Medium;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import l.c4g0;
import l.e30;
import l.f30;
import l.fm5;
import l.j760;
import l.lva;
import l.mkd0;
import l.qib0;
import l.t100;
import l.upa;
import l.vwb;
import l.w0c0;
import l.w9j;
import l.x2c0;
import l.xdl0;
import l.zvf0;
import v.VDraweeView;
import v.VLinear;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class CommonTaskItemView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public CommonTaskItemView f5441a;

    /* JADX INFO: renamed from: b */
    public LinearLayout f5442b;

    /* JADX INFO: renamed from: c */
    public VText_Medium f5443c;

    /* JADX INFO: renamed from: d */
    public VText f5444d;

    /* JADX INFO: renamed from: e */
    public LinearLayout f5445e;

    /* JADX INFO: renamed from: f */
    public FrameLayout f5446f;

    /* JADX INFO: renamed from: g */
    public VText_Medium f5447g;

    /* JADX INFO: renamed from: h */
    public final int f5448h;

    /* JADX INFO: renamed from: i */
    public final int f5449i;

    /* JADX INFO: renamed from: j */
    public Act f5450j;

    /* JADX INFO: renamed from: k */
    public MyTabTask f5451k;

    /* JADX INFO: renamed from: l */
    public boolean f5452l;

    /* JADX INFO: renamed from: m */
    public c4g0 f5453m;

    public CommonTaskItemView(Context context) {
        super(context);
        this.f5448h = Color.parseColor("#EDEDED");
        this.f5449i = Color.parseColor("#f7f7f7");
        this.f5452l = true;
    }

    /* JADX INFO: renamed from: e */
    public final void m7660e(View view) {
        fm5.a(this, view);
    }

    @NonNull
    /* JADX INFO: renamed from: f */
    public final VLinear m7661f(VLinear vLinear, List<String> list, CharSequence charSequence, int i) {
        vLinear.removeAllViews();
        int i2 = t100.m;
        int i3 = t100.i;
        vLinear.setPadding(i2, i3, i2, i3);
        int i4 = t100.o;
        int i5 = t100.g;
        m7663h(list, vLinear, i4, i5, t100.a, i);
        VText_Medium vText_Medium = new VText_Medium(this.f5450j);
        vText_Medium.setTextSize(14.0f);
        vText_Medium.setTextColor(this.f5450j.getResources().getColor(upa.z() ? w0c0.x : w0c0.p));
        vText_Medium.setText(charSequence);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.leftMargin = i5;
        layoutParams.topMargin = t100.c;
        vLinear.addView(vText_Medium, layoutParams);
        return vLinear;
    }

    /* JADX INFO: renamed from: g */
    public void m7662g(List<String> list, ViewGroup viewGroup, int i) {
        m7663h(list, viewGroup, t100.A, t100.m, t100.c, (list.size() == 1 && list.get(0).startsWith("res")) ? 0 : i);
    }

    /* JADX INFO: renamed from: h */
    public final void m7663h(List<String> list, ViewGroup viewGroup, int i, int i2, int i3, int i4) {
        for (String str : list) {
            View vDraweeView = new VDraweeView(this.f5450j);
            RoundingParams roundingParams = new RoundingParams();
            roundingParams.v(true);
            vDraweeView.getHierarchy().H(roundingParams);
            if (i4 != 0) {
                ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
                shapeDrawable.getPaint().setColor(i4);
                vDraweeView.setBackground(shapeDrawable);
                vDraweeView.setPadding(i3, i3, i3, i3);
            }
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i, i);
            if (viewGroup.getChildCount() > 0) {
                layoutParams.leftMargin = -i2;
            }
            viewGroup.addView(vDraweeView, layoutParams);
            qib0.G.I0(vDraweeView, str, i, i);
        }
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m7664i(MyTabTask myTabTask, C0394a.a aVar, boolean z, View view) {
        lva.D(this.f5450j, Uri.parse(myTabTask.button.url));
        m7668m(aVar, myTabTask, z, true);
        m7672q();
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m7665j(List list, boolean z, View view, Integer num) {
        if (view instanceof VLinear) {
            TaskAvatarDesc taskAvatarDesc = (TaskAvatarDesc) list.get(num.intValue() % list.size());
            m7661f((VLinear) view, taskAvatarDesc.avatars, taskAvatarDesc.text, z ? this.f5448h : this.f5449i);
        }
    }

    /* JADX INFO: renamed from: k */
    public void m7666k(@Nullable final C0394a.a aVar, final MyTabTask myTabTask, final boolean z) {
        String str;
        final CommonTaskItemView commonTaskItemView;
        String str2;
        String str3;
        String str4;
        String str5;
        this.f5452l = z;
        this.f5451k = myTabTask;
        Drawable drawable = this.f5450j.getDrawable(z ? x2c0.cf : x2c0.df);
        if (!TextUtils.equals(myTabTask.type, "verification")) {
            if (TextUtils.equals(myTabTask.type, "boost")) {
                boolean z2 = upa.z();
                Act act = this.f5450j;
                if (z2) {
                    str4 = "res://" + act.getPackageName() + "/" + x2c0.Te;
                } else {
                    str4 = "res://" + act.getPackageName() + "/" + x2c0.Se;
                }
                ArrayList arrayList = new ArrayList();
                if (!vwb.J(myTabTask.avatarGroups)) {
                    arrayList.addAll(((TaskAvatarDesc) myTabTask.avatarGroups.get(0)).avatars);
                    arrayList.add(str4);
                }
                commonTaskItemView = this;
                commonTaskItemView.m7667l(myTabTask.title, myTabTask.subTitle, arrayList, drawable, myTabTask.button.text, Color.parseColor("#FF6298"));
                m7670o(null, z);
            } else if (TextUtils.equals(myTabTask.type, "selection")) {
                boolean z3 = upa.z();
                Act act2 = this.f5450j;
                if (z3) {
                    str3 = "res://" + act2.getPackageName() + "/" + x2c0.Xe;
                } else {
                    str3 = "res://" + act2.getPackageName() + "/" + x2c0.We;
                }
                ArrayList arrayList2 = new ArrayList();
                if (!vwb.J(myTabTask.avatarGroups)) {
                    arrayList2.addAll(((TaskAvatarDesc) myTabTask.avatarGroups.get(0)).avatars);
                    arrayList2.add(str3);
                }
                commonTaskItemView = this;
                commonTaskItemView.m7667l(myTabTask.title, myTabTask.subTitle, arrayList2, drawable, myTabTask.button.text, Color.parseColor("#808CA8"));
                m7670o(null, z);
            } else if (TextUtils.equals(myTabTask.type, "mbti")) {
                boolean z4 = upa.z();
                Act act3 = this.f5450j;
                if (z4) {
                    str2 = "res://" + act3.getPackageName() + "/" + x2c0.Ve;
                } else {
                    str2 = "res://" + act3.getPackageName() + "/" + x2c0.Ue;
                }
                m7667l(myTabTask.title, myTabTask.subTitle, vwb.f0(new String[]{str2}), drawable, myTabTask.button.text, getResources().getColor(upa.z() ? w0c0.A : w0c0.I));
                m7670o(null, z);
                if (vwb.J(myTabTask.avatarGroups)) {
                    m7670o(null, z);
                } else {
                    m7671p(((TaskAvatarDesc) myTabTask.avatarGroups.get(0)).avatars, ((TaskAvatarDesc) myTabTask.avatarGroups.get(0)).text, z);
                }
            } else if (TextUtils.equals(myTabTask.type, "game")) {
                boolean z5 = upa.z();
                Act act4 = this.f5450j;
                if (z5) {
                    str = "res://" + act4.getPackageName() + "/" + x2c0.Af;
                } else {
                    str = "res://" + act4.getPackageName() + "/" + x2c0.zf;
                }
                commonTaskItemView = this;
                commonTaskItemView.m7667l(myTabTask.title, myTabTask.subTitle, vwb.f0(new String[]{str}), drawable, myTabTask.button.text, getResources().getColor(upa.z() ? w0c0.A : w0c0.I));
                commonTaskItemView.m7670o(null, z);
                if (vwb.J(myTabTask.avatarGroups)) {
                    commonTaskItemView.m7670o(null, z);
                } else {
                    commonTaskItemView.m7669n(myTabTask.avatarGroups, z);
                }
            }
            xdl0.E0(commonTaskItemView.f5446f, new View.OnClickListener() { // from class: l.bm5
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f10172a.m7664i(myTabTask, aVar, z, view);
                }
            });
            commonTaskItemView.m7668m(aVar, myTabTask, z, false);
        }
        boolean z6 = upa.z();
        Act act5 = this.f5450j;
        if (z6) {
            str5 = "res://" + act5.getPackageName() + "/" + x2c0.kf;
        } else {
            str5 = "res://" + act5.getPackageName() + "/" + x2c0.jf;
        }
        m7667l(myTabTask.title, myTabTask.subTitle, vwb.f0(new String[]{str5}), drawable, myTabTask.button.text, Color.parseColor("#3CB9F0"));
        if ((TextUtils.equals(myTabTask.mode, "sendLike") || TextUtils.equals(myTabTask.mode, "receiveLike")) && !vwb.J(myTabTask.avatarGroups)) {
            m7670o(((TaskAvatarDesc) myTabTask.avatarGroups.get(0)).avatars, z);
        } else if (!TextUtils.equals(myTabTask.mode, "default")) {
            m7670o(null, z);
        } else if (upa.z()) {
            setSubAvatarWithIllustrate(vwb.f0(new j760[]{vwb.Y(Integer.valueOf(x2c0.qf), "更多右滑"), vwb.Y(Integer.valueOf(x2c0.mf), "优先曝光"), vwb.Y(Integer.valueOf(x2c0.sf), "只看认证"), vwb.Y(Integer.valueOf(x2c0.of), "点亮勋章")}));
        } else {
            setSubAvatarWithIllustrate(vwb.f0(new j760[]{vwb.Y(Integer.valueOf(x2c0.pf), "更多右滑"), vwb.Y(Integer.valueOf(x2c0.lf), "优先曝光"), vwb.Y(Integer.valueOf(x2c0.rf), "只看认证"), vwb.Y(Integer.valueOf(x2c0.nf), "点亮勋章")}));
        }
        commonTaskItemView = this;
        xdl0.E0(commonTaskItemView.f5446f, new View.OnClickListener() { // from class: l.bm5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f10172a.m7664i(myTabTask, aVar, z, view);
            }
        });
        commonTaskItemView.m7668m(aVar, myTabTask, z, false);
    }

    /* JADX INFO: renamed from: l */
    public void m7667l(CharSequence charSequence, CharSequence charSequence2, List<String> list, Drawable drawable, CharSequence charSequence3, int i) {
        this.f5442b.removeAllViews();
        if (!vwb.J(list)) {
            m7662g(list, this.f5442b, this.f5452l ? this.f5449i : -1);
        }
        this.f5443c.setText(charSequence);
        this.f5444d.setText(charSequence2);
        this.f5441a.setBackground(drawable);
        this.f5447g.setText(charSequence3);
        float f = t100.h;
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{f, f, f, f, f, f, f, f}, null, null));
        MyTabTask myTabTask = this.f5451k;
        if (myTabTask == null) {
            this.f5447g.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
            shapeDrawable.getPaint().setColor(i);
        } else if (TextUtils.equals(myTabTask.button.type, "pending")) {
            this.f5447g.setCompoundDrawablesWithIntrinsicBounds(x2c0.bf, 0, 0, 0);
            shapeDrawable.getPaint().setColor(Color.argb(77, Color.red(i), Color.green(i), Color.blue(i)));
        } else {
            boolean zEquals = TextUtils.equals(this.f5451k.button.type, "rejected");
            VText_Medium vText_Medium = this.f5447g;
            if (zEquals) {
                vText_Medium.setCompoundDrawablesWithIntrinsicBounds(x2c0.af, 0, 0, 0);
                shapeDrawable.getPaint().setColor(i);
            } else {
                vText_Medium.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
                shapeDrawable.getPaint().setColor(i);
            }
        }
        this.f5446f.setBackground(shapeDrawable);
    }

    /* JADX INFO: renamed from: m */
    public final void m7668m(C0394a.a aVar, MyTabTask myTabTask, boolean z, boolean z2) {
        String str = z ? "p_navigation_view" : "p_task_list";
        if (aVar == null || z2 || !aVar.m7692G(myTabTask.type, myTabTask)) {
            String str2 = "default";
            if (TextUtils.equals(myTabTask.type, "verification")) {
                if (TextUtils.equals(myTabTask.mode, "sendLike")) {
                    str2 = "trial_like";
                } else if (TextUtils.equals(myTabTask.mode, "addLike")) {
                    str2 = "like_limit";
                }
                if (z2) {
                    zvf0.u("e_task_avatar_verify", str, new j760[]{vwb.Y("avatar_verify_task_type", str2)});
                } else {
                    zvf0.A("e_task_avatar_verify", str, new j760[]{vwb.Y("avatar_verify_task_type", str2)});
                }
            } else if (TextUtils.equals(myTabTask.type, "boost")) {
                HashMap map = new HashMap();
                map.put("default", "upload");
                map.put("pending", "review");
                map.put("rejected", "failed");
                map.put("passed", "start_boost");
                map.put("using", "boosting");
                TaskButtonDesc taskButtonDesc = myTabTask.button;
                if (z2) {
                    zvf0.u("e_upload_photo_award", str, new j760[]{vwb.Y("upload_photo_award_status", (String) map.get(taskButtonDesc.type))});
                } else {
                    zvf0.A("e_upload_photo_award", str, new j760[]{vwb.Y("upload_photo_award_status", (String) map.get(taskButtonDesc.type))});
                }
            } else if (TextUtils.equals(myTabTask.type, "selection")) {
                HashMap map2 = new HashMap();
                map2.put("default", "complete_profile");
                map2.put("pending", "review");
                map2.put("rejected", "failed");
                map2.put("working", "success");
                TaskButtonDesc taskButtonDesc2 = myTabTask.button;
                if (z2) {
                    zvf0.u("e_task_selected", str, new j760[]{vwb.Y("selected_task_status", (String) map2.get(taskButtonDesc2.type))});
                } else {
                    zvf0.A("e_task_selected", str, new j760[]{vwb.Y("selected_task_status", (String) map2.get(taskButtonDesc2.type))});
                }
            } else if (TextUtils.equals(myTabTask.type, "game")) {
                if (z2) {
                    zvf0.r("e_task_game", str);
                } else {
                    zvf0.x("e_task_game", str);
                }
            } else if (TextUtils.equals(myTabTask.type, "mbti")) {
                if (z2) {
                    zvf0.r("e_task_mbti", str);
                } else {
                    zvf0.x("e_task_mbti", str);
                }
            }
            if (z) {
                if (z2 && TextUtils.equals(myTabTask.type, "selection") && TextUtils.equals(myTabTask.button.type, "using")) {
                    CoreModule.c.e0.ka(myTabTask.type, z2, true);
                } else {
                    CoreModule.c.e0.ka(myTabTask.type, z2, false);
                }
            }
        }
    }

    /* JADX INFO: renamed from: n */
    public void m7669n(final List<TaskAvatarDesc> list, final boolean z) {
        xdl0.M(this.f5445e, true);
        xdl0.X(this.f5445e, t100.d(12.0f));
        this.f5445e.removeAllViews();
        AutoScrollView autoScrollView = new AutoScrollView(this.f5450j);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        autoScrollView.addView(new VLinear(this.f5450j), layoutParams);
        autoScrollView.addView(new VLinear(this.f5450j), layoutParams);
        autoScrollView.setBackground(this.f5450j.getDrawable(z ? x2c0.hf : x2c0.gf));
        this.f5445e.addView(autoScrollView, new LinearLayout.LayoutParams(-2, -2));
        autoScrollView.m7654m(new f30() { // from class: l.cm5
            public final void call(Object obj, Object obj2) {
                this.f10666a.m7665j(list, z, (View) obj, (Integer) obj2);
            }
        });
    }

    /* JADX INFO: renamed from: o */
    public void m7670o(List<String> list, boolean z) {
        this.f5445e.removeAllViews();
        xdl0.X(this.f5445e, t100.d(20.0f));
        if (vwb.J(list)) {
            return;
        }
        xdl0.M(this.f5445e, true);
        m7662g(list, this.f5445e, z ? this.f5449i : -1);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m7660e(this);
        this.f5450j = xdl0.E(this);
    }

    /* JADX INFO: renamed from: p */
    public void m7671p(List<String> list, CharSequence charSequence, boolean z) {
        xdl0.M(this.f5445e, true);
        xdl0.X(this.f5445e, t100.d(12.0f));
        this.f5445e.removeAllViews();
        View viewM7661f = m7661f(new VLinear(this.f5450j), list, charSequence, z ? this.f5448h : this.f5449i);
        viewM7661f.setBackground(this.f5450j.getDrawable(z ? x2c0.hf : x2c0.gf));
        this.f5445e.addView(viewM7661f, new LinearLayout.LayoutParams(-2, -2));
    }

    /* JADX INFO: renamed from: q */
    public final void m7672q() {
        mkd0.z(this.f5453m);
        this.f5453m = this.f5450j.lifecycle().skip(1).filter(new w9j() { // from class: l.dm5
            public final Object call(Object obj) {
                return Boolean.valueOf(((c) obj) == c.i);
            }
        }).take(1).subscribe(mkd0.G(new e30() { // from class: l.em5
            public final void call(Object obj) {
                CoreModule.c.e0.A7();
            }
        }));
    }

    public void setSubAvatarWithIllustrate(List<j760<Integer, String>> list) {
        xdl0.M(this.f5445e, true);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f5445e.getLayoutParams();
        marginLayoutParams.setMargins(0, t100.d(20.0f), 0, 0);
        this.f5445e.setLayoutParams(marginLayoutParams);
        this.f5445e.removeAllViews();
        for (j760<Integer, String> j760Var : list) {
            VText vText = new VText(this.f5450j);
            vText.setTextSize(14.0f);
            vText.setTextColor(this.f5450j.color(upa.z() ? w0c0.y : w0c0.J0));
            vText.setText((CharSequence) j760Var.b);
            vText.setMaxLines(1);
            vText.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, this.f5450j.getDrawable(((Integer) j760Var.a).intValue()), (Drawable) null, (Drawable) null);
            vText.setCompoundDrawablePadding(t100.d(7.0f));
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
            layoutParams.gravity = 16;
            if (this.f5445e.getChildCount() > 0) {
                layoutParams.leftMargin = t100.o;
            }
            this.f5445e.addView((View) vText, (ViewGroup.LayoutParams) layoutParams);
        }
    }

    public CommonTaskItemView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f5448h = Color.parseColor("#EDEDED");
        this.f5449i = Color.parseColor("#f7f7f7");
        this.f5452l = true;
    }

    public CommonTaskItemView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f5448h = Color.parseColor("#EDEDED");
        this.f5449i = Color.parseColor("#f7f7f7");
        this.f5452l = true;
    }
}
