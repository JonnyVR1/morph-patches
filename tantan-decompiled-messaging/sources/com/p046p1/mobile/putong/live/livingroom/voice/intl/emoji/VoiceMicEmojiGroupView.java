package com.p046p1.mobile.putong.live.livingroom.voice.intl.emoji;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.p046p1.mobile.putong.live.base.arch.LiveBaseAdapter;
import java.util.List;
import p147v.VRecyclerView;
import p147v.VText;
import p149l.d1q;
import p149l.t100;
import p149l.z0o0;

/* JADX INFO: loaded from: classes5.dex */
public class VoiceMicEmojiGroupView extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public VText f53112d;

    /* JADX INFO: renamed from: e */
    public VRecyclerView f53113e;

    /* JADX INFO: renamed from: f */
    public LiveBaseAdapter f53114f;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.voice.intl.emoji.VoiceMicEmojiGroupView$a */
    public static class C13016a extends RecyclerView.AbstractC0576n {
        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0576n
        public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C0588z c0588z) {
            int iM3487c = c0588z.m3487c() - 1;
            int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
            if (childAdapterPosition == -1) {
                return;
            }
            rect.top = 0;
            rect.bottom = 0;
            if (childAdapterPosition == 0) {
                rect.left = t100.m186890d(13.0f);
                rect.right = 0;
            } else if (childAdapterPosition == iM3487c) {
                rect.left = 0;
                rect.right = t100.m186890d(13.0f);
            } else {
                rect.right = 0;
                rect.left = 0;
            }
        }
    }

    public VoiceMicEmojiGroupView(Context context) {
        super(context);
        this.f53114f = new LiveBaseAdapter();
    }

    /* JADX INFO: renamed from: i0 */
    private void m78121i0() {
        this.f53113e.addItemDecoration(new C13016a());
        this.f53113e.setLayoutManager(new LinearLayoutManager(getContext(), 0, false));
        this.f53113e.setAdapter(this.f53114f);
    }

    /* JADX INFO: renamed from: h0 */
    public final void m78122h0(View view) {
        z0o0.m216754a(this, view);
    }

    /* JADX INFO: renamed from: j0 */
    public void m78123j0(String str, List<d1q<?>> list) {
        this.f53112d.setText(str);
        this.f53114f.m67371Z(list);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m78122h0(this);
        m78121i0();
    }

    public VoiceMicEmojiGroupView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f53114f = new LiveBaseAdapter();
    }

    public VoiceMicEmojiGroupView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f53114f = new LiveBaseAdapter();
    }
}
