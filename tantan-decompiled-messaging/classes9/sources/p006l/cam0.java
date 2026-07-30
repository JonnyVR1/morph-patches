package p006l;

import android.view.View;
import com.p000p1.mobile.putong.core.p004ui.visitor.AbstractC0481a;
import com.p000p1.mobile.putong.core.p004ui.visitor.C0482b;
import com.p000p1.mobile.putong.core.p004ui.visitor.VisitorsUnPrivilegeView;
import com.p1.mobile.android.app.Act;
import kotlin.Metadata;
import l.l80;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes9.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B)\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ3\u0010\u0012\u001a\u00020\u00112\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Ll/cam0;", "Lcom/p1/mobile/putong/core/ui/visitor/b;", "Lcom/p1/mobile/android/app/Act;", "act", "Lcom/p1/mobile/putong/core/ui/visitor/a$a;", "callback", "Ll/l80;", "adapterStatics", "<init>", "(Lcom/p1/mobile/android/app/Act;Lcom/p1/mobile/putong/core/ui/visitor/a$a;Ll/l80;)V", "Landroid/view/View;", "convertView", "Ll/y5m0;", "item", "", "itemViewType", "position", "", "G", "(Landroid/view/View;Ll/y5m0;II)V", "member_intlGmsRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class cam0 extends C0482b {
    public cam0(@Nullable Act act, @Nullable AbstractC0481a.a aVar, @Nullable l80<?> l80Var) {
        super(act, aVar, l80Var);
    }

    @Override // com.p000p1.mobile.putong.core.p004ui.visitor.C0482b
    /* JADX INFO: renamed from: G */
    public void mo11376A(@Nullable View convertView, @Nullable y5m0 item, int itemViewType, int position) {
        super.mo11376A(convertView, item, itemViewType, position);
        if (itemViewType == 2) {
            VisitorsUnPrivilegeView visitorsUnPrivilegeView = convertView instanceof VisitorsUnPrivilegeView ? (VisitorsUnPrivilegeView) convertView : null;
            if (visitorsUnPrivilegeView != null) {
                visitorsUnPrivilegeView.m11368r("p_navigation_view", "p_navigation,visit_module");
            }
        }
    }
}
