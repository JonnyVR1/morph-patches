package com.p051p1.mobile.putong.core.newui.newmeet.header;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.p051p1.mobile.putong.core.businessdata.meet.MeetLiveItemData;
import com.p051p1.mobile.putong.core.newui.newmeet.frag.meet.NewMeetFragPresenter;
import java.util.List;
import p151v.VLinear;
import p153l.tfy;
import p153l.xfy;

/* JADX INFO: loaded from: classes11.dex */
public class MeetStateHeaderView extends VLinear {

    /* JADX INFO: renamed from: c */
    public RecyclerView f27074c;

    /* JADX INFO: renamed from: d */
    public tfy f27075d;

    public MeetStateHeaderView(Context context) {
        this(context, null);
    }

    /* JADX INFO: renamed from: P */
    public final void m44048P(View view) {
        xfy.m210865a(this, view);
    }

    /* JADX INFO: renamed from: Q */
    public void m44049Q(List<MeetLiveItemData> list, NewMeetFragPresenter newMeetFragPresenter) {
        if (this.f27075d == null) {
            this.f27075d = new tfy(newMeetFragPresenter);
            this.f27074c.setLayoutManager(new LinearLayoutManager(getContext(), 0, false));
            this.f27074c.setAdapter(this.f27075d);
        }
        this.f27075d.m191012L(list);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m44048P(this);
    }

    public MeetStateHeaderView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MeetStateHeaderView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
