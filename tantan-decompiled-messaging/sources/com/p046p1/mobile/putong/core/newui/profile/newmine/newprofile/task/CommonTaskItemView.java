package com.p046p1.mobile.putong.core.newui.profile.newmine.newprofile.task;

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
import com.p046p1.mobile.android.app.Act;
import com.p046p1.mobile.android.app.C4319c;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.MyTabTask;
import com.p046p1.mobile.putong.core.data.ProfileLikeType;
import com.p046p1.mobile.putong.core.data.TaskAvatarDesc;
import com.p046p1.mobile.putong.core.data.TaskButtonDesc;
import com.p046p1.mobile.putong.core.p053ui.VText_Medium;
import com.p046p1.mobile.putong.data.NavigationCardIntent;
import com.p046p1.mobile.putong.data.OMSDialogPositon;
import com.tantanapp.media.ttmediautils.tinker.ShareConstants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import p147v.VDraweeView;
import p147v.VLinear;
import p147v.VText;
import p149l.c4g0;
import p149l.djj;
import p149l.e30;
import p149l.f30;
import p149l.fm5;
import p149l.j760;
import p149l.lva;
import p149l.mkd0;
import p149l.qib0;
import p149l.t100;
import p149l.upa;
import p149l.vwb;
import p149l.w0c0;
import p149l.w9j;
import p149l.x2c0;
import p149l.xdl0;
import p149l.zvf0;

/* JADX INFO: loaded from: classes11.dex */
public class CommonTaskItemView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public CommonTaskItemView f26663a;

    /* JADX INFO: renamed from: b */
    public LinearLayout f26664b;

    /* JADX INFO: renamed from: c */
    public VText_Medium f26665c;

    /* JADX INFO: renamed from: d */
    public VText f26666d;

    /* JADX INFO: renamed from: e */
    public LinearLayout f26667e;

    /* JADX INFO: renamed from: f */
    public FrameLayout f26668f;

    /* JADX INFO: renamed from: g */
    public VText_Medium f26669g;

    /* JADX INFO: renamed from: h */
    public final int f26670h;

    /* JADX INFO: renamed from: i */
    public final int f26671i;

    /* JADX INFO: renamed from: j */
    public Act f26672j;

    /* JADX INFO: renamed from: k */
    public MyTabTask f26673k;

    /* JADX INFO: renamed from: l */
    public boolean f26674l;

    /* JADX INFO: renamed from: m */
    public c4g0 f26675m;

    public CommonTaskItemView(Context context) {
        super(context);
        this.f26670h = Color.parseColor("#EDEDED");
        this.f26671i = Color.parseColor("#f7f7f7");
        this.f26674l = true;
    }

    /* JADX INFO: renamed from: e */
    public final void m43421e(View view) {
        fm5.m122164a(this, view);
    }

    @NonNull
    /* JADX INFO: renamed from: f */
    public final VLinear m43422f(VLinear vLinear, List<String> list, CharSequence charSequence, int i) {
        vLinear.removeAllViews();
        int i2 = t100.f167264m;
        int i3 = t100.f167260i;
        vLinear.setPadding(i2, i3, i2, i3);
        int i4 = t100.f167266o;
        int i5 = t100.f167258g;
        m43424h(list, vLinear, i4, i5, t100.f167252a, i);
        VText_Medium vText_Medium = new VText_Medium(this.f26672j);
        vText_Medium.setTextSize(14.0f);
        vText_Medium.setTextColor(this.f26672j.getResources().getColor(upa.m194847z() ? w0c0.f183899x : w0c0.f183875p));
        vText_Medium.setText(charSequence);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.leftMargin = i5;
        layoutParams.topMargin = t100.f167254c;
        vLinear.addView(vText_Medium, layoutParams);
        return vLinear;
    }

    /* JADX INFO: renamed from: g */
    public void m43423g(List<String> list, ViewGroup viewGroup, int i) {
        m43424h(list, viewGroup, t100.f167226A, t100.f167264m, t100.f167254c, (list.size() == 1 && list.get(0).startsWith(ShareConstants.RES_PATH)) ? 0 : i);
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
    public final void m43424h(List<String> list, ViewGroup viewGroup, int i, int i2, int i3, int i4) {
        for (String str : list) {
            VDraweeView vDraweeView = new VDraweeView(this.f26672j);
            RoundingParams roundingParams = new RoundingParams();
            roundingParams.m8268v(true);
            ((djj) vDraweeView.getHierarchy()).m112053H(roundingParams);
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
            qib0.f154691G.m102325I0(vDraweeView, str, i, i);
        }
    }

    /* JADX INFO: renamed from: i */
    public final /* synthetic */ void m43425i(MyTabTask myTabTask, C8230a.a aVar, boolean z, View view) {
        lva.m151843D(this.f26672j, Uri.parse(myTabTask.button.url));
        m43429m(aVar, myTabTask, z, true);
        m43433q();
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ void m43426j(List list, boolean z, View view, Integer num) {
        if (view instanceof VLinear) {
            TaskAvatarDesc taskAvatarDesc = (TaskAvatarDesc) list.get(num.intValue() % list.size());
            m43422f((VLinear) view, taskAvatarDesc.avatars, taskAvatarDesc.text, z ? this.f26670h : this.f26671i);
        }
    }

    /* JADX INFO: renamed from: k */
    public void m43427k(@Nullable final C8230a.a aVar, final MyTabTask myTabTask, final boolean z) {
        String str;
        final CommonTaskItemView commonTaskItemView;
        String str2;
        String str3;
        String str4;
        String str5;
        this.f26674l = z;
        this.f26673k = myTabTask;
        Drawable drawable = this.f26672j.getDrawable(z ? x2c0.f190045cf : x2c0.f190077df);
        if (!TextUtils.equals(myTabTask.type, "verification")) {
            if (TextUtils.equals(myTabTask.type, "boost")) {
                boolean zM194847z = upa.m194847z();
                Act act = this.f26672j;
                if (zM194847z) {
                    str4 = "res://" + act.getPackageName() + "/" + x2c0.f189763Te;
                } else {
                    str4 = "res://" + act.getPackageName() + "/" + x2c0.f189732Se;
                }
                ArrayList arrayList = new ArrayList();
                if (!vwb.m200296J(myTabTask.avatarGroups)) {
                    arrayList.addAll(myTabTask.avatarGroups.get(0).avatars);
                    arrayList.add(str4);
                }
                commonTaskItemView = this;
                commonTaskItemView.m43428l(myTabTask.title, myTabTask.subTitle, arrayList, drawable, myTabTask.button.text, Color.parseColor("#FF6298"));
                m43431o(null, z);
            } else if (TextUtils.equals(myTabTask.type, "selection")) {
                boolean zM194847z2 = upa.m194847z();
                Act act2 = this.f26672j;
                if (zM194847z2) {
                    str3 = "res://" + act2.getPackageName() + "/" + x2c0.f189887Xe;
                } else {
                    str3 = "res://" + act2.getPackageName() + "/" + x2c0.f189856We;
                }
                ArrayList arrayList2 = new ArrayList();
                if (!vwb.m200296J(myTabTask.avatarGroups)) {
                    arrayList2.addAll(myTabTask.avatarGroups.get(0).avatars);
                    arrayList2.add(str3);
                }
                commonTaskItemView = this;
                commonTaskItemView.m43428l(myTabTask.title, myTabTask.subTitle, arrayList2, drawable, myTabTask.button.text, Color.parseColor("#808CA8"));
                m43431o(null, z);
            } else if (TextUtils.equals(myTabTask.type, ProfileLikeType.mbti)) {
                boolean zM194847z3 = upa.m194847z();
                Act act3 = this.f26672j;
                if (zM194847z3) {
                    str2 = "res://" + act3.getPackageName() + "/" + x2c0.f189825Ve;
                } else {
                    str2 = "res://" + act3.getPackageName() + "/" + x2c0.f189794Ue;
                }
                m43428l(myTabTask.title, myTabTask.subTitle, vwb.m200324f0(str2), drawable, myTabTask.button.text, getResources().getColor(upa.m194847z() ? w0c0.f183749A : w0c0.f183773I));
                m43431o(null, z);
                if (vwb.m200296J(myTabTask.avatarGroups)) {
                    m43431o(null, z);
                } else {
                    m43432p(myTabTask.avatarGroups.get(0).avatars, myTabTask.avatarGroups.get(0).text, z);
                }
            } else if (TextUtils.equals(myTabTask.type, "game")) {
                boolean zM194847z4 = upa.m194847z();
                Act act4 = this.f26672j;
                if (zM194847z4) {
                    str = "res://" + act4.getPackageName() + "/" + x2c0.f189169Af;
                } else {
                    str = "res://" + act4.getPackageName() + "/" + x2c0.f190778zf;
                }
                commonTaskItemView = this;
                commonTaskItemView.m43428l(myTabTask.title, myTabTask.subTitle, vwb.m200324f0(str), drawable, myTabTask.button.text, getResources().getColor(upa.m194847z() ? w0c0.f183749A : w0c0.f183773I));
                commonTaskItemView.m43431o(null, z);
                if (vwb.m200296J(myTabTask.avatarGroups)) {
                    commonTaskItemView.m43431o(null, z);
                } else {
                    commonTaskItemView.m43430n(myTabTask.avatarGroups, z);
                }
            }
            xdl0.m208329E0(commonTaskItemView.f26668f, new View.OnClickListener() { // from class: l.bm5
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f76234a.m43425i(myTabTask, aVar, z, view);
                }
            });
            commonTaskItemView.m43429m(aVar, myTabTask, z, false);
        }
        boolean zM194847z5 = upa.m194847z();
        Act act5 = this.f26672j;
        if (zM194847z5) {
            str5 = "res://" + act5.getPackageName() + "/" + x2c0.f190298kf;
        } else {
            str5 = "res://" + act5.getPackageName() + "/" + x2c0.f190266jf;
        }
        m43428l(myTabTask.title, myTabTask.subTitle, vwb.m200324f0(str5), drawable, myTabTask.button.text, Color.parseColor("#3CB9F0"));
        if ((TextUtils.equals(myTabTask.mode, "sendLike") || TextUtils.equals(myTabTask.mode, "receiveLike")) && !vwb.m200296J(myTabTask.avatarGroups)) {
            m43431o(myTabTask.avatarGroups.get(0).avatars, z);
        } else if (!TextUtils.equals(myTabTask.mode, "default")) {
            m43431o(null, z);
        } else if (upa.m194847z()) {
            setSubAvatarWithIllustrate(vwb.m200324f0(vwb.m200311Y(Integer.valueOf(x2c0.f190490qf), "更多右滑"), vwb.m200311Y(Integer.valueOf(x2c0.f190362mf), "优先曝光"), vwb.m200311Y(Integer.valueOf(x2c0.f190554sf), "只看认证"), vwb.m200311Y(Integer.valueOf(x2c0.f190426of), "点亮勋章")));
        } else {
            setSubAvatarWithIllustrate(vwb.m200324f0(vwb.m200311Y(Integer.valueOf(x2c0.f190458pf), "更多右滑"), vwb.m200311Y(Integer.valueOf(x2c0.f190330lf), "优先曝光"), vwb.m200311Y(Integer.valueOf(x2c0.f190522rf), "只看认证"), vwb.m200311Y(Integer.valueOf(x2c0.f190394nf), "点亮勋章")));
        }
        commonTaskItemView = this;
        xdl0.m208329E0(commonTaskItemView.f26668f, new View.OnClickListener() { // from class: l.bm5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f76234a.m43425i(myTabTask, aVar, z, view);
            }
        });
        commonTaskItemView.m43429m(aVar, myTabTask, z, false);
    }

    /* JADX INFO: renamed from: l */
    public void m43428l(CharSequence charSequence, CharSequence charSequence2, List<String> list, Drawable drawable, CharSequence charSequence3, int i) {
        this.f26664b.removeAllViews();
        if (!vwb.m200296J(list)) {
            m43423g(list, this.f26664b, this.f26674l ? this.f26671i : -1);
        }
        this.f26665c.setText(charSequence);
        this.f26666d.setText(charSequence2);
        this.f26663a.setBackground(drawable);
        this.f26669g.setText(charSequence3);
        float f = t100.f167259h;
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{f, f, f, f, f, f, f, f}, null, null));
        MyTabTask myTabTask = this.f26673k;
        if (myTabTask == null) {
            this.f26669g.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
            shapeDrawable.getPaint().setColor(i);
        } else if (TextUtils.equals(myTabTask.button.type, "pending")) {
            this.f26669g.setCompoundDrawablesWithIntrinsicBounds(x2c0.f190013bf, 0, 0, 0);
            shapeDrawable.getPaint().setColor(Color.argb(77, Color.red(i), Color.green(i), Color.blue(i)));
        } else {
            boolean zEquals = TextUtils.equals(this.f26673k.button.type, "rejected");
            VText_Medium vText_Medium = this.f26669g;
            if (zEquals) {
                vText_Medium.setCompoundDrawablesWithIntrinsicBounds(x2c0.f189981af, 0, 0, 0);
                shapeDrawable.getPaint().setColor(i);
            } else {
                vText_Medium.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
                shapeDrawable.getPaint().setColor(i);
            }
        }
        this.f26668f.setBackground(shapeDrawable);
    }

    /* JADX INFO: renamed from: m */
    public final void m43429m(C8230a.a aVar, MyTabTask myTabTask, boolean z, boolean z2) {
        String str = z ? OMSDialogPositon.p_navigation_view : "p_task_list";
        if (aVar == null || z2 || !aVar.m43446G(myTabTask.type, myTabTask)) {
            String str2 = "default";
            if (TextUtils.equals(myTabTask.type, "verification")) {
                if (TextUtils.equals(myTabTask.mode, "sendLike")) {
                    str2 = "trial_like";
                } else if (TextUtils.equals(myTabTask.mode, "addLike")) {
                    str2 = "like_limit";
                }
                if (z2) {
                    zvf0.m220399u("e_task_avatar_verify", str, vwb.m200311Y("avatar_verify_task_type", str2));
                } else {
                    zvf0.m220368A("e_task_avatar_verify", str, vwb.m200311Y("avatar_verify_task_type", str2));
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
                    zvf0.m220399u("e_upload_photo_award", str, vwb.m200311Y("upload_photo_award_status", (String) map.get(taskButtonDesc.type)));
                } else {
                    zvf0.m220368A("e_upload_photo_award", str, vwb.m200311Y("upload_photo_award_status", (String) map.get(taskButtonDesc.type)));
                }
            } else if (TextUtils.equals(myTabTask.type, "selection")) {
                HashMap map2 = new HashMap();
                map2.put("default", "complete_profile");
                map2.put("pending", "review");
                map2.put("rejected", "failed");
                map2.put("working", "success");
                TaskButtonDesc taskButtonDesc2 = myTabTask.button;
                if (z2) {
                    zvf0.m220399u("e_task_selected", str, vwb.m200311Y("selected_task_status", (String) map2.get(taskButtonDesc2.type)));
                } else {
                    zvf0.m220368A("e_task_selected", str, vwb.m200311Y("selected_task_status", (String) map2.get(taskButtonDesc2.type)));
                }
            } else if (TextUtils.equals(myTabTask.type, "game")) {
                if (z2) {
                    zvf0.m220396r("e_task_game", str);
                } else {
                    zvf0.m220402x("e_task_game", str);
                }
            } else if (TextUtils.equals(myTabTask.type, ProfileLikeType.mbti)) {
                if (z2) {
                    zvf0.m220396r("e_task_mbti", str);
                } else {
                    zvf0.m220402x("e_task_mbti", str);
                }
            }
            if (z) {
                if (z2 && TextUtils.equals(myTabTask.type, "selection") && TextUtils.equals(myTabTask.button.type, "using")) {
                    CoreModule.f17545c.f19639e0.m169508ka(myTabTask.type, z2, true);
                } else {
                    CoreModule.f17545c.f19639e0.m169508ka(myTabTask.type, z2, false);
                }
            }
        }
    }

    /* JADX INFO: renamed from: n */
    public void m43430n(final List<TaskAvatarDesc> list, final boolean z) {
        xdl0.m208344M(this.f26667e, true);
        xdl0.m208360X(this.f26667e, t100.m186890d(12.0f));
        this.f26667e.removeAllViews();
        AutoScrollView autoScrollView = new AutoScrollView(this.f26672j);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        autoScrollView.addView(new VLinear(this.f26672j), layoutParams);
        autoScrollView.addView(new VLinear(this.f26672j), layoutParams);
        autoScrollView.setBackground(this.f26672j.getDrawable(z ? x2c0.f190204hf : x2c0.f190172gf));
        this.f26667e.addView(autoScrollView, new LinearLayout.LayoutParams(-2, -2));
        autoScrollView.m43415m(new f30() { // from class: l.cm5
            @Override // p149l.f30
            public final void call(Object obj, Object obj2) {
                this.f81511a.m43426j(list, z, (View) obj, (Integer) obj2);
            }
        });
    }

    /* JADX INFO: renamed from: o */
    public void m43431o(List<String> list, boolean z) {
        this.f26667e.removeAllViews();
        xdl0.m208360X(this.f26667e, t100.m186890d(20.0f));
        if (vwb.m200296J(list)) {
            return;
        }
        xdl0.m208344M(this.f26667e, true);
        m43423g(list, this.f26667e, z ? this.f26671i : -1);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m43421e(this);
        this.f26672j = (Act) xdl0.m208328E(this);
    }

    /* JADX INFO: renamed from: p */
    public void m43432p(List<String> list, CharSequence charSequence, boolean z) {
        xdl0.m208344M(this.f26667e, true);
        xdl0.m208360X(this.f26667e, t100.m186890d(12.0f));
        this.f26667e.removeAllViews();
        VLinear vLinearM43422f = m43422f(new VLinear(this.f26672j), list, charSequence, z ? this.f26670h : this.f26671i);
        vLinearM43422f.setBackground(this.f26672j.getDrawable(z ? x2c0.f190204hf : x2c0.f190172gf));
        this.f26667e.addView(vLinearM43422f, new LinearLayout.LayoutParams(-2, -2));
    }

    /* JADX INFO: renamed from: q */
    public final void m43433q() {
        mkd0.m154992z(this.f26675m);
        this.f26675m = this.f26672j.lifecycle().skip(1).filter(new w9j() { // from class: l.dm5
            @Override // p149l.w9j
            public final Object call(Object obj) {
                return Boolean.valueOf(((C4319c) obj) == C4319c.f15548i);
            }
        }).take(1).subscribe(mkd0.m154955G(new e30() { // from class: l.em5
            @Override // p149l.e30
            public final void call(Object obj) {
                CoreModule.f17545c.f19639e0.m169367A7();
            }
        }));
    }

    public void setSubAvatarWithIllustrate(List<j760<Integer, String>> list) {
        xdl0.m208344M(this.f26667e, true);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f26667e.getLayoutParams();
        marginLayoutParams.setMargins(0, t100.m186890d(20.0f), 0, 0);
        this.f26667e.setLayoutParams(marginLayoutParams);
        this.f26667e.removeAllViews();
        for (j760<Integer, String> j760Var : list) {
            VText vText = new VText(this.f26672j);
            vText.setTextSize(14.0f);
            vText.setTextColor(this.f26672j.color(upa.m194847z() ? w0c0.f183902y : w0c0.f183777J0));
            vText.setText(j760Var.f116565b);
            vText.setMaxLines(1);
            vText.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, this.f26672j.getDrawable(j760Var.f116564a.intValue()), (Drawable) null, (Drawable) null);
            vText.setCompoundDrawablePadding(t100.m186890d(7.0f));
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
            layoutParams.gravity = 16;
            if (this.f26667e.getChildCount() > 0) {
                layoutParams.leftMargin = t100.f167266o;
            }
            this.f26667e.addView(vText, layoutParams);
        }
    }

    public CommonTaskItemView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f26670h = Color.parseColor("#EDEDED");
        this.f26671i = Color.parseColor("#f7f7f7");
        this.f26674l = true;
    }

    public CommonTaskItemView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f26670h = Color.parseColor("#EDEDED");
        this.f26671i = Color.parseColor("#f7f7f7");
        this.f26674l = true;
    }
}
