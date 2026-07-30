package com.p000p1.mobile.putong.core.newui.messages.addressbook.loveradar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import com.p1.mobile.putong.core.CoreModule;
import com.p1.mobile.putong.core.data.FateRadar;
import com.p1.mobile.putong.core.data.FilterConditionsStatusItem;
import com.p1.mobile.putong.core.data.NewTags;
import com.p1.mobile.putong.data.Extensions;
import com.p1.mobile.putong.data.Interest;
import com.p1.mobile.putong.data.Profile;
import java.util.ArrayList;
import java.util.List;
import l.e30;
import l.qji;
import l.sa40;
import l.vwb;
import l.w9j;
import l.xdl0;
import v.VFrame;
import v.VImage;
import v.VLinear;
import v.VText;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class FilterPairedUsersView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public VFrame f4159a;

    /* JADX INFO: renamed from: b */
    public VImage f4160b;

    /* JADX INFO: renamed from: c */
    public VFrame f4161c;

    /* JADX INFO: renamed from: d */
    public VImage f4162d;

    /* JADX INFO: renamed from: e */
    public VLinear f4163e;

    /* JADX INFO: renamed from: f */
    public VFrame f4164f;

    /* JADX INFO: renamed from: g */
    public VText f4165g;

    /* JADX INFO: renamed from: h */
    public VFrame f4166h;

    /* JADX INFO: renamed from: i */
    public VText f4167i;

    /* JADX INFO: renamed from: j */
    public VFrame f4168j;

    /* JADX INFO: renamed from: k */
    public VText f4169k;

    /* JADX INFO: renamed from: l */
    public e30<String> f4170l;

    /* JADX INFO: renamed from: m */
    public FateRadar f4171m;

    /* JADX INFO: renamed from: n */
    public boolean f4172n;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.messages.addressbook.loveradar.FilterPairedUsersView$a */
    public class ViewOnClickListenerC0317a implements View.OnClickListener {
        public ViewOnClickListenerC0317a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            FilterPairedUsersView.this.m6038e();
            if (FilterPairedUsersView.this.f4170l != null) {
                FilterPairedUsersView.this.f4170l.call("system");
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.messages.addressbook.loveradar.FilterPairedUsersView$b */
    public class ViewOnClickListenerC0318b implements View.OnClickListener {
        public ViewOnClickListenerC0318b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            FilterPairedUsersView.this.m6037d();
            if (FilterPairedUsersView.this.f4170l != null) {
                FilterPairedUsersView.this.f4170l.call("custom");
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.messages.addressbook.loveradar.FilterPairedUsersView$c */
    public class C0319c implements w9j<String, Boolean> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ List f4175a;

        public C0319c(List list) {
            this.f4175a = list;
        }

        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean call(String str) {
            return Boolean.valueOf(this.f4175a.contains(str));
        }
    }

    public FilterPairedUsersView(Context context) {
        super(context);
        this.f4172n = false;
    }

    private static List<String> getMeNewTags() {
        Extensions extensions;
        Interest interest;
        Profile profile = CoreModule.c.e0.p9().profile;
        return (profile == null || (extensions = profile.extensions) == null || (interest = extensions.interest) == null || vwb.J(interest.tags)) ? new ArrayList() : CoreModule.c.e0.p9().profile.extensions.interest.tags;
    }

    /* JADX INFO: renamed from: b */
    public final void m6035b(View view) {
        qji.a(this, view);
    }

    /* JADX INFO: renamed from: c */
    public void m6036c(FateRadar fateRadar) {
        this.f4171m = fateRadar;
    }

    /* JADX INFO: renamed from: d */
    public void m6037d() {
        xdl0.M0(this.f4162d, true);
        xdl0.M0(this.f4160b, false);
        xdl0.M(this.f4168j, this.f4172n);
        xdl0.M(this.f4163e, true);
        this.f4165g.setText(getSearchOtherStatus());
        this.f4167i.setText(getSearchOtherFeature());
        this.f4169k.setText(getMeSelectedInterest());
    }

    /* JADX INFO: renamed from: e */
    public void m6038e() {
        xdl0.M0(this.f4162d, false);
        xdl0.M0(this.f4160b, true);
        xdl0.M(this.f4163e, false);
    }

    public String getMeSelectedInterest() {
        if (this.f4171m == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        List listB = sa40.o().P(vwb.n(this.f4171m.searchConditions.customItems.selectedInterest, new C0319c(getMeNewTags()))).b();
        for (int i = 0; i < listB.size(); i++) {
            NewTags newTags = (NewTags) listB.get(i);
            if (sb.length() == 0) {
                sb.append(newTags.name);
            } else {
                sb.append("、");
                sb.append(newTags.name);
            }
        }
        return sb.length() == 0 ? "不限" : sb.toString();
    }

    public String getSearchOtherFeature() {
        if (this.f4171m == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        List list = this.f4171m.searchConditions.customItems.feature;
        for (int i = 0; i < list.size(); i++) {
            FilterConditionsStatusItem filterConditionsStatusItem = (FilterConditionsStatusItem) list.get(i);
            if (filterConditionsStatusItem.selected) {
                if (sb.length() == 0) {
                    sb.append(filterConditionsStatusItem.value);
                } else {
                    sb.append("、");
                    sb.append(filterConditionsStatusItem.value);
                }
            }
        }
        return sb.length() == 0 ? "不限" : sb.toString();
    }

    public String getSearchOtherStatus() {
        if (this.f4171m == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        List list = this.f4171m.searchConditions.customItems.status;
        for (int i = 0; i < list.size(); i++) {
            FilterConditionsStatusItem filterConditionsStatusItem = (FilterConditionsStatusItem) list.get(i);
            if (filterConditionsStatusItem.selected) {
                if (sb.length() == 0) {
                    sb.append(filterConditionsStatusItem.value);
                } else {
                    sb.append("、");
                    sb.append(filterConditionsStatusItem.value);
                }
            }
        }
        return sb.length() == 0 ? "不限" : sb.toString();
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m6035b(this);
        xdl0.E0(this.f4159a, new ViewOnClickListenerC0317a());
        xdl0.E0(this.f4161c, new ViewOnClickListenerC0318b());
    }

    public void setAfterChangeStateListener(e30<String> e30Var) {
        this.f4170l = e30Var;
    }

    public void setShowInterest(boolean z) {
        this.f4172n = z;
    }

    public FilterPairedUsersView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f4172n = false;
    }

    public FilterPairedUsersView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f4172n = false;
    }
}
