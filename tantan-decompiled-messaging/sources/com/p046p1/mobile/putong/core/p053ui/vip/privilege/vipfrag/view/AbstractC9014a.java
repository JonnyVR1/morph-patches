package com.p046p1.mobile.putong.core.p053ui.vip.privilege.vipfrag.view;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import p149l.eb2;
import p149l.xdl0;

/* JADX INFO: renamed from: com.p1.mobile.putong.core.ui.vip.privilege.vipfrag.view.a */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m87231d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b&\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\bH\u0004¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, m87232d2 = {"Lcom/p1/mobile/putong/core/ui/vip/privilege/vipfrag/view/a;", "Ll/eb2;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/widget/FrameLayout;", "container", "", "position", "r", "(Landroid/widget/FrameLayout;I)Landroid/widget/FrameLayout;", "", "getPageWidth", "(I)F", "Landroid/view/ViewGroup;", "q", "(Landroid/view/ViewGroup;I)Landroid/widget/FrameLayout;", "e", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "b_core_intlGmsRelease"}, m87233k = 1, m87234mv = {2, 2, 0}, m87236xi = 48)
public abstract class AbstractC9014a extends eb2 {

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    @NotNull
    public final Context context;

    public AbstractC9014a(@NotNull Context context) {
        context.getClass();
        this.context = context;
    }

    @Override // p149l.w660
    public final float getPageWidth(int position) {
        float fM57453c;
        int iM208412y0;
        super.getPageWidth(position);
        if (position == 0 || position == getCount() - 1) {
            int iM208412y1 = xdl0.m208412y0();
            TopCardLayout.Companion c9012a = TopCardLayout.INSTANCE;
            fM57453c = iM208412y1 - (c9012a.m57453c() + c9012a.m57451a());
            iM208412y0 = xdl0.m208412y0();
        } else {
            int iM208412y2 = xdl0.m208412y0();
            TopCardLayout.Companion c9012a2 = TopCardLayout.INSTANCE;
            fM57453c = iM208412y2 - (c9012a2.m57453c() + c9012a2.m57452b());
            iM208412y0 = xdl0.m208412y0();
        }
        return fM57453c / iM208412y0;
    }

    @Override // p149l.eb2
    @NotNull
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public final FrameLayout mo39043p(@NotNull ViewGroup container, int position) {
        container.getClass();
        FrameLayout frameLayout = new FrameLayout(this.context);
        int iM208412y0 = xdl0.m208412y0();
        int iM208412y1 = xdl0.m208412y0();
        TopCardLayout.Companion c9012a = TopCardLayout.INSTANCE;
        int iM57453c = iM208412y0 - ((iM208412y1 - c9012a.m57453c()) - c9012a.m57452b());
        int i = iM57453c / 2;
        if (position == 0) {
            frameLayout.setPadding(c9012a.m57453c(), 0, c9012a.m57452b(), 0);
        } else if (position == getCount() - 1) {
            frameLayout.setPadding(i, 0, iM57453c - i, 0);
        } else {
            frameLayout.setPadding(i, 0, i, 0);
        }
        container.addView(frameLayout, new ViewGroup.LayoutParams(-1, -1));
        return mo57455r(frameLayout, position);
    }

    @NotNull
    /* JADX INFO: renamed from: r */
    public abstract FrameLayout mo57455r(@NotNull FrameLayout container, int position);
}
