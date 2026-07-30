package p153l;

import com.p051p1.mobile.putong.data.DbLinks;
import com.p051p1.mobile.putong.data.Envelope;
import com.p051p1.mobile.putong.data.Moments;
import com.p051p1.mobile.putong.data.PartialIdList;
import com.p051p1.mobile.putong.data.User;
import com.p051p1.mobile.putong.feed.FeedModule;
import com.p051p1.mobile.putong.feed.data.FeedData;
import com.p051p1.mobile.putong.feed.data.Moment;
import com.p051p1.mobile.putong.feed.data.MomentActivity;
import com.p051p1.mobile.putong.feed.data.MomentMessage;
import com.p051p1.mobile.putong.feed.data.PoiMarkInfoData;
import com.tantanapp.common.data.orm.DoubleColumn;
import com.tantanapp.common.data.orm.Index;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes13.dex */
public class qzg extends h9c implements gq2<FeedData> {

    /* JADX INFO: renamed from: c */
    public cr00 f160257c;

    /* JADX INFO: renamed from: d */
    public kh00 f160258d;

    /* JADX INFO: renamed from: e */
    public wzh0<DbLinks> f160259e;

    /* JADX INFO: renamed from: f */
    public wzh0<DbLinks> f160260f;

    /* JADX INFO: renamed from: g */
    public fi80 f160261g;

    /* JADX INFO: renamed from: l */
    public static /* synthetic */ void m178781l(Moment moment, Moment moment2) {
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

    @Override // p153l.h9c
    /* JADX INFO: renamed from: c */
    public int mo133945c() {
        return 18;
    }

    @Override // p153l.h9c
    /* JADX INFO: renamed from: d */
    public int mo133946d() {
        return 1;
    }

    @Override // p153l.h9c
    /* JADX INFO: renamed from: e */
    public String mo133947e() {
        return "feedDb";
    }

    @Override // p153l.h9c
    /* JADX INFO: renamed from: f */
    public ArrayList<wzh0> mo134045f() {
        return super.mo134045f();
    }

    @Override // p153l.h9c
    /* JADX INFO: renamed from: g */
    public void mo133948g() {
        rrq.m182815b().m182819e(FeedData.JSON_ADAPTER, this);
    }

    @Override // p153l.h9c
    /* JADX INFO: renamed from: h */
    public void mo133949h() {
        vzf0<Moment> vzf0Var = Moment.DB_ADAPTER;
        DoubleColumn<Moment> doubleColumn = Moment.CREATEDTIME;
        this.f160257c = new cr00(this, Moments.TYPE, vzf0Var, jyb.m147507f0(new Index(Moment.LOCALINUSERFEED, Moment.OWNER, doubleColumn), new Index(Moment.LOCALINFEED, doubleColumn)), 1000);
        this.f160258d = new kh00(this, "activities", MomentActivity.DB_ADAPTER, jyb.m147507f0(new Index(MomentActivity.CREATEDTIME)), 1000);
        this.f160259e = new wzh0<>(this, "moment_links", DbLinks.DB_ADAPTER, null, 1000);
        this.f160260f = new wzh0<>(this, "comment_links", DbLinks.DB_ADAPTER, null, 1000);
        this.f160261g = new fi80(this, "poi_mark_info", PoiMarkInfoData.DB_ADAPTER, null, 100);
    }

    @Override // p153l.h9c
    /* JADX INFO: renamed from: i */
    public void mo133950i() {
        super.mo133950i();
        rrq.m182815b().m182823i(this, FeedData.JSON_ADAPTER);
    }

    @Override // p153l.h9c
    /* JADX INFO: renamed from: j */
    public void mo133951j(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        switch (i) {
            case 0:
            case 1:
                sQLiteDatabase.execSQL("ALTER TABLE " + this.f160257c.f191760d + " ADD COLUMN hyperlink_c TEXT");
            case 2:
                sQLiteDatabase.execSQL("ALTER TABLE " + this.f160257c.f191760d + " ADD COLUMN str_settings_visibility_c TEXT");
                sQLiteDatabase.execSQL("ALTER TABLE " + this.f160257c.f191760d + " ADD COLUMN str_dynamicType_c TEXT");
                sQLiteDatabase.execSQL("ALTER TABLE " + this.f160257c.f191760d + " ADD COLUMN str_momentType_c TEXT");
                sQLiteDatabase.execSQL("ALTER TABLE " + this.f160257c.f191760d + " ADD COLUMN str_settings_userSetVisibility_c TEXT");
                sQLiteDatabase.execSQL("ALTER TABLE " + this.f160258d.f191760d + " ADD COLUMN str_action_c TEXT");
            case 3:
                sQLiteDatabase.execSQL("ALTER TABLE " + this.f160257c.f191760d + " ADD COLUMN userSetVisibility_c INTEGER");
                sQLiteDatabase.execSQL("ALTER TABLE " + this.f160257c.f191760d + " ADD COLUMN str_userSetVisibility_c TEXT");
            case 4:
                sQLiteDatabase.execSQL("ALTER TABLE " + this.f160257c.f191760d + " ADD COLUMN simpleActivity_id_c TEXT");
                sQLiteDatabase.execSQL("ALTER TABLE " + this.f160257c.f191760d + " ADD COLUMN simpleActivity_name_c TEXT");
            case 5:
                sQLiteDatabase.execSQL("ALTER TABLE " + this.f160257c.f191760d + " ADD COLUMN additionalData_sendFrom_id_c TEXT DEFAULT ''");
                sQLiteDatabase.execSQL("ALTER TABLE " + this.f160257c.f191760d + " ADD COLUMN additionalData_sendFrom_name_c TEXT DEFAULT ''");
                sQLiteDatabase.execSQL("ALTER TABLE " + this.f160257c.f191760d + " ADD COLUMN additionalData_sendFrom_sourceType_c TEXT DEFAULT ''");
            case 6:
                sQLiteDatabase.execSQL("ALTER TABLE " + this.f160258d.f191760d + " ADD COLUMN parentMessageid_c TEXT");
            case 7:
                sQLiteDatabase.execSQL("ALTER TABLE " + this.f160257c.f191760d + " ADD COLUMN group_id_c TEXT");
                sQLiteDatabase.execSQL("ALTER TABLE " + this.f160257c.f191760d + " ADD COLUMN group_name_c TEXT");
                sQLiteDatabase.execSQL("ALTER TABLE " + this.f160257c.f191760d + " ADD COLUMN group_lastJoined_c INTEGER");
                sQLiteDatabase.execSQL("ALTER TABLE " + this.f160257c.f191760d + " ADD COLUMN additionalData_share_title_c TEXT DEFAULT ''");
                sQLiteDatabase.execSQL("ALTER TABLE " + this.f160257c.f191760d + " ADD COLUMN additionalData_share_description_c TEXT DEFAULT ''");
                sQLiteDatabase.execSQL("ALTER TABLE " + this.f160257c.f191760d + " ADD COLUMN additionalData_share_url_c TEXT DEFAULT ''");
                sQLiteDatabase.execSQL("ALTER TABLE " + this.f160257c.f191760d + " ADD COLUMN additionalData_share_landingPage_c TEXT DEFAULT ''");
                sQLiteDatabase.execSQL("ALTER TABLE " + this.f160257c.f191760d + " ADD COLUMN additionalData_share_name_c TEXT DEFAULT ''");
                sQLiteDatabase.execSQL("ALTER TABLE " + this.f160257c.f191760d + " ADD COLUMN additionalData_share_shareFrom_c TEXT DEFAULT ''");
                sQLiteDatabase.execSQL("ALTER TABLE " + this.f160257c.f191760d + " ADD COLUMN additionalData_share_testId_c TEXT DEFAULT ''");
            case 8:
                sQLiteDatabase.execSQL("ALTER TABLE " + this.f160257c.f191760d + " ADD COLUMN deeplink_c TEXT");
            case 9:
                sQLiteDatabase.execSQL("ALTER TABLE " + this.f160257c.f191760d + " ADD COLUMN thirdShareSource_sourceId_c TEXT");
                sQLiteDatabase.execSQL("ALTER TABLE " + this.f160257c.f191760d + " ADD COLUMN thirdShareSource_sourceType_c TEXT");
            case 10:
                sQLiteDatabase.execSQL("ALTER TABLE " + this.f160257c.f191760d + " ADD COLUMN attitudeId_c INTEGER");
                sQLiteDatabase.execSQL("ALTER TABLE " + this.f160257c.f191760d + " ADD COLUMN attitudes_count_c INTEGER");
            case 11:
                sQLiteDatabase.execSQL("ALTER TABLE " + this.f160258d.f191760d + " ADD COLUMN replyMessageId_c TEXT");
            case 12:
                sQLiteDatabase.execSQL("ALTER TABLE " + this.f160257c.f191760d + " ADD COLUMN shareMyVote_c INTEGER");
            case 13:
                sQLiteDatabase.execSQL("ALTER TABLE " + this.f160257c.f191760d + " ADD COLUMN simpleActivity_url_c TEXT");
            case 14:
                sQLiteDatabase.execSQL("ALTER TABLE " + this.f160257c.f191760d + " ADD COLUMN allowForward_c TEXT");
                sQLiteDatabase.execSQL("ALTER TABLE " + this.f160257c.f191760d + " ADD COLUMN forwards_count_c INTEGER");
            case 15:
                sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS " + this.f160261g.f191760d + " (_id INTEGER PRIMARY KEY,id_c TEXT,poiName_c TEXT,latitude_c REAL,longitude_c REAL,address_c TEXT,triggerDate_c INTEGER,punchInDate_c INTEGER,triggerTimes_c INTEGER)");
            case 16:
                sQLiteDatabase.execSQL("ALTER TABLE " + this.f160257c.f191760d + " ADD COLUMN isNewUserAIMoment_c INTEGER");
            case 17:
                sQLiteDatabase.execSQL("ALTER TABLE " + this.f160258d.f191760d + " ADD COLUMN userIds_c BLOB");
                sQLiteDatabase.execSQL("ALTER TABLE " + this.f160258d.f191760d + " ADD COLUMN count_c INTEGER");
                break;
        }
    }

    @Override // p153l.gq2
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public void mo131338a(Envelope envelope, final FeedData feedData, boolean z, boolean z2, boolean z3) {
        for (final Moment moment : feedData.moments) {
            PartialIdList partialIdList = moment.messages;
            if (partialIdList != null) {
                if (jyb.m147536y(jyb.m147497a0(partialIdList.ids.size()), new qcj() { // from class: l.nzg
                    @Override // p153l.qcj
                    public final Object call(Object obj) {
                        return Boolean.valueOf(jyb.m147520m(feedData.messages, new qcj() { // from class: l.pzg
                            @Override // p153l.qcj
                            public final Object call(Object obj2) {
                                MomentMessage momentMessage = (MomentMessage) obj2;
                                return Boolean.valueOf(momentMessage.localInMoment && momentMessage.f56856id.equals(moment.messages.ids.get(num.intValue())));
                            }
                        }));
                    }
                })) {
                    FeedModule.m61406H().mo31704K9(moment.f56859id, moment.messages.ids, false);
                    DbLinks dbLinks = new DbLinks();
                    PartialIdList partialIdList2 = moment.messages;
                    dbLinks.total = partialIdList2.count;
                    dbLinks.links = partialIdList2.links;
                    dbLinks.f56859id = moment.f56859id;
                    this.f160260f.upsert(dbLinks);
                }
                ListIterator<String> listIterator = moment.messages.ids.listIterator();
                HashMap<String, Boolean> mapMo31758dg = FeedModule.m61406H().mo31758dg(envelope);
                while (listIterator.hasNext()) {
                    Boolean bool = mapMo31758dg.get(listIterator.next());
                    if (bool != null && bool.booleanValue()) {
                        listIterator.remove();
                        moment.messages.count--;
                    }
                }
            }
            this.f160257c.upsert(moment, new z20() { // from class: l.ozg
                @Override // p153l.z20
                public final void call(Object obj, Object obj2) {
                    qzg.m178781l((Moment) obj, (Moment) obj2);
                }
            });
            if (User.isTeamAccount(moment.owner) && z2 && feedData.messages.size() != 0 && feedData.messages.get(0) != null && !feedData.messages.get(0).recalled.booleanValue()) {
                FeedModule.m61406H().mo31811ps(moment.f56859id);
            }
        }
        Iterator<MomentActivity> it = feedData.activities.iterator();
        while (it.hasNext()) {
            this.f160258d.upsert(it.next());
        }
    }

    @Override // p153l.gq2
    /* JADX INFO: renamed from: b */
    public void mo131339b(Envelope envelope) {
    }
}
