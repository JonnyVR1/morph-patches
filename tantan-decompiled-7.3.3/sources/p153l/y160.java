package p153l;

import com.p051p1.mobile.longlink.msg.livecampaign.LongLinkSocketMessage;
import com.p051p1.mobile.longlink.msg.template.Template;
import com.p051p1.mobile.putong.live.base.data.BLiveOperation;
import com.p051p1.mobile.putong.live.base.data.BLiveOperationItem;
import com.p051p1.mobile.putong.live.base.data.BLiveOperationItemPopUpTextDrawer;
import com.p051p1.mobile.putong.live.base.data.BLiveTemplate;
import com.p051p1.mobile.putong.live.livingroom.archi.longlink.bean.LiveMessage;
import com.tantanapp.common.utils.NullChecker;

/* JADX INFO: loaded from: classes4.dex */
public class y160 extends jk2<LongLinkSocketMessage.OperationPopupNotice, fat> {
    public y160(wbg0<fat, fat> wbg0Var, zod zodVar) {
        super(wbg0Var, zodVar);
    }

    /* JADX INFO: renamed from: B */
    public static /* synthetic */ void m213933B(zod zodVar, fat fatVar, BLiveOperation bLiveOperation, BLiveOperationItem bLiveOperationItem) {
        if (NullChecker.m82486a(bLiveOperationItem.popup) && NullChecker.m82486a(bLiveOperationItem.popup.textDrawer)) {
            LiveMessage liveMessageM213935D = m213935D(bLiveOperationItem.popup.textDrawer, zodVar);
            if (NullChecker.m82486a(liveMessageM213935D)) {
                fatVar.f98009b.put(Integer.valueOf(bLiveOperationItem.hashCode()), liveMessageM213935D);
            }
        }
        if (jyb.m147520m(bLiveOperation.operations, new qcj() { // from class: l.x160
            @Override // p153l.qcj
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
    public static fat m213934C(final BLiveOperation bLiveOperation, final zod zodVar) {
        final fat fatVar = new fat();
        fatVar.f98008a = bLiveOperation;
        if (!BLiveOperation.REFRESH_UNIT.equals(bLiveOperation)) {
            jyb.m147537z(bLiveOperation.operations, new y20() { // from class: l.w160
                @Override // p153l.y20
                public final void call(Object obj) {
                    y160.m213933B(zodVar, fatVar, bLiveOperation, (BLiveOperationItem) obj);
                }
            });
        }
        return fatVar;
    }

    /* JADX INFO: renamed from: D */
    public static LiveMessage m213935D(BLiveOperationItemPopUpTextDrawer bLiveOperationItemPopUpTextDrawer, zod zodVar) {
        BLiveTemplate bLiveTemplateM157079f = zodVar.m220736d().m157079f(bLiveOperationItemPopUpTextDrawer.content.templateId);
        m500 m500VarM220736d = zodVar.m220736d();
        hzc0 hzc0Var = new hzc0();
        hzc0Var.f112221a = zodVar.m220733a();
        hzc0Var.f112223c = bLiveOperationItemPopUpTextDrawer.content.hierarchy.userHierarchy;
        Template.TemplateData templateDataBuild = Template.TemplateData.newBuilder().setId(bLiveOperationItemPopUpTextDrawer.content.templateId).addAllFields(bLiveOperationItemPopUpTextDrawer.content.templateFields).build();
        if (NullChecker.m82486a(bLiveTemplateM157079f)) {
            LiveMessage span = LiveMessage.create(bLiveTemplateM157079f, null).setSpan(m500VarM220736d.m157077d(templateDataBuild, bLiveTemplateM157079f.format, hzc0Var));
            if (NullChecker.m82486a(span) && NullChecker.m82486a(span.spanList) && !span.spanList.isEmpty()) {
                return span;
            }
        }
        return null;
    }

    @Override // p153l.mq2
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public boolean mo95512q(LongLinkSocketMessage.OperationPopupNotice operationPopupNotice, String str) {
        return true;
    }

    @Override // p153l.jk2
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public fat mo95993z(String str, LongLinkSocketMessage.OperationPopupNotice operationPopupNotice) {
        BLiveOperation bLiveOperationNew_ = BLiveOperation.new_();
        bLiveOperationNew_.showOperationDrawer = true;
        bLiveOperationNew_.operations = jyb.m147507f0(f7t.m124500t(operationPopupNotice));
        return m213934C(bLiveOperationNew_, this.f137993c);
    }

    @Override // p153l.mq2, p153l.fxl
    /* JADX INFO: renamed from: b */
    public Class<LongLinkSocketMessage.OperationPopupNotice> mo95510b() {
        return LongLinkSocketMessage.OperationPopupNotice.class;
    }

    @Override // p153l.mq2
    /* JADX INFO: renamed from: e */
    public String mo95511e() {
        return "live.operation.popup";
    }
}
