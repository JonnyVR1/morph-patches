package com.p051p1.mobile.putong.live.livingroom.voice.intl.emoji;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.p051p1.mobile.putong.live.base.arch.LiveBaseAdapter;
import java.util.List;
import p151v.VRecyclerView;
import p151v.VText;
import p153l.d3q;
import p153l.dao0;
import p153l.qa00;

/* JADX INFO: loaded from: classes5.dex */
public class VoiceMicEmojiGroupView extends ConstraintLayout {

    /* JADX INFO: renamed from: d */
    public VText f53960d;

    /* JADX INFO: renamed from: e */
    public VRecyclerView f53961e;

    /* JADX INFO: renamed from: f */
    public LiveBaseAdapter f53962f;

    /* JADX INFO: renamed from: com.p1.mobile.putong.live.livingroom.voice.intl.emoji.VoiceMicEmojiGroupView$a */
    public static class C13179a extends RecyclerView.AbstractC0578n {
        @Override // androidx.recyclerview.widget.RecyclerView.AbstractC0578n
        public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, RecyclerView.C0561a0 c0561a0) {
            int iM3361c = c0561a0.m3361c() - 1;
            int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
            if (childAdapterPosition == -1) {
                return;
            }
            rect.top = 0;
            rect.bottom = 0;
            if (childAdapterPosition == 0) {
                rect.left = qa00.m175859d(13.0f);
                rect.right = 0;
            } else if (childAdapterPosition == iM3361c) {
                rect.left = 0;
                rect.right = qa00.m175859d(13.0f);
            } else {
                rect.right = 0;
                rect.left = 0;
            }
        }
    }

    public VoiceMicEmojiGroupView(Context context) {
        super(context);
        this.f53962f = new LiveBaseAdapter();
    }

    /* JADX INFO: renamed from: i0 */
    private void m79304i0() {
        this.f53961e.addItemDecoration(new C13179a());
        this.f53961e.setLayoutManager(new LinearLayoutManager(getContext(), 0, false));
        this.f53961e.setAdapter(this.f53962f);
    }

    /* JADX INFO: renamed from: h0 */
    public final void m79305h0(View view) {
        dao0.m115129a(this, view);
    }

    /* JADX INFO: renamed from: j0 */
    public void m79306j0(String str, List<d3q<?>> list) {
        this.f53960d.setText(str);
        this.f53962f.m68554Z(list);
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        m79305h0(this);
        m79304i0();
    }

    public VoiceMicEmojiGroupView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f53962f = new LiveBaseAdapter();
    }

    public VoiceMicEmojiGroupView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f53962f = new LiveBaseAdapter();
    }
}
