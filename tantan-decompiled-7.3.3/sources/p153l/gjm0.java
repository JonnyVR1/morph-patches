package p153l;

import android.view.View;
import com.p051p1.mobile.android.app.Act;
import com.p051p1.mobile.putong.core.data.Item;
import com.p051p1.mobile.putong.core.p058ui.visitor.AbstractC9208a;
import com.p051p1.mobile.putong.core.p058ui.visitor.C9209b;
import com.p051p1.mobile.putong.core.p058ui.visitor.VisitorsUnPrivilegeView;
import com.p051p1.mobile.putong.data.OMSDialogPositon;
import com.tencent.open.SocialConstants;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@Metadata(m88120d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B)\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ3\u0010\u0012\u001a\u00020\u00112\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m88121d2 = {"Ll/gjm0;", "Lcom/p1/mobile/putong/core/ui/visitor/b;", "Lcom/p1/mobile/android/app/Act;", SocialConstants.PARAM_ACT, "Lcom/p1/mobile/putong/core/ui/visitor/a$a;", "callback", "Ll/h80;", "adapterStatics", "<init>", "(Lcom/p1/mobile/android/app/Act;Lcom/p1/mobile/putong/core/ui/visitor/a$a;Ll/h80;)V", "Landroid/view/View;", "convertView", "Ll/cfm0;", Item.TYPE, "", "itemViewType", "position", "", "G", "(Landroid/view/View;Ll/cfm0;II)V", "member_intlGmsRelease"}, m88122k = 1, m88123mv = {2, 2, 0}, m88125xi = 48)
public final class gjm0 extends C9209b {
    public gjm0(@Nullable Act act, @Nullable AbstractC9208a.a aVar, @Nullable h80<?> h80Var) {
        super(act, aVar, h80Var);
    }

    @Override // com.p051p1.mobile.putong.core.p058ui.visitor.C9209b, p153l.jic0
    /* JADX INFO: renamed from: G */
    public void mo29822A(@Nullable View convertView, @Nullable cfm0 item, int itemViewType, int position) {
        super.mo29822A(convertView, item, itemViewType, position);
        if (itemViewType == 2) {
            VisitorsUnPrivilegeView visitorsUnPrivilegeView = convertView instanceof VisitorsUnPrivilegeView ? (VisitorsUnPrivilegeView) convertView : null;
            if (visitorsUnPrivilegeView != null) {
                visitorsUnPrivilegeView.m59042r(OMSDialogPositon.p_navigation_view, "p_navigation,visit_module");
            }
        }
    }
}
