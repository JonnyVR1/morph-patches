package p153l;

import com.p051p1.mobile.putong.data.CommonData;
import com.p051p1.mobile.putong.data.DbLinks;
import com.p051p1.mobile.putong.data.Envelope;
import com.p051p1.mobile.putong.data.User;
import io.requery.android.database.sqlite.SQLiteDatabase;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes9.dex */
public class vj5 extends h9c implements gq2<CommonData> {

    /* JADX INFO: renamed from: c */
    public wzh0<DbLinks> f184354c;

    /* JADX INFO: renamed from: d */
    public ejk0 f184355d;

    @Override // p153l.h9c
    /* JADX INFO: renamed from: c */
    public int mo133945c() {
        return 32;
    }

    @Override // p153l.h9c
    /* JADX INFO: renamed from: d */
    public int mo133946d() {
        return 0;
    }

    @Override // p153l.h9c
    /* JADX INFO: renamed from: e */
    public String mo133947e() {
        return "commonDb";
    }

    @Override // p153l.h9c
    /* JADX INFO: renamed from: f */
    public ArrayList<wzh0> mo134045f() {
        return super.mo134045f();
    }

    @Override // p153l.h9c
    /* JADX INFO: renamed from: g */
    public void mo133948g() {
        rrq.m182815b().m182819e(CommonData.JSON_ADAPTER, this);
    }

    @Override // p153l.h9c
    /* JADX INFO: renamed from: h */
    public void mo133949h() {
        this.f184354c = new wzh0<>(this, "links", DbLinks.DB_ADAPTER, null, 1000);
        this.f184355d = new ejk0(this, "users", User.DB_ADAPTER, null, 1000);
    }

    @Override // p153l.h9c
    /* JADX INFO: renamed from: i */
    public void mo133950i() {
        super.mo133950i();
        rrq.m182815b().m182823i(this, CommonData.JSON_ADAPTER);
    }

    @Override // p153l.h9c
    /* JADX INFO: renamed from: j */
    public void mo133951j(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        switch (i) {
            case 1:
                sQLiteDatabase.execSQL("ALTER TABLE " + this.f184355d.f191760d + " ADD COLUMN inactivated_c INTEGER");
            case 2:
                sQLiteDatabase.execSQL("ALTER TABLE " + this.f184355d.f191760d + " ADD COLUMN profile_extensions_basic_country_c BLOB");
                sQLiteDatabase.execSQL("ALTER TABLE " + this.f184355d.f191760d + " ADD COLUMN profile_extensions_basic_province_c BLOB");
                sQLiteDatabase.execSQL("ALTER TABLE " + this.f184355d.f191760d + " ADD COLUMN profile_extensions_basic_city_c BLOB");
            case 3:
                sQLiteDatabase.execSQL("ALTER TABLE " + this.f184355d.f191760d + " ADD COLUMN str_profile_zodiac_c TEXT");
                sQLiteDatabase.execSQL("ALTER TABLE " + this.f184355d.f191760d + " ADD COLUMN str_status_c BLOB");
                sQLiteDatabase.execSQL("ALTER TABLE " + this.f184355d.f191760d + " ADD COLUMN str_gender_c TEXT");
                sQLiteDatabase.execSQL("ALTER TABLE " + this.f184355d.f191760d + " ADD COLUMN str_membership_name_c TEXT");
                sQLiteDatabase.execSQL("ALTER TABLE " + this.f184355d.f191760d + " ADD COLUMN str_source_c TEXT");
                sQLiteDatabase.execSQL("ALTER TABLE " + this.f184355d.f191760d + " ADD COLUMN str_membership_vipBadgeType_c TEXT");
                sQLiteDatabase.execSQL("ALTER TABLE " + this.f184355d.f191760d + " ADD COLUMN str_profile_studies_qualification_c TEXT");
                sQLiteDatabase.execSQL("ALTER TABLE " + this.f184355d.f191760d + " ADD COLUMN str_location_invisibleFields_c BLOB");
                sQLiteDatabase.execSQL("ALTER TABLE " + this.f184355d.f191760d + " ADD COLUMN str_profile_extensions_physical_bloodType_c BLOB");
                sQLiteDatabase.execSQL("ALTER TABLE " + this.f184355d.f191760d + " ADD COLUMN str_profile_extensions_basic_friendPurpose_c BLOB");
                sQLiteDatabase.execSQL("ALTER TABLE " + this.f184355d.f191760d + " ADD COLUMN str_profile_extensions_friendStatus_status_c BLOB");
            case 4:
                sQLiteDatabase.execSQL("ALTER TABLE " + this.f184355d.f191760d + " ADD COLUMN profile_extensions_momentSwitch_noSyncMoment_c BLOB");
            case 5:
                sQLiteDatabase.execSQL("ALTER TABLE " + this.f184355d.f191760d + " ADD COLUMN profile_extensions_wealth_c BLOB");
                sQLiteDatabase.execSQL("ALTER TABLE " + this.f184355d.f191760d + " ADD COLUMN profile_extensions_basic_qualification_c BLOB");
                sQLiteDatabase.execSQL("ALTER TABLE " + this.f184355d.f191760d + " ADD COLUMN profile_extensions_physical_height_c BLOB");
            case 6:
                sQLiteDatabase.execSQL("ALTER TABLE " + this.f184355d.f191760d + " ADD COLUMN profile_extensions_profileCompletion_c BLOB");
                sQLiteDatabase.execSQL("ALTER TABLE " + this.f184355d.f191760d + " ADD COLUMN profile_extensions_voiceSignature_c BLOB");
            case 7:
                sQLiteDatabase.execSQL("ALTER TABLE " + this.f184355d.f191760d + " ADD COLUMN activityUser_action_c TEXT");
                sQLiteDatabase.execSQL("ALTER TABLE " + this.f184355d.f191760d + " ADD COLUMN activityUser_score_c INTEGER");
            case 8:
                sQLiteDatabase.execSQL("ALTER TABLE " + this.f184355d.f191760d + " ADD COLUMN matePlanUser_c INTEGER");
                sQLiteDatabase.execSQL("ALTER TABLE " + this.f184355d.f191760d + " ADD COLUMN matePlanAdUser_c INTEGER");
            case 9:
                sQLiteDatabase.execSQL("ALTER TABLE " + this.f184355d.f191760d + " ADD COLUMN regionTag_c TEXT");
            case 10:
                sQLiteDatabase.execSQL("ALTER TABLE " + this.f184355d.f191760d + " ADD COLUMN localLikeIdentifiers_c BLOB");
            case 11:
                sQLiteDatabase.execSQL("ALTER TABLE " + this.f184355d.f191760d + " ADD COLUMN deleted_c INTEGER");
                sQLiteDatabase.execSQL("ALTER TABLE " + this.f184355d.f191760d + " ADD COLUMN profile_extensions_interest_tags_c BLOB");
            case 12:
                sQLiteDatabase.execSQL("ALTER TABLE " + this.f184355d.f191760d + " ADD COLUMN profile_extensions_live_voiceImgId_c BLOB");
                sQLiteDatabase.execSQL("ALTER TABLE " + this.f184355d.f191760d + " ADD COLUMN profile_extensions_live_voiceImgUrl_c BLOB");
            case 13:
                sQLiteDatabase.execSQL("ALTER TABLE " + this.f184355d.f191760d + " ADD COLUMN profile_extensions_mate_c BLOB");
            case 14:
                sQLiteDatabase.execSQL("ALTER TABLE " + this.f184355d.f191760d + " ADD COLUMN profile_extensions_pet_c BLOB");
            case 15:
                sQLiteDatabase.execSQL("ALTER TABLE " + this.f184355d.f191760d + " ADD COLUMN profile_extensions_tailFrame_url_c BLOB");
                sQLiteDatabase.execSQL("ALTER TABLE " + this.f184355d.f191760d + " ADD COLUMN profile_extensions_tailFrame_expiredTime_c BLOB");
            case 16:
                sQLiteDatabase.execSQL("ALTER TABLE " + this.f184355d.f191760d + " ADD COLUMN profile_extensions_business_avatarID_c BLOB");
                sQLiteDatabase.execSQL("ALTER TABLE " + this.f184355d.f191760d + " ADD COLUMN profile_extensions_business_avatarExpireTime_c BLOB");
                sQLiteDatabase.execSQL("ALTER TABLE " + this.f184355d.f191760d + " ADD COLUMN profile_extensions_business_avatarClose_c BLOB");
            case 17:
                sQLiteDatabase.execSQL("ALTER TABLE " + this.f184355d.f191760d + " ADD COLUMN specialEffect_c BLOB");
            case 18:
                sQLiteDatabase.execSQL("ALTER TABLE " + this.f184355d.f191760d + " ADD COLUMN profile_extensions_basic_ethnicity_c BLOB");
                sQLiteDatabase.execSQL("ALTER TABLE " + this.f184355d.f191760d + " ADD COLUMN profile_extensions_basic_language_c BLOB");
            case 19:
                sQLiteDatabase.execSQL("ALTER TABLE " + this.f184355d.f191760d + " ADD COLUMN profile_extensions_voiceAvatarFrame_c BLOB");
            case 20:
                sQLiteDatabase.execSQL("ALTER TABLE " + this.f184355d.f191760d + " ADD COLUMN profile_extensions_physical_heightImg_c BLOB");
            case 21:
                sQLiteDatabase.execSQL("ALTER TABLE " + this.f184355d.f191760d + " ADD COLUMN profile_extensions_marriage_c BLOB");
                sQLiteDatabase.execSQL("ALTER TABLE " + this.f184355d.f191760d + " ADD COLUMN profile_extensions_basic_address_c BLOB");
                sQLiteDatabase.execSQL("ALTER TABLE " + this.f184355d.f191760d + " ADD COLUMN profile_extensions_basic_familyBackground_c BLOB");
                sQLiteDatabase.execSQL("ALTER TABLE " + this.f184355d.f191760d + " ADD COLUMN profile_extensions_physical_weight_c BLOB");
            case 22:
                sQLiteDatabase.execSQL("ALTER TABLE " + this.f184355d.f191760d + " ADD COLUMN verifications_others_otherCTDID_verified_c INTEGER");
            case 23:
                sQLiteDatabase.execSQL("ALTER TABLE " + this.f184355d.f191760d + " ADD COLUMN profile_extensions_game_c BLOB");
            case 24:
                sQLiteDatabase.execSQL("ALTER TABLE " + this.f184355d.f191760d + " ADD COLUMN profile_extensions_basic_facialFeature_c BLOB");
                sQLiteDatabase.execSQL("ALTER TABLE " + this.f184355d.f191760d + " ADD COLUMN verifications_idCard_age_c INTEGER");
                sQLiteDatabase.execSQL("ALTER TABLE " + this.f184355d.f191760d + " ADD COLUMN verifications_idCard_first4_c TEXT");
                sQLiteDatabase.execSQL("ALTER TABLE " + this.f184355d.f191760d + " ADD COLUMN profile_extensions_physical_fitness_c BLOB");
                sQLiteDatabase.execSQL("ALTER TABLE " + this.f184355d.f191760d + " ADD COLUMN profile_extensions_physical_drink_c BLOB");
                sQLiteDatabase.execSQL("ALTER TABLE " + this.f184355d.f191760d + " ADD COLUMN profile_extensions_physical_smoke_c BLOB");
                sQLiteDatabase.execSQL("ALTER TABLE " + this.f184355d.f191760d + " ADD COLUMN profile_extensions_basic_mbti_c BLOB");
            case 25:
                sQLiteDatabase.execSQL("ALTER TABLE " + this.f184355d.f191760d + " ADD COLUMN userActivityInfo_c BLOB");
            case 26:
                sQLiteDatabase.execSQL("ALTER TABLE " + this.f184355d.f191760d + " ADD COLUMN profile_extensions_basic_ideal_c BLOB");
                sQLiteDatabase.execSQL("ALTER TABLE " + this.f184355d.f191760d + " ADD COLUMN profile_extensions_basic_unideal_c BLOB");
            case 27:
                sQLiteDatabase.execSQL("ALTER TABLE " + this.f184355d.f191760d + " ADD COLUMN profile_moments_counters_totalNormalMoments_c INTEGER");
            case 28:
                sQLiteDatabase.execSQL("ALTER TABLE " + this.f184355d.f191760d + " ADD COLUMN profile_extensions_interest_taste_c BLOB");
            case 29:
                sQLiteDatabase.execSQL("ALTER TABLE " + this.f184355d.f191760d + " ADD COLUMN location_region_province_c TEXT");
            case 30:
                sQLiteDatabase.execSQL("ALTER TABLE " + this.f184355d.f191760d + " ADD COLUMN profile_extensions_basic_intlFriendPurpose_c BLOB");
            case 31:
                sQLiteDatabase.execSQL("ALTER TABLE " + this.f184355d.f191760d + " ADD COLUMN profile_extensions_basic_intlFriendPurposeV2_c BLOB");
                break;
        }
    }

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ void m201490l(DbLinks dbLinks) {
        this.f184354c.upsert(dbLinks);
    }

    /* JADX INFO: renamed from: n */
    public void m201492n(final DbLinks dbLinks) {
        l9c.m153394o().m153397B(new x20() { // from class: l.uj5
            @Override // p153l.x20
            public final void call() {
                this.f179181a.m201490l(dbLinks);
            }
        });
    }

    @Override // p153l.gq2
    /* JADX INFO: renamed from: b */
    public void mo131339b(Envelope envelope) {
    }

    @Override // p153l.gq2
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public void mo131338a(Envelope envelope, CommonData commonData, boolean z, boolean z2, boolean z3) {
    }
}
