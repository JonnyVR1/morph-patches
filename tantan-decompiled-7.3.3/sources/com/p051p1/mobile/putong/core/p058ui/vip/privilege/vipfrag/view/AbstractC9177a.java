package com.p051p1.mobile.putong.core.p058ui.vip.privilege.vipfrag.view;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import p153l.bnl0;
import p153l.lb2;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.vip.privilege.vipfrag.view.a */
/* JADX INFO: loaded from: classes12.dex */
@Metadata(m88120d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b&\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\bH\u0004¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, m88121d2 = {"Lcom/p1/mobile/putong/core/ui/vip/privilege/vipfrag/view/a;", "Ll/lb2;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/widget/FrameLayout;", "container", "", "position", "r", "(Landroid/widget/FrameLayout;I)Landroid/widget/FrameLayout;", "", "getPageWidth", "(I)F", "Landroid/view/ViewGroup;", "q", "(Landroid/view/ViewGroup;I)Landroid/widget/FrameLayout;", "e", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "b_core_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public abstract class AbstractC9177a extends lb2 {

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public final Context context;

    public AbstractC9177a(@NotNull Context context) {
        context.getClass();
        this.context = context;
    }

    @Override // p153l.cf60
    public final float getPageWidth(int position) {
        float fM58636c;
        int iM105592y0;
        super.getPageWidth(position);
        if (position == 0 || position == getCount() - 1) {
            int iM105592y1 = bnl0.m105592y0();
            TopCardLayout.Companion c9175a = TopCardLayout.INSTANCE;
            fM58636c = iM105592y1 - (c9175a.m58636c() + c9175a.m58634a());
            iM105592y0 = bnl0.m105592y0();
        } else {
            int iM105592y2 = bnl0.m105592y0();
            TopCardLayout.Companion c9175a2 = TopCardLayout.INSTANCE;
            fM58636c = iM105592y2 - (c9175a2.m58636c() + c9175a2.m58635b());
            iM105592y0 = bnl0.m105592y0();
        }
        return fM58636c / iM105592y0;
    }

    @Override // p153l.lb2
    @NotNull
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public final FrameLayout mo40046p(@NotNull ViewGroup container, int position) {
        container.getClass();
        FrameLayout frameLayout = new FrameLayout(this.context);
        int iM105592y0 = bnl0.m105592y0();
        int iM105592y1 = bnl0.m105592y0();
        TopCardLayout.Companion c9175a = TopCardLayout.INSTANCE;
        int iM58636c = iM105592y0 - ((iM105592y1 - c9175a.m58636c()) - c9175a.m58635b());
        int i = iM58636c / 2;
        if (position == 0) {
            frameLayout.setPadding(c9175a.m58636c(), 0, c9175a.m58635b(), 0);
        } else if (position == getCount() - 1) {
            frameLayout.setPadding(i, 0, iM58636c - i, 0);
        } else {
            frameLayout.setPadding(i, 0, i, 0);
        }
        container.addView(frameLayout, new ViewGroup.LayoutParams(-1, -1));
        return mo58638r(frameLayout, position);
    }

    @NotNull
    /* JADX INFO: renamed from: r */
    public abstract FrameLayout mo58638r(@NotNull FrameLayout container, int position);
}
