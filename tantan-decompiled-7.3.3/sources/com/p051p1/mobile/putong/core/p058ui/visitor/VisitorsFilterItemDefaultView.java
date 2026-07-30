package com.p051p1.mobile.putong.core.p058ui.visitor;

import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p051p1.mobile.putong.core.data.VisitorFilterType;
import com.p051p1.mobile.putong.core.data.VisitorSortType;
import com.p051p1.mobile.putong.core.p058ui.visitor.VisitorsFilterItemDefaultView;
import com.p051p1.mobile.putong.data.tenum.TEnum;
import p151v.VImage;
import p151v.VText;
import p153l.bnl0;
import p153l.f9c0;
import p153l.i4g0;
import p153l.jhm0;
import p153l.jyb;
import p153l.y20;

/* JADX INFO: loaded from: classes12.dex */
public class VisitorsFilterItemDefaultView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public VText f38944a;

    /* JADX INFO: renamed from: b */
    public VImage f38945b;

    public VisitorsFilterItemDefaultView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m58999a(VisitorFilterType visitorFilterType, VisitorFilterType visitorFilterType2, y20 y20Var, View view) {
        String str;
        if (TEnum.equals(visitorFilterType, visitorFilterType2)) {
            return;
        }
        String string = visitorFilterType.toString();
        if (VisitorFilterType.likeMe.equals(string)) {
            str = "e_filter_visitor_liked_me";
        } else {
            str = "match".equals(string) ? "e_filter_matched_visitor" : "";
        }
        if (!TextUtils.isEmpty(str)) {
            i4g0.m138523u(str, "p_my_visitor", jyb.m147494Y("is_selected", "true"));
        }
        y20Var.call(visitorFilterType);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m59000b(VisitorSortType visitorSortType, VisitorSortType visitorSortType2, y20 y20Var, View view) {
        String str;
        if (TEnum.equals(visitorSortType, visitorSortType2)) {
            return;
        }
        String string = visitorSortType.toString();
        if ("visitTime".equals(string)) {
            str = "e_filter_latest_visitor";
        } else if ("visitTimes".equals(string)) {
            str = "e_filter_frequent_visitor";
        } else if ("distance".equals(string)) {
            str = "e_filter_online_near_visitor";
        } else if (VisitorSortType.realUser.equals(string)) {
            str = "e_advanced_filter_real";
        } else {
            str = "newUser".equals(string) ? "e_advanced_filter_new" : "";
        }
        i4g0.m138523u(str, "p_my_visitor", jyb.m147494Y("is_selected", "true"));
        y20Var.call(visitorSortType);
    }

    /* JADX INFO: renamed from: c */
    public final void m59001c(View view) {
        jhm0.m144916a(this, view);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: d */
    public void m59002d(final VisitorFilterType visitorFilterType, final VisitorFilterType visitorFilterType2, @NonNull final y20<VisitorFilterType> y20Var) {
        String string = visitorFilterType.toString();
        string.getClass();
        byte b = -1;
        switch (string.hashCode()) {
            case -1102762097:
                if (string.equals(VisitorFilterType.likeMe)) {
                    b = 0;
                }
                break;
            case 96673:
                if (string.equals("all")) {
                    b = 1;
                }
                break;
            case 103668165:
                if (string.equals("match")) {
                    b = 2;
                }
                break;
        }
        String str = "全部";
        switch (b) {
            case 0:
                str = "喜欢我";
                break;
            case 2:
                str = "已配对";
                break;
        }
        this.f38944a.setText(str);
        boolean zEquals = TEnum.equals(visitorFilterType, visitorFilterType2);
        VText vText = this.f38944a;
        if (zEquals) {
            vText.setTextColor(getResources().getColor(f9c0.f97859d));
            bnl0.m105525M0(this.f38945b, true);
        } else {
            vText.setTextColor(Color.parseColor("#cc000000"));
            bnl0.m105525M0(this.f38945b, false);
        }
        bnl0.m105509E0(this, new View.OnClickListener() { // from class: l.ihm0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VisitorsFilterItemDefaultView.m58999a(visitorFilterType, visitorFilterType2, y20Var, view);
            }
        });
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: e */
    public void m59003e(final VisitorSortType visitorSortType, final VisitorSortType visitorSortType2, @NonNull final y20<VisitorSortType> y20Var) {
        String string = visitorSortType.toString();
        string.getClass();
        byte b = -1;
        switch (string.hashCode()) {
            case -1857789765:
                if (string.equals("visitTimes")) {
                    b = 0;
                }
                break;
            case -860112247:
                if (string.equals(VisitorSortType.realUser)) {
                    b = 1;
                }
                break;
            case 288459765:
                if (string.equals("distance")) {
                    b = 2;
                }
                break;
            case 1845246347:
                if (string.equals("newUser")) {
                    b = 3;
                }
                break;
            case 1879733944:
                if (string.equals("visitTime")) {
                    b = 4;
                }
                break;
        }
        String str = "最近访问优先";
        switch (b) {
            case 0:
                str = "多次访问优先";
                break;
            case 1:
                str = "真实头像优先";
                break;
            case 2:
                str = "附近在线优先";
                break;
            case 3:
                str = "新用户优先";
                break;
        }
        this.f38944a.setText(str);
        boolean zEquals = TEnum.equals(visitorSortType, visitorSortType2);
        VText vText = this.f38944a;
        if (zEquals) {
            vText.setTextColor(getResources().getColor(f9c0.f97859d));
            bnl0.m105525M0(this.f38945b, true);
        } else {
            vText.setTextColor(Color.parseColor("#cc000000"));
            bnl0.m105525M0(this.f38945b, false);
        }
        bnl0.m105509E0(this, new View.OnClickListener() { // from class: l.hhm0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VisitorsFilterItemDefaultView.m59000b(visitorSortType, visitorSortType2, y20Var, view);
            }
        });
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m59001c(this);
    }

    public VisitorsFilterItemDefaultView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VisitorsFilterItemDefaultView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
