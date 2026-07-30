package p002l;

import com.p000p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveMessage;
import com.p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage;
import com.p1.mobile.longlink.msg.template.Template;
import com.p1.mobile.putong.live.base.data.BLiveOperation;
import com.p1.mobile.putong.live.base.data.BLiveOperationItem;
import com.p1.mobile.putong.live.base.data.BLiveOperationItemPopUpTextDrawer;
import com.p1.mobile.putong.live.base.data.BLiveTemplate;
import com.tantanapp.common.utils.NullChecker;
import l.e30;
import l.p3g0;
import l.vwb;
import l.w9j;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes4.dex */
public class st50 extends bk2<LongLinkSocketMessage.OperationPopupNotice, e8t> {
    public st50(p3g0<e8t, e8t> p3g0Var, und undVar) {
        super(p3g0Var, undVar);
    }

    /* JADX INFO: renamed from: B */
    public static /* synthetic */ void m22676B(und undVar, e8t e8tVar, BLiveOperation bLiveOperation, BLiveOperationItem bLiveOperationItem) {
        if (NullChecker.a(bLiveOperationItem.popup) && NullChecker.a(bLiveOperationItem.popup.textDrawer)) {
            LiveMessage liveMessageM22678D = m22678D(bLiveOperationItem.popup.textDrawer, undVar);
            if (NullChecker.a(liveMessageM22678D)) {
                e8tVar.f9635b.put(Integer.valueOf(bLiveOperationItem.hashCode()), liveMessageM22678D);
            }
        }
        if (vwb.m(bLiveOperation.operations, new w9j() { // from class: l.rt50
            public final Object call(Object obj) {
                return Boolean.valueOf(((BLiveOperationItem) obj).enableEntranceAnim());
            }
        })) {
            if (bLiveOperation.isInit) {
                bLiveOperationItem.isForPrepare = true;
            } else {
                bLiveOperationItem.isForPrepare = bLiveOperationItem.enableEntranceAnim();
            }
        }
    }

    /* JADX INFO: renamed from: C */
    public static e8t m22677C(final BLiveOperation bLiveOperation, final und undVar) {
        final e8t e8tVar = new e8t();
        e8tVar.f9634a = bLiveOperation;
        if (!BLiveOperation.REFRESH_UNIT.equals(bLiveOperation)) {
            vwb.z(bLiveOperation.operations, new e30() { // from class: l.qt50
                public final void call(Object obj) {
                    st50.m22676B(undVar, e8tVar, bLiveOperation, (BLiveOperationItem) obj);
                }
            });
        }
        return e8tVar;
    }

    /* JADX INFO: renamed from: D */
    public static LiveMessage m22678D(BLiveOperationItemPopUpTextDrawer bLiveOperationItemPopUpTextDrawer, und undVar) {
        BLiveTemplate bLiveTemplateM20739f = undVar.m23568d().m20739f(bLiveOperationItemPopUpTextDrawer.content.templateId);
        pwz pwzVarM23568d = undVar.m23568d();
        crc0 crc0Var = new crc0();
        crc0Var.f8911a = undVar.m23565a();
        crc0Var.f8913c = bLiveOperationItemPopUpTextDrawer.content.hierarchy.userHierarchy;
        Template.TemplateData templateData = (Template.TemplateData) Template.TemplateData.newBuilder().setId(bLiveOperationItemPopUpTextDrawer.content.templateId).addAllFields(bLiveOperationItemPopUpTextDrawer.content.templateFields).build();
        if (NullChecker.a(bLiveTemplateM20739f)) {
            LiveMessage span = LiveMessage.create(bLiveTemplateM20739f, null).setSpan(pwzVarM23568d.m20737d(templateData, bLiveTemplateM20739f.format, crc0Var));
            if (NullChecker.a(span) && NullChecker.a(span.spanList) && !span.spanList.isEmpty()) {
                return span;
            }
        }
        return null;
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public boolean mo9246q(LongLinkSocketMessage.OperationPopupNotice operationPopupNotice, String str) {
        return true;
    }

    @Override // p002l.bk2
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public e8t mo9251z(String str, LongLinkSocketMessage.OperationPopupNotice operationPopupNotice) {
        BLiveOperation bLiveOperationNew_ = BLiveOperation.new_();
        bLiveOperationNew_.showOperationDrawer = true;
        bLiveOperationNew_.operations = vwb.f0(new BLiveOperationItem[]{e5t.m12215t(operationPopupNotice)});
        return m22677C(bLiveOperationNew_, this.f21259c);
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: b */
    public Class<LongLinkSocketMessage.OperationPopupNotice> mo9244b() {
        return LongLinkSocketMessage.OperationPopupNotice.class;
    }

    @Override // p002l.vp2
    /* JADX INFO: renamed from: e */
    public String mo9245e() {
        return "live.operation.popup";
    }
}
