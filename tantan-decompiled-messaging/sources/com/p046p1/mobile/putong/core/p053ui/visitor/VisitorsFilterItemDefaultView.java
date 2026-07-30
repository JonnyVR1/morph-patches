package com.p046p1.mobile.putong.core.p053ui.visitor;

import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.core.data.VisitorFilterType;
import com.p046p1.mobile.putong.core.data.VisitorSortType;
import com.p046p1.mobile.putong.core.p053ui.visitor.VisitorsFilterItemDefaultView;
import com.p046p1.mobile.putong.data.tenum.TEnum;
import p147v.VImage;
import p147v.VText;
import p149l.e30;
import p149l.f8m0;
import p149l.vwb;
import p149l.xdl0;
import p149l.z0c0;
import p149l.zvf0;

/* JADX INFO: loaded from: classes9.dex */
public class VisitorsFilterItemDefaultView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public VText f38096a;

    /* JADX INFO: renamed from: b */
    public VImage f38097b;

    public VisitorsFilterItemDefaultView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m57816a(VisitorFilterType visitorFilterType, VisitorFilterType visitorFilterType2, e30 e30Var, View view) {
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
            zvf0.m220399u(str, "p_my_visitor", vwb.m200311Y("is_selected", "true"));
        }
        e30Var.call(visitorFilterType);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m57817b(VisitorSortType visitorSortType, VisitorSortType visitorSortType2, e30 e30Var, View view) {
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
        zvf0.m220399u(str, "p_my_visitor", vwb.m200311Y("is_selected", "true"));
        e30Var.call(visitorSortType);
    }

    /* JADX INFO: renamed from: c */
    public final void m57818c(View view) {
        f8m0.m120026a(this, view);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: d */
    public void m57819d(final VisitorFilterType visitorFilterType, final VisitorFilterType visitorFilterType2, @NonNull final e30<VisitorFilterType> e30Var) {
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
        this.f38096a.setText(str);
        boolean zEquals = TEnum.equals(visitorFilterType, visitorFilterType2);
        VText vText = this.f38096a;
        if (zEquals) {
            vText.setTextColor(getResources().getColor(z0c0.f200976d));
            xdl0.m208345M0(this.f38097b, true);
        } else {
            vText.setTextColor(Color.parseColor("#cc000000"));
            xdl0.m208345M0(this.f38097b, false);
        }
        xdl0.m208329E0(this, new View.OnClickListener() { // from class: l.e8m0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VisitorsFilterItemDefaultView.m57816a(visitorFilterType, visitorFilterType2, e30Var, view);
            }
        });
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: e */
    public void m57820e(final VisitorSortType visitorSortType, final VisitorSortType visitorSortType2, @NonNull final e30<VisitorSortType> e30Var) {
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
        this.f38096a.setText(str);
        boolean zEquals = TEnum.equals(visitorSortType, visitorSortType2);
        VText vText = this.f38096a;
        if (zEquals) {
            vText.setTextColor(getResources().getColor(z0c0.f200976d));
            xdl0.m208345M0(this.f38097b, true);
        } else {
            vText.setTextColor(Color.parseColor("#cc000000"));
            xdl0.m208345M0(this.f38097b, false);
        }
        xdl0.m208329E0(this, new View.OnClickListener() { // from class: l.d8m0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VisitorsFilterItemDefaultView.m57817b(visitorSortType, visitorSortType2, e30Var, view);
            }
        });
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m57818c(this);
    }

    public VisitorsFilterItemDefaultView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VisitorsFilterItemDefaultView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
