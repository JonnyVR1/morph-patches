package com.p000p1.mobile.putong.core.p004ui.visitor;

import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.p000p1.mobile.putong.account.data.CameraSticker;
import com.p000p1.mobile.putong.core.p004ui.visitor.VisitorsFilterItemDefaultView;
import com.p1.mobile.putong.core.data.VisitorFilterType;
import com.p1.mobile.putong.core.data.VisitorSortType;
import com.p1.mobile.putong.data.tenum.TEnum;
import l.e30;
import l.f8m0;
import l.j760;
import l.vwb;
import l.xdl0;
import l.z0c0;
import l.zvf0;
import v.VImage;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
public class VisitorsFilterItemDefaultView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public VText f7877a;

    /* JADX INFO: renamed from: b */
    public VImage f7878b;

    public VisitorsFilterItemDefaultView(Context context) {
        super(context);
    }

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ void m11321a(VisitorFilterType visitorFilterType, VisitorFilterType visitorFilterType2, e30 e30Var, View view) {
        String str;
        if (TEnum.equals(visitorFilterType, visitorFilterType2)) {
            return;
        }
        String string = visitorFilterType.toString();
        if ("likeMe".equals(string)) {
            str = "e_filter_visitor_liked_me";
        } else {
            str = "match".equals(string) ? "e_filter_matched_visitor" : "";
        }
        if (!TextUtils.isEmpty(str)) {
            zvf0.u(str, "p_my_visitor", new j760[]{vwb.Y("is_selected", "true")});
        }
        e30Var.call(visitorFilterType);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ void m11322b(VisitorSortType visitorSortType, VisitorSortType visitorSortType2, e30 e30Var, View view) {
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
        } else if ("realUser".equals(string)) {
            str = "e_advanced_filter_real";
        } else {
            str = "newUser".equals(string) ? "e_advanced_filter_new" : "";
        }
        zvf0.u(str, "p_my_visitor", new j760[]{vwb.Y("is_selected", "true")});
        e30Var.call(visitorSortType);
    }

    /* JADX INFO: renamed from: c */
    public final void m11323c(View view) {
        f8m0.a(this, view);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: d */
    public void m11324d(final VisitorFilterType visitorFilterType, final VisitorFilterType visitorFilterType2, @NonNull final e30<VisitorFilterType> e30Var) {
        String string = visitorFilterType.toString();
        string.getClass();
        byte b = -1;
        switch (string.hashCode()) {
            case -1102762097:
                if (string.equals("likeMe")) {
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
        this.f7877a.setText(str);
        boolean zEquals = TEnum.equals(visitorFilterType, visitorFilterType2);
        VText vText = this.f7877a;
        if (zEquals) {
            vText.setTextColor(getResources().getColor(z0c0.d));
            xdl0.M0(this.f7878b, true);
        } else {
            vText.setTextColor(Color.parseColor("#cc000000"));
            xdl0.M0(this.f7878b, false);
        }
        xdl0.E0(this, new View.OnClickListener() { // from class: l.e8m0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VisitorsFilterItemDefaultView.m11321a(visitorFilterType, visitorFilterType2, e30Var, view);
            }
        });
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX INFO: renamed from: e */
    public void m11325e(final VisitorSortType visitorSortType, final VisitorSortType visitorSortType2, @NonNull final e30<VisitorSortType> e30Var) {
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
                if (string.equals("realUser")) {
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
            case CameraSticker.STATE_COMPLETE /* 3 */:
                str = "新用户优先";
                break;
        }
        this.f7877a.setText(str);
        boolean zEquals = TEnum.equals(visitorSortType, visitorSortType2);
        VText vText = this.f7877a;
        if (zEquals) {
            vText.setTextColor(getResources().getColor(z0c0.d));
            xdl0.M0(this.f7878b, true);
        } else {
            vText.setTextColor(Color.parseColor("#cc000000"));
            xdl0.M0(this.f7878b, false);
        }
        xdl0.E0(this, new View.OnClickListener() { // from class: l.d8m0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                VisitorsFilterItemDefaultView.m11322b(visitorSortType, visitorSortType2, e30Var, view);
            }
        });
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m11323c(this);
    }

    public VisitorsFilterItemDefaultView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public VisitorsFilterItemDefaultView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
