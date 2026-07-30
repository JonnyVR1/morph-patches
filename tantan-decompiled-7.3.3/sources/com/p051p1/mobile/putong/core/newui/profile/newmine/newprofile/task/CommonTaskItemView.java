package com.p051p1.mobile.putong.core.newui.profile.newmine.newprofile.task;

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
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.android.app.C4470c;
import com.p051p1.mobile.putong.core.CoreModule;
import com.p051p1.mobile.putong.core.data.MyTabTask;
import com.p051p1.mobile.putong.core.data.ProfileLikeType;
import com.p051p1.mobile.putong.core.data.TaskAvatarDesc;
import com.p051p1.mobile.putong.core.data.TaskButtonDesc;
import com.p051p1.mobile.putong.core.p058ui.VText_Medium;
import com.p051p1.mobile.putong.data.NavigationCardIntent;
import com.p051p1.mobile.putong.data.OMSDialogPositon;
import com.tantanapp.media.ttmediautils.tinker.ShareConstants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import p151v.VDraweeView;
import p151v.VLinear;
import p151v.VText;
import p153l.bnl0;
import p153l.c9c0;
import p153l.dbc0;
import p153l.gra;
import p153l.i4g0;
import p153l.jn5;
import p153l.jyb;
import p153l.kcg0;
import p153l.pf60;
import p153l.psd0;
import p153l.qa00;
import p153l.qcj;
import p153l.uqb0;
import p153l.wlj;
import p153l.xwa;
import p153l.y20;
import p153l.z20;

/* JADX INFO: loaded from: classes11.dex */
public class CommonTaskItemView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public CommonTaskItemView f27511a;

    /* JADX INFO: renamed from: b */
    public LinearLayout f27512b;

    /* JADX INFO: renamed from: c */
    public VText_Medium f27513c;

    /* JADX INFO: renamed from: d */
    public VText f27514d;

    /* JADX INFO: renamed from: e */
    public LinearLayout f27515e;

    /* JADX INFO: renamed from: f */
    public FrameLayout f27516f;

    /* JADX INFO: renamed from: g */
    public VText_Medium f27517g;

    /* JADX INFO: renamed from: h */
    public final int f27518h;

    /* JADX INFO: renamed from: i */
    public final int f27519i;

    /* JADX INFO: renamed from: j */
    public Act f27520j;

    /* JADX INFO: renamed from: k */
    public MyTabTask f27521k;

    /* JADX INFO: renamed from: l */
    public boolean f27522l;

    /* JADX INFO: renamed from: m */
    public kcg0 f27523m;

    public CommonTaskItemView(Context context) {
        super(context);
        this.f27518h = Color.parseColor("#EDEDED");
        this.f27519i = Color.parseColor("#f7f7f7");
        this.f27522l = true;
    }

    /* JADX INFO: renamed from: e */
    public final void m44607e(View view) {
        jn5.m146214a(this, view);
    }

    @NonNull
    /* JADX INFO: renamed from: f */
    public final VLinear m44608f(VLinear vLinear, List<String> list, CharSequence charSequence, int i) {
        vLinear.removeAllViews();
        int i2 = qa00.f156326m;
        int i3 = qa00.f156322i;
        vLinear.setPadding(i2, i3, i2, i3);
        int i4 = qa00.f156328o;
        int i5 = qa00.f156320g;
        m44610h(list, vLinear, i4, i5, qa00.f156314a, i);
        VText_Medium vText_Medium = new VText_Medium(this.f27520j);
        vText_Medium.setTextSize(14.0f);
        vText_Medium.setTextColor(this.f27520j.getResources().getColor(gra.m131778z() ? c9c0.f80469x : c9c0.f80445p));
        vText_Medium.setText(charSequence);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.leftMargin = i5;
        layoutParams.topMargin = qa00.f156316c;
        vLinear.addView(vText_Medium, layoutParams);
        return vLinear;
    }

    /* JADX INFO: renamed from: g */
    public void m44609g(List<String> list, ViewGroup viewGroup, int i) {
        m44610h(list, viewGroup, qa00.f156288A, qa00.f156326m, qa00.f156316c, (list.size() == 1 && list.get(0).startsWith(ShareConstants.RES_PATH)) ? 0 : i);
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /* JADX INFO: renamed from: h */
    public final void m44610h(List<String> list, ViewGroup viewGroup, int i, int i2, int i3, int i4) {
        for (String str : list) {
            VDraweeView vDraweeView = new VDraweeView(this.f27520j);
            RoundingParams roundingParams = new RoundingParams();
            roundingParams.m8322v(true);
            ((wlj) vDraweeView.getHierarchy()).m207045H(roundingParams);
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
            uqb0.f180374G.m127109I0(vDraweeView, str, i, i);
        }
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m44611i(MyTabTask myTabTask, C8393a.a aVar, boolean z, View view) {
        xwa.m213304D(this.f27520j, Uri.parse(myTabTask.button.url));
        m44615m(aVar, myTabTask, z, true);
        m44619q();
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m44612j(List list, boolean z, View view, Integer num) {
        if (view instanceof VLinear) {
            TaskAvatarDesc taskAvatarDesc = (TaskAvatarDesc) list.get(num.intValue() % list.size());
            m44608f((VLinear) view, taskAvatarDesc.avatars, taskAvatarDesc.text, z ? this.f27518h : this.f27519i);
        }
    }

    /* JADX INFO: renamed from: k */
    public void m44613k(@Nullable final C8393a.a aVar, final MyTabTask myTabTask, final boolean z) {
        String str;
        final CommonTaskItemView commonTaskItemView;
        String str2;
        String str3;
        String str4;
        String str5;
        this.f27522l = z;
        this.f27521k = myTabTask;
        Drawable drawable = this.f27520j.getDrawable(z ? dbc0.f86536Rf : dbc0.f86568Sf);
        if (!TextUtils.equals(myTabTask.type, "verification")) {
            if (TextUtils.equals(myTabTask.type, "boost")) {
                boolean zM131778z = gra.m131778z();
                Act act = this.f27520j;
                if (zM131778z) {
                    str4 = "res://" + act.getPackageName() + "/" + dbc0.f86248If;
                } else {
                    str4 = "res://" + act.getPackageName() + "/" + dbc0.f86216Hf;
                }
                ArrayList arrayList = new ArrayList();
                if (!jyb.m147479J(myTabTask.avatarGroups)) {
                    arrayList.addAll(myTabTask.avatarGroups.get(0).avatars);
                    arrayList.add(str4);
                }
                commonTaskItemView = this;
                commonTaskItemView.m44614l(myTabTask.title, myTabTask.subTitle, arrayList, drawable, myTabTask.button.text, Color.parseColor("#FF6298"));
                m44617o(null, z);
            } else if (TextUtils.equals(myTabTask.type, "selection")) {
                boolean zM131778z2 = gra.m131778z();
                Act act2 = this.f27520j;
                if (zM131778z2) {
                    str3 = "res://" + act2.getPackageName() + "/" + dbc0.f86376Mf;
                } else {
                    str3 = "res://" + act2.getPackageName() + "/" + dbc0.f86344Lf;
                }
                ArrayList arrayList2 = new ArrayList();
                if (!jyb.m147479J(myTabTask.avatarGroups)) {
                    arrayList2.addAll(myTabTask.avatarGroups.get(0).avatars);
                    arrayList2.add(str3);
                }
                commonTaskItemView = this;
                commonTaskItemView.m44614l(myTabTask.title, myTabTask.subTitle, arrayList2, drawable, myTabTask.button.text, Color.parseColor("#808CA8"));
                m44617o(null, z);
            } else if (TextUtils.equals(myTabTask.type, ProfileLikeType.mbti)) {
                boolean zM131778z3 = gra.m131778z();
                Act act3 = this.f27520j;
                if (zM131778z3) {
                    str2 = "res://" + act3.getPackageName() + "/" + dbc0.f86312Kf;
                } else {
                    str2 = "res://" + act3.getPackageName() + "/" + dbc0.f86280Jf;
                }
                m44614l(myTabTask.title, myTabTask.subTitle, jyb.m147507f0(str2), drawable, myTabTask.button.text, getResources().getColor(gra.m131778z() ? c9c0.f80318A : c9c0.f80342I));
                m44617o(null, z);
                if (jyb.m147479J(myTabTask.avatarGroups)) {
                    m44617o(null, z);
                } else {
                    m44618p(myTabTask.avatarGroups.get(0).avatars, myTabTask.avatarGroups.get(0).text, z);
                }
            } else if (TextUtils.equals(myTabTask.type, "game")) {
                boolean zM131778z4 = gra.m131778z();
                Act act4 = this.f27520j;
                if (zM131778z4) {
                    str = "res://" + act4.getPackageName() + "/" + dbc0.f87284og;
                } else {
                    str = "res://" + act4.getPackageName() + "/" + dbc0.f87251ng;
                }
                commonTaskItemView = this;
                commonTaskItemView.m44614l(myTabTask.title, myTabTask.subTitle, jyb.m147507f0(str), drawable, myTabTask.button.text, getResources().getColor(gra.m131778z() ? c9c0.f80318A : c9c0.f80342I));
                commonTaskItemView.m44617o(null, z);
                if (jyb.m147479J(myTabTask.avatarGroups)) {
                    commonTaskItemView.m44617o(null, z);
                } else {
                    commonTaskItemView.m44616n(myTabTask.avatarGroups, z);
                }
            }
            bnl0.m105509E0(commonTaskItemView.f27516f, new View.OnClickListener() { // from class: l.fn5
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f99866a.m44611i(myTabTask, aVar, z, view);
                }
            });
            commonTaskItemView.m44615m(aVar, myTabTask, z, false);
        }
        boolean zM131778z5 = gra.m131778z();
        Act act5 = this.f27520j;
        if (zM131778z5) {
            str5 = "res://" + act5.getPackageName() + "/" + dbc0.f86760Yf;
        } else {
            str5 = "res://" + act5.getPackageName() + "/" + dbc0.f86728Xf;
        }
        m44614l(myTabTask.title, myTabTask.subTitle, jyb.m147507f0(str5), drawable, myTabTask.button.text, Color.parseColor("#3CB9F0"));
        if ((TextUtils.equals(myTabTask.mode, "sendLike") || TextUtils.equals(myTabTask.mode, "receiveLike")) && !jyb.m147479J(myTabTask.avatarGroups)) {
            m44617o(myTabTask.avatarGroups.get(0).avatars, z);
        } else if (!TextUtils.equals(myTabTask.mode, "default")) {
            m44617o(null, z);
        } else if (gra.m131778z()) {
            setSubAvatarWithIllustrate(jyb.m147507f0(jyb.m147494Y(Integer.valueOf(dbc0.f86956eg), "更多右滑"), jyb.m147494Y(Integer.valueOf(dbc0.f86825ag), "优先曝光"), jyb.m147494Y(Integer.valueOf(dbc0.f87022gg), "只看认证"), jyb.m147494Y(Integer.valueOf(dbc0.f86891cg), "点亮勋章")));
        } else {
            setSubAvatarWithIllustrate(jyb.m147507f0(jyb.m147494Y(Integer.valueOf(dbc0.f86924dg), "更多右滑"), jyb.m147494Y(Integer.valueOf(dbc0.f86792Zf), "优先曝光"), jyb.m147494Y(Integer.valueOf(dbc0.f86989fg), "只看认证"), jyb.m147494Y(Integer.valueOf(dbc0.f86858bg), "点亮勋章")));
        }
        commonTaskItemView = this;
        bnl0.m105509E0(commonTaskItemView.f27516f, new View.OnClickListener() { // from class: l.fn5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f99866a.m44611i(myTabTask, aVar, z, view);
            }
        });
        commonTaskItemView.m44615m(aVar, myTabTask, z, false);
    }

    /* JADX INFO: renamed from: l */
    public void m44614l(CharSequence charSequence, CharSequence charSequence2, List<String> list, Drawable drawable, CharSequence charSequence3, int i) {
        this.f27512b.removeAllViews();
        if (!jyb.m147479J(list)) {
            m44609g(list, this.f27512b, this.f27522l ? this.f27519i : -1);
        }
        this.f27513c.setText(charSequence);
        this.f27514d.setText(charSequence2);
        this.f27511a.setBackground(drawable);
        this.f27517g.setText(charSequence3);
        float f = qa00.f156321h;
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{f, f, f, f, f, f, f, f}, null, null));
        MyTabTask myTabTask = this.f27521k;
        if (myTabTask == null) {
            this.f27517g.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
            shapeDrawable.getPaint().setColor(i);
        } else if (TextUtils.equals(myTabTask.button.type, "pending")) {
            this.f27517g.setCompoundDrawablesWithIntrinsicBounds(dbc0.f86504Qf, 0, 0, 0);
            shapeDrawable.getPaint().setColor(Color.argb(77, Color.red(i), Color.green(i), Color.blue(i)));
        } else {
            boolean zEquals = TextUtils.equals(this.f27521k.button.type, "rejected");
            VText_Medium vText_Medium = this.f27517g;
            if (zEquals) {
                vText_Medium.setCompoundDrawablesWithIntrinsicBounds(dbc0.f86472Pf, 0, 0, 0);
                shapeDrawable.getPaint().setColor(i);
            } else {
                vText_Medium.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
                shapeDrawable.getPaint().setColor(i);
            }
        }
        this.f27516f.setBackground(shapeDrawable);
    }

    /* JADX INFO: renamed from: m */
    public final void m44615m(C8393a.a aVar, MyTabTask myTabTask, boolean z, boolean z2) {
        String str = z ? OMSDialogPositon.p_navigation_view : "p_task_list";
        if (aVar == null || z2 || !aVar.m44632G(myTabTask.type, myTabTask)) {
            String str2 = "default";
            if (TextUtils.equals(myTabTask.type, "verification")) {
                if (TextUtils.equals(myTabTask.mode, "sendLike")) {
                    str2 = "trial_like";
                } else if (TextUtils.equals(myTabTask.mode, "addLike")) {
                    str2 = "like_limit";
                }
                if (z2) {
                    i4g0.m138523u("e_task_avatar_verify", str, jyb.m147494Y("avatar_verify_task_type", str2));
                } else {
                    i4g0.m138492A("e_task_avatar_verify", str, jyb.m147494Y("avatar_verify_task_type", str2));
                }
            } else if (TextUtils.equals(myTabTask.type, "boost")) {
                HashMap map = new HashMap();
                map.put("default", "upload");
                map.put("pending", "review");
                map.put("rejected", "failed");
                map.put("passed", "start_boost");
                map.put("using", NavigationCardIntent.boosting);
                TaskButtonDesc taskButtonDesc = myTabTask.button;
                if (z2) {
                    i4g0.m138523u("e_upload_photo_award", str, jyb.m147494Y("upload_photo_award_status", (String) map.get(taskButtonDesc.type)));
                } else {
                    i4g0.m138492A("e_upload_photo_award", str, jyb.m147494Y("upload_photo_award_status", (String) map.get(taskButtonDesc.type)));
                }
            } else if (TextUtils.equals(myTabTask.type, "selection")) {
                HashMap map2 = new HashMap();
                map2.put("default", "complete_profile");
                map2.put("pending", "review");
                map2.put("rejected", "failed");
                map2.put("working", "success");
                TaskButtonDesc taskButtonDesc2 = myTabTask.button;
                if (z2) {
                    i4g0.m138523u("e_task_selected", str, jyb.m147494Y("selected_task_status", (String) map2.get(taskButtonDesc2.type)));
                } else {
                    i4g0.m138492A("e_task_selected", str, jyb.m147494Y("selected_task_status", (String) map2.get(taskButtonDesc2.type)));
                }
            } else if (TextUtils.equals(myTabTask.type, "game")) {
                if (z2) {
                    i4g0.m138520r("e_task_game", str);
                } else {
                    i4g0.m138526x("e_task_game", str);
                }
            } else if (TextUtils.equals(myTabTask.type, ProfileLikeType.mbti)) {
                if (z2) {
                    i4g0.m138520r("e_task_mbti", str);
                } else {
                    i4g0.m138526x("e_task_mbti", str);
                }
            }
            if (z) {
                if (z2 && TextUtils.equals(myTabTask.type, "selection") && TextUtils.equals(myTabTask.button.type, "using")) {
                    CoreModule.f18264c.f20381e0.m116581ka(myTabTask.type, z2, true);
                } else {
                    CoreModule.f18264c.f20381e0.m116581ka(myTabTask.type, z2, false);
                }
            }
        }
    }

    /* JADX INFO: renamed from: n */
    public void m44616n(final List<TaskAvatarDesc> list, final boolean z) {
        bnl0.m105524M(this.f27515e, true);
        bnl0.m105540X(this.f27515e, qa00.m175859d(12.0f));
        this.f27515e.removeAllViews();
        AutoScrollView autoScrollView = new AutoScrollView(this.f27520j);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        autoScrollView.addView(new VLinear(this.f27520j), layoutParams);
        autoScrollView.addView(new VLinear(this.f27520j), layoutParams);
        autoScrollView.setBackground(this.f27520j.getDrawable(z ? dbc0.f86696Wf : dbc0.f86664Vf));
        this.f27515e.addView(autoScrollView, new LinearLayout.LayoutParams(-2, -2));
        autoScrollView.m44601m(new z20() { // from class: l.gn5
            @Override // p153l.z20
            public final void call(Object obj, Object obj2) {
                this.f105058a.m44612j(list, z, (View) obj, (Integer) obj2);
            }
        });
    }

    /* JADX INFO: renamed from: o */
    public void m44617o(List<String> list, boolean z) {
        this.f27515e.removeAllViews();
        bnl0.m105540X(this.f27515e, qa00.m175859d(20.0f));
        if (jyb.m147479J(list)) {
            return;
        }
        bnl0.m105524M(this.f27515e, true);
        m44609g(list, this.f27515e, z ? this.f27519i : -1);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m44607e(this);
        this.f27520j = (Act) bnl0.m105508E(this);
    }

    /* JADX INFO: renamed from: p */
    public void m44618p(List<String> list, CharSequence charSequence, boolean z) {
        bnl0.m105524M(this.f27515e, true);
        bnl0.m105540X(this.f27515e, qa00.m175859d(12.0f));
        this.f27515e.removeAllViews();
        VLinear vLinearM44608f = m44608f(new VLinear(this.f27520j), list, charSequence, z ? this.f27518h : this.f27519i);
        vLinearM44608f.setBackground(this.f27520j.getDrawable(z ? dbc0.f86696Wf : dbc0.f86664Vf));
        this.f27515e.addView(vLinearM44608f, new LinearLayout.LayoutParams(-2, -2));
    }

    /* JADX INFO: renamed from: q */
    public final void m44619q() {
        psd0.m173633z(this.f27523m);
        this.f27523m = this.f27520j.lifecycle().skip(1).filter(new qcj() { // from class: l.hn5
            @Override // p153l.qcj
            public final Object call(Object obj) {
                return Boolean.valueOf(((C4470c) obj) == C4470c.f16267i);
            }
        }).take(1).subscribe(psd0.m173596G(new y20() { // from class: l.in5
            @Override // p153l.y20
            public final void call(Object obj) {
                CoreModule.f18264c.f20381e0.m116440A7();
            }
        }));
    }

    public void setSubAvatarWithIllustrate(List<pf60<Integer, String>> list) {
        bnl0.m105524M(this.f27515e, true);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f27515e.getLayoutParams();
        marginLayoutParams.setMargins(0, qa00.m175859d(20.0f), 0, 0);
        this.f27515e.setLayoutParams(marginLayoutParams);
        this.f27515e.removeAllViews();
        for (pf60<Integer, String> pf60Var : list) {
            VText vText = new VText(this.f27520j);
            vText.setTextSize(14.0f);
            vText.setTextColor(this.f27520j.color(gra.m131778z() ? c9c0.f80472y : c9c0.f80349K0));
            vText.setText(pf60Var.f152157b);
            vText.setMaxLines(1);
            vText.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, this.f27520j.getDrawable(pf60Var.f152156a.intValue()), (Drawable) null, (Drawable) null);
            vText.setCompoundDrawablePadding(qa00.m175859d(7.0f));
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
            layoutParams.gravity = 16;
            if (this.f27515e.getChildCount() > 0) {
                layoutParams.leftMargin = qa00.f156328o;
            }
            this.f27515e.addView(vText, layoutParams);
        }
    }

    public CommonTaskItemView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f27518h = Color.parseColor("#EDEDED");
        this.f27519i = Color.parseColor("#f7f7f7");
        this.f27522l = true;
    }

    public CommonTaskItemView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f27518h = Color.parseColor("#EDEDED");
        this.f27519i = Color.parseColor("#f7f7f7");
        this.f27522l = true;
    }
}
