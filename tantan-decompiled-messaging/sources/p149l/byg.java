package p149l;

import com.p046p1.mobile.putong.data.DbLinks;
import com.p046p1.mobile.putong.data.Envelope;
import com.p046p1.mobile.putong.data.Moments;
import com.p046p1.mobile.putong.data.PartialIdList;
import com.p046p1.mobile.putong.data.User;
import com.p046p1.mobile.putong.feed.FeedModule;
import com.p046p1.mobile.putong.feed.data.FeedData;
import com.p046p1.mobile.putong.feed.data.Moment;
import com.p046p1.mobile.putong.feed.data.MomentActivity;
import com.p046p1.mobile.putong.feed.data.MomentMessage;
import com.p046p1.mobile.putong.feed.data.PoiMarkInfoData;
import com.tantanapp.common.data.orm.DoubleColumn;
import com.tantanapp.common.data.orm.Index;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes12.dex */
public class byg extends b8c implements pp2<FeedData> {

    /* JADX INFO: renamed from: c */
    public ti00 f77913c;

    /* JADX INFO: renamed from: d */
    public b900 f77914d;

    /* JADX INFO: renamed from: e */
    public orh0<DbLinks> f77915e;

    /* JADX INFO: renamed from: f */
    public orh0<DbLinks> f77916f;

    /* JADX INFO: renamed from: g */
    public z980 f77917g;

    /* JADX INFO: renamed from: l */
    public static /* synthetic */ void m104453l(Moment moment, Moment moment2) {
        if (moment2 != null) {
            moment.localCreatedSession = moment2.localCreatedSession;
            boolean z = true;
            moment.localInFeed = moment.localInFeed || moment2.localInFeed;
            if (!moment.localInUserFeed && !moment2.localInUserFeed) {
                z = false;
            }
            moment.localInUserFeed = z;
        }
    }

    @Override // p149l.b8c
    /* JADX INFO: renamed from: c */
    public int mo100761c() {
        return 18;
    }

    @Override // p149l.b8c
    /* JADX INFO: renamed from: d */
    public int mo100762d() {
        return 1;
    }

    @Override // p149l.b8c
    /* JADX INFO: renamed from: e */
    public String mo100763e() {
        return "feedDb";
    }

    @Override // p149l.b8c
    /* JADX INFO: renamed from: f */
    public ArrayList<orh0> mo100764f() {
        return super.mo100764f();
    }

    @Override // p149l.b8c
    /* JADX INFO: renamed from: g */
    public void mo100765g() {
        rpq.m180387b().m180391e(FeedData.JSON_ADAPTER, this);
    }

    @Override // p149l.b8c
    /* JADX INFO: renamed from: h */
    public void mo100766h() {
        mrf0<Moment> mrf0Var = Moment.DB_ADAPTER;
        DoubleColumn<Moment> doubleColumn = Moment.CREATEDTIME;
        this.f77913c = new ti00(this, Moments.TYPE, mrf0Var, vwb.m200324f0(new Index(Moment.LOCALINUSERFEED, Moment.OWNER, doubleColumn), new Index(Moment.LOCALINFEED, doubleColumn)), 1000);
        this.f77914d = new b900(this, "activities", MomentActivity.DB_ADAPTER, vwb.m200324f0(new Index(MomentActivity.CREATEDTIME)), 1000);
        this.f77915e = new orh0<>(this, "moment_links", DbLinks.DB_ADAPTER, null, 1000);
        this.f77916f = new orh0<>(this, "comment_links", DbLinks.DB_ADAPTER, null, 1000);
        this.f77917g = new z980(this, "poi_mark_info", PoiMarkInfoData.DB_ADAPTER, null, 100);
    }

    @Override // p149l.b8c
    /* JADX INFO: renamed from: i */
    public void mo100767i() {
        super.mo100767i();
        rpq.m180387b().m180395i(this, FeedData.JSON_ADAPTER);
    }

    @Override // p149l.b8c
    /* JADX INFO: renamed from: j */
    public void mo100768j(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        switch (i) {
            case 0:
            case 1:
                sQLiteDatabase.execSQL("ALTER TABLE " + this.f77913c.f145283d + " ADD COLUMN hyperlink_c TEXT");
            case 2:
                sQLiteDatabase.execSQL("ALTER TABLE " + this.f77913c.f145283d + " ADD COLUMN str_settings_visibility_c TEXT");
                sQLiteDatabase.execSQL("ALTER TABLE " + this.f77913c.f145283d + " ADD COLUMN str_dynamicType_c TEXT");
                sQLiteDatabase.execSQL("ALTER TABLE " + this.f77913c.f145283d + " ADD COLUMN str_momentType_c TEXT");
                sQLiteDatabase.execSQL("ALTER TABLE " + this.f77913c.f145283d + " ADD COLUMN str_settings_userSetVisibility_c TEXT");
                sQLiteDatabase.execSQL("ALTER TABLE " + this.f77914d.f145283d + " ADD COLUMN str_action_c TEXT");
            case 3:
                sQLiteDatabase.execSQL("ALTER TABLE " + this.f77913c.f145283d + " ADD COLUMN userSetVisibility_c INTEGER");
                sQLiteDatabase.execSQL("ALTER TABLE " + this.f77913c.f145283d + " ADD COLUMN str_userSetVisibility_c TEXT");
            case 4:
                sQLiteDatabase.execSQL("ALTER TABLE " + this.f77913c.f145283d + " ADD COLUMN simpleActivity_id_c TEXT");
                sQLiteDatabase.execSQL("ALTER TABLE " + this.f77913c.f145283d + " ADD COLUMN simpleActivity_name_c TEXT");
            case 5:
                sQLiteDatabase.execSQL("ALTER TABLE " + this.f77913c.f145283d + " ADD COLUMN additionalData_sendFrom_id_c TEXT DEFAULT ''");
                sQLiteDatabase.execSQL("ALTER TABLE " + this.f77913c.f145283d + " ADD COLUMN additionalData_sendFrom_name_c TEXT DEFAULT ''");
                sQLiteDatabase.execSQL("ALTER TABLE " + this.f77913c.f145283d + " ADD COLUMN additionalData_sendFrom_sourceType_c TEXT DEFAULT ''");
            case 6:
                sQLiteDatabase.execSQL("ALTER TABLE " + this.f77914d.f145283d + " ADD COLUMN parentMessageid_c TEXT");
            case 7:
                sQLiteDatabase.execSQL("ALTER TABLE " + this.f77913c.f145283d + " ADD COLUMN group_id_c TEXT");
                sQLiteDatabase.execSQL("ALTER TABLE " + this.f77913c.f145283d + " ADD COLUMN group_name_c TEXT");
                sQLiteDatabase.execSQL("ALTER TABLE " + this.f77913c.f145283d + " ADD COLUMN group_lastJoined_c INTEGER");
                sQLiteDatabase.execSQL("ALTER TABLE " + this.f77913c.f145283d + " ADD COLUMN additionalData_share_title_c TEXT DEFAULT ''");
                sQLiteDatabase.execSQL("ALTER TABLE " + this.f77913c.f145283d + " ADD COLUMN additionalData_share_description_c TEXT DEFAULT ''");
                sQLiteDatabase.execSQL("ALTER TABLE " + this.f77913c.f145283d + " ADD COLUMN additionalData_share_url_c TEXT DEFAULT ''");
                sQLiteDatabase.execSQL("ALTER TABLE " + this.f77913c.f145283d + " ADD COLUMN additionalData_share_landingPage_c TEXT DEFAULT ''");
                sQLiteDatabase.execSQL("ALTER TABLE " + this.f77913c.f145283d + " ADD COLUMN additionalData_share_name_c TEXT DEFAULT ''");
                sQLiteDatabase.execSQL("ALTER TABLE " + this.f77913c.f145283d + " ADD COLUMN additionalData_share_shareFrom_c TEXT DEFAULT ''");
                sQLiteDatabase.execSQL("ALTER TABLE " + this.f77913c.f145283d + " ADD COLUMN additionalData_share_testId_c TEXT DEFAULT ''");
            case 8:
                sQLiteDatabase.execSQL("ALTER TABLE " + this.f77913c.f145283d + " ADD COLUMN deeplink_c TEXT");
            case 9:
                sQLiteDatabase.execSQL("ALTER TABLE " + this.f77913c.f145283d + " ADD COLUMN thirdShareSource_sourceId_c TEXT");
                sQLiteDatabase.execSQL("ALTER TABLE " + this.f77913c.f145283d + " ADD COLUMN thirdShareSource_sourceType_c TEXT");
            case 10:
                sQLiteDatabase.execSQL("ALTER TABLE " + this.f77913c.f145283d + " ADD COLUMN attitudeId_c INTEGER");
                sQLiteDatabase.execSQL("ALTER TABLE " + this.f77913c.f145283d + " ADD COLUMN attitudes_count_c INTEGER");
            case 11:
                sQLiteDatabase.execSQL("ALTER TABLE " + this.f77914d.f145283d + " ADD COLUMN replyMessageId_c TEXT");
            case 12:
                sQLiteDatabase.execSQL("ALTER TABLE " + this.f77913c.f145283d + " ADD COLUMN shareMyVote_c INTEGER");
            case 13:
                sQLiteDatabase.execSQL("ALTER TABLE " + this.f77913c.f145283d + " ADD COLUMN simpleActivity_url_c TEXT");
            case 14:
                sQLiteDatabase.execSQL("ALTER TABLE " + this.f77913c.f145283d + " ADD COLUMN allowForward_c TEXT");
                sQLiteDatabase.execSQL("ALTER TABLE " + this.f77913c.f145283d + " ADD COLUMN forwards_count_c INTEGER");
            case 15:
                sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS " + this.f77917g.f145283d + " (_id INTEGER PRIMARY KEY,id_c TEXT,poiName_c TEXT,latitude_c REAL,longitude_c REAL,address_c TEXT,triggerDate_c INTEGER,punchInDate_c INTEGER,triggerTimes_c INTEGER)");
            case 16:
                sQLiteDatabase.execSQL("ALTER TABLE " + this.f77913c.f145283d + " ADD COLUMN isNewUserAIMoment_c INTEGER");
            case 17:
                sQLiteDatabase.execSQL("ALTER TABLE " + this.f77914d.f145283d + " ADD COLUMN userIds_c BLOB");
                sQLiteDatabase.execSQL("ALTER TABLE " + this.f77914d.f145283d + " ADD COLUMN count_c INTEGER");
                break;
        }
    }

    @Override // p149l.pp2
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public void mo104455a(Envelope envelope, final FeedData feedData, boolean z, boolean z2, boolean z3) {
        for (final Moment moment : feedData.moments) {
            PartialIdList partialIdList = moment.messages;
            if (partialIdList != null) {
                if (vwb.m200353y(vwb.m200314a0(partialIdList.ids.size()), new w9j() { // from class: l.yxg
                    @Override // p149l.w9j
                    public final Object call(Object obj) {
                        return Boolean.valueOf(vwb.m200337m(feedData.messages, new w9j() { // from class: l.ayg
                            @Override // p149l.w9j
                            public final Object call(Object obj2) {
                                MomentMessage momentMessage = (MomentMessage) obj2;
                                return Boolean.valueOf(momentMessage.localInMoment && momentMessage.f56008id.equals(moment.messages.ids.get(num.intValue())));
                            }
                        }));
                    }
                })) {
                    FeedModule.m60222H().mo30701K9(moment.f56011id, moment.messages.ids, false);
                    DbLinks dbLinks = new DbLinks();
                    PartialIdList partialIdList2 = moment.messages;
                    dbLinks.total = partialIdList2.count;
                    dbLinks.links = partialIdList2.links;
                    dbLinks.f56011id = moment.f56011id;
                    this.f77916f.upsert(dbLinks);
                }
                ListIterator<String> listIterator = moment.messages.ids.listIterator();
                HashMap<String, Boolean> mapMo30755dg = FeedModule.m60222H().mo30755dg(envelope);
                while (listIterator.hasNext()) {
                    Boolean bool = mapMo30755dg.get(listIterator.next());
                    if (bool != null && bool.booleanValue()) {
                        listIterator.remove();
                        moment.messages.count--;
                    }
                }
            }
            this.f77913c.upsert(moment, new f30() { // from class: l.zxg
                @Override // p149l.f30
                public final void call(Object obj, Object obj2) {
                    byg.m104453l((Moment) obj, (Moment) obj2);
                }
            });
            if (User.isTeamAccount(moment.owner) && z2 && feedData.messages.size() != 0 && feedData.messages.get(0) != null && !feedData.messages.get(0).recalled.booleanValue()) {
                FeedModule.m60222H().mo30808ps(moment.f56011id);
            }
        }
        Iterator<MomentActivity> it = feedData.activities.iterator();
        while (it.hasNext()) {
            this.f77914d.upsert(it.next());
        }
    }

    @Override // p149l.pp2
    /* JADX INFO: renamed from: b */
    public void mo104456b(Envelope envelope) {
    }
}
