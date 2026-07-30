package com.p046p1.mobile.putong.core.newui.newmeet.header;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.p046p1.mobile.putong.core.businessdata.meet.MeetLiveItemData;
import com.p046p1.mobile.putong.core.newui.newmeet.frag.meet.NewMeetFragPresenter;
import java.util.List;
import p147v.VLinear;
import p149l.a7y;
import p149l.w6y;

/* JADX INFO: loaded from: classes11.dex */
public class MeetStateHeaderView extends VLinear {

    /* JADX INFO: renamed from: c */
    public RecyclerView f26332c;

    /* JADX INFO: renamed from: d */
    public w6y f26333d;

    public MeetStateHeaderView(Context context) {
        this(context, null);
    }

    /* JADX INFO: renamed from: P */
    public final void m43037P(View view) {
        a7y.m95308a(this, view);
    }

    /* JADX INFO: renamed from: Q */
    public void m43038Q(List<MeetLiveItemData> list, NewMeetFragPresenter newMeetFragPresenter) {
        if (this.f26333d == null) {
            this.f26333d = new w6y(newMeetFragPresenter);
            this.f26332c.setLayoutManager(new LinearLayoutManager(getContext(), 0, false));
            this.f26332c.setAdapter(this.f26333d);
        }
        this.f26333d.m201997L(list);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m43037P(this);
    }

    public MeetStateHeaderView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MeetStateHeaderView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
