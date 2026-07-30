package com.p046p1.mobile.putong.core.newui.messages.addressbook.loveradar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.Nullable;
import com.p046p1.mobile.putong.core.CoreModule;
import com.p046p1.mobile.putong.core.data.FateRadar;
import com.p046p1.mobile.putong.core.data.FilterConditionsStatusItem;
import com.p046p1.mobile.putong.core.data.NewTags;
import com.p046p1.mobile.putong.data.Extensions;
import com.p046p1.mobile.putong.data.Interest;
import com.p046p1.mobile.putong.data.Profile;
import java.util.ArrayList;
import java.util.List;
import p147v.VFrame;
import p147v.VImage;
import p147v.VLinear;
import p147v.VText;
import p149l.e30;
import p149l.qji;
import p149l.sa40;
import p149l.vwb;
import p149l.w9j;
import p149l.xdl0;

/* JADX INFO: loaded from: classes11.dex */
public class FilterPairedUsersView extends LinearLayout {

    /* JADX INFO: renamed from: a */
    public VFrame f25381a;

    /* JADX INFO: renamed from: b */
    public VImage f25382b;

    /* JADX INFO: renamed from: c */
    public VFrame f25383c;

    /* JADX INFO: renamed from: d */
    public VImage f25384d;

    /* JADX INFO: renamed from: e */
    public VLinear f25385e;

    /* JADX INFO: renamed from: f */
    public VFrame f25386f;

    /* JADX INFO: renamed from: g */
    public VText f25387g;

    /* JADX INFO: renamed from: h */
    public VFrame f25388h;

    /* JADX INFO: renamed from: i */
    public VText f25389i;

    /* JADX INFO: renamed from: j */
    public VFrame f25390j;

    /* JADX INFO: renamed from: k */
    public VText f25391k;

    /* JADX INFO: renamed from: l */
    public e30<String> f25392l;

    /* JADX INFO: renamed from: m */
    public FateRadar f25393m;

    /* JADX INFO: renamed from: n */
    public boolean f25394n;

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.messages.addressbook.loveradar.FilterPairedUsersView$a */
    public class ViewOnClickListenerC8153a implements View.OnClickListener {
        public ViewOnClickListenerC8153a() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            FilterPairedUsersView.this.m41902e();
            if (FilterPairedUsersView.this.f25392l != null) {
                FilterPairedUsersView.this.f25392l.call("system");
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.messages.addressbook.loveradar.FilterPairedUsersView$b */
    public class ViewOnClickListenerC8154b implements View.OnClickListener {
        public ViewOnClickListenerC8154b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            FilterPairedUsersView.this.m41901d();
            if (FilterPairedUsersView.this.f25392l != null) {
                FilterPairedUsersView.this.f25392l.call("custom");
            }
        }
    }

    /* JADX INFO: renamed from: com.p1.mobile.putong.core.newui.messages.addressbook.loveradar.FilterPairedUsersView$c */
    public class C8155c implements w9j<String, Boolean> {

        /* JADX INFO: renamed from: a */
        public final /* synthetic */ List f25397a;

        public C8155c(List list) {
            this.f25397a = list;
        }

        @Override // p149l.w9j
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean call(String str) {
            return Boolean.valueOf(this.f25397a.contains(str));
        }
    }

    public FilterPairedUsersView(Context context) {
        super(context);
        this.f25394n = false;
    }

    private static List<String> getMeNewTags() {
        Extensions extensions;
        Interest interest;
        Profile profile = CoreModule.f17545c.f19639e0.m169527p9().profile;
        return (profile == null || (extensions = profile.extensions) == null || (interest = extensions.interest) == null || vwb.m200296J(interest.tags)) ? new ArrayList() : CoreModule.f17545c.f19639e0.m169527p9().profile.extensions.interest.tags;
    }

    /* JADX INFO: renamed from: b */
    public final void m41899b(View view) {
        qji.m174994a(this, view);
    }

    /* JADX INFO: renamed from: c */
    public void m41900c(FateRadar fateRadar) {
        this.f25393m = fateRadar;
    }

    /* JADX INFO: renamed from: d */
    public void m41901d() {
        xdl0.m208345M0(this.f25384d, true);
        xdl0.m208345M0(this.f25382b, false);
        xdl0.m208344M(this.f25390j, this.f25394n);
        xdl0.m208344M(this.f25385e, true);
        this.f25387g.setText(getSearchOtherStatus());
        this.f25389i.setText(getSearchOtherFeature());
        this.f25391k.setText(getMeSelectedInterest());
    }

    /* JADX INFO: renamed from: e */
    public void m41902e() {
        xdl0.m208345M0(this.f25384d, false);
        xdl0.m208345M0(this.f25382b, true);
        xdl0.m208344M(this.f25385e, false);
    }

    public String getMeSelectedInterest() {
        if (this.f25393m == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        List<NewTags> listM182847b = sa40.m182802o().m182818P(vwb.m200339n(this.f25393m.searchConditions.customItems.selectedInterest, new C8155c(getMeNewTags()))).m182847b();
        for (int i = 0; i < listM182847b.size(); i++) {
            NewTags newTags = listM182847b.get(i);
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
        if (this.f25393m == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        List<FilterConditionsStatusItem> list = this.f25393m.searchConditions.customItems.feature;
        for (int i = 0; i < list.size(); i++) {
            FilterConditionsStatusItem filterConditionsStatusItem = list.get(i);
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
        if (this.f25393m == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        List<FilterConditionsStatusItem> list = this.f25393m.searchConditions.customItems.status;
        for (int i = 0; i < list.size(); i++) {
            FilterConditionsStatusItem filterConditionsStatusItem = list.get(i);
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
        m41899b(this);
        xdl0.m208329E0(this.f25381a, new ViewOnClickListenerC8153a());
        xdl0.m208329E0(this.f25383c, new ViewOnClickListenerC8154b());
    }

    public void setAfterChangeStateListener(e30<String> e30Var) {
        this.f25392l = e30Var;
    }

    public void setShowInterest(boolean z) {
        this.f25394n = z;
    }

    public FilterPairedUsersView(Context context, @Nullable AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f25394n = false;
    }

    public FilterPairedUsersView(Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f25394n = false;
    }
}
