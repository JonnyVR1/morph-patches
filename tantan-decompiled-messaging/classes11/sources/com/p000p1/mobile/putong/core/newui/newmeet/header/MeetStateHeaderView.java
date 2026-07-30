package com.p000p1.mobile.putong.core.newui.newmeet.header;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.p000p1.mobile.putong.core.newui.newmeet.frag.meet.NewMeetFragPresenter;
import com.p1.mobile.putong.core.businessdata.meet.MeetLiveItemData;
import java.util.List;
import l.a7y;
import p009l.w6y;
import v.VLinear;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class MeetStateHeaderView extends VLinear {

    /* JADX INFO: renamed from: c */
    public RecyclerView f5110c;

    /* JADX INFO: renamed from: d */
    public w6y f5111d;

    public MeetStateHeaderView(Context context) {
        this(context, null);
    }

    /* JADX INFO: renamed from: P */
    public final void m7239P(View view) {
        a7y.a(this, view);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: Q */
    public void m7240Q(List<MeetLiveItemData> list, NewMeetFragPresenter newMeetFragPresenter) {
        if (this.f5111d == null) {
            this.f5111d = new w6y(newMeetFragPresenter);
            this.f5110c.setLayoutManager(new LinearLayoutManager(getContext(), 0, false));
            this.f5110c.setAdapter(this.f5111d);
        }
        this.f5111d.m23963L(list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void onFinishInflate() {
        super/*android.view.View*/.onFinishInflate();
        m7239P(this);
    }

    public MeetStateHeaderView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MeetStateHeaderView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
