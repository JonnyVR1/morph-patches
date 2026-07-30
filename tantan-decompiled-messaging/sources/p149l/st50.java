package p149l;

import com.p046p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage;
import com.p046p1.mobile.longlink.msg.template.Template;
import com.p046p1.mobile.putong.live.base.data.BLiveOperation;
import com.p046p1.mobile.putong.live.base.data.BLiveOperationItem;
import com.p046p1.mobile.putong.live.base.data.BLiveOperationItemPopUpTextDrawer;
import com.p046p1.mobile.putong.live.base.data.BLiveTemplate;
import com.p046p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveMessage;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes4.dex */
public class st50 extends bk2<LongLinkSocketMessage.OperationPopupNotice, e8t> {
    public st50(p3g0<e8t, e8t> p3g0Var, und undVar) {
        super(p3g0Var, undVar);
    }

    /* JADX INFO: renamed from: B */
    public static /* synthetic */ void m185866B(und undVar, e8t e8tVar, BLiveOperation bLiveOperation, BLiveOperationItem bLiveOperationItem) {
        if (NullChecker.m81303a(bLiveOperationItem.popup) && NullChecker.m81303a(bLiveOperationItem.popup.textDrawer)) {
            LiveMessage liveMessageM185868D = m185868D(bLiveOperationItem.popup.textDrawer, undVar);
            if (NullChecker.m81303a(liveMessageM185868D)) {
                e8tVar.f89864b.put(Integer.valueOf(bLiveOperationItem.hashCode()), liveMessageM185868D);
            }
        }
        if (vwb.m200337m(bLiveOperation.operations, new w9j() { // from class: l.rt50
            @Override // p149l.w9j
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
    public static e8t m185867C(final BLiveOperation bLiveOperation, final und undVar) {
        final e8t e8tVar = new e8t();
        e8tVar.f89863a = bLiveOperation;
        if (!BLiveOperation.REFRESH_UNIT.equals(bLiveOperation)) {
            vwb.m200354z(bLiveOperation.operations, new e30() { // from class: l.qt50
                @Override // p149l.e30
                public final void call(Object obj) {
                    st50.m185866B(undVar, e8tVar, bLiveOperation, (BLiveOperationItem) obj);
                }
            });
        }
        return e8tVar;
    }

    /* JADX INFO: renamed from: D */
    public static LiveMessage m185868D(BLiveOperationItemPopUpTextDrawer bLiveOperationItemPopUpTextDrawer, und undVar) {
        BLiveTemplate bLiveTemplateM171773f = undVar.m194417d().m171773f(bLiveOperationItemPopUpTextDrawer.content.templateId);
        pwz pwzVarM194417d = undVar.m194417d();
        crc0 crc0Var = new crc0();
        crc0Var.f82197a = undVar.m194414a();
        crc0Var.f82199c = bLiveOperationItemPopUpTextDrawer.content.hierarchy.userHierarchy;
        Template.TemplateData templateDataBuild = Template.TemplateData.newBuilder().setId(bLiveOperationItemPopUpTextDrawer.content.templateId).addAllFields(bLiveOperationItemPopUpTextDrawer.content.templateFields).build();
        if (NullChecker.m81303a(bLiveTemplateM171773f)) {
            LiveMessage span = LiveMessage.create(bLiveTemplateM171773f, null).setSpan(pwzVarM194417d.m171771d(templateDataBuild, bLiveTemplateM171773f.format, crc0Var));
            if (NullChecker.m81303a(span) && NullChecker.m81303a(span.spanList) && !span.spanList.isEmpty()) {
                return span;
            }
        }
        return null;
    }

    @Override // p149l.vp2
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public boolean mo94400q(LongLinkSocketMessage.OperationPopupNotice operationPopupNotice, String str) {
        return true;
    }

    @Override // p149l.bk2
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public e8t mo94461z(String str, LongLinkSocketMessage.OperationPopupNotice operationPopupNotice) {
        BLiveOperation bLiveOperationNew_ = BLiveOperation.new_();
        bLiveOperationNew_.showOperationDrawer = true;
        bLiveOperationNew_.operations = vwb.m200324f0(e5t.m114916t(operationPopupNotice));
        return m185867C(bLiveOperationNew_, this.f182445c);
    }

    @Override // p149l.vp2, p149l.sul
    /* JADX INFO: renamed from: b */
    public Class<LongLinkSocketMessage.OperationPopupNotice> mo94398b() {
        return LongLinkSocketMessage.OperationPopupNotice.class;
    }

    @Override // p149l.vp2
    /* JADX INFO: renamed from: e */
    public String mo94399e() {
        return "live.operation.popup";
    }
}
