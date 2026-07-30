package com.momo.mcamera.ThirdPartEffect.Pott;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.cosmos.mdlog.MDLog;
import com.momo.mcamera.ThirdPartEffect.Pott.config.MVSegmentCfg;
import com.momo.mcamera.ThirdPartEffect.Pott.config.PottAssetCfg;
import com.momo.mcamera.ThirdPartEffect.Pott.config.PottParameter;
import com.momo.mcamera.ThirdPartEffect.Pott.config.Template;
import com.momo.mcamera.ThirdPartEffect.Pott.filter.MixProgramGroupRenderFilter;
import com.momo.mcamera.ThirdPartEffect.Pott.program.programgroup.EsTemplateProgramGroup;
import com.momo.mcamera.ThirdPartEffect.Pott.program.programgroup.PottMVMapProgramGroup;
import com.momo.mcamera.ThirdPartEffect.Pott.program.programgroup.PottMVTailerProgramGroup;
import com.momo.mcamera.ThirdPartEffect.Pott.program.programgroup.PottMVTemplateProgramGroup;
import com.momo.mcamera.ThirdPartEffect.Pott.program.programgroup.PottMVTitleProgramGroup;
import com.momo.mcamera.util.JsonConfigParseHelpler;
import com.momo.mcamera.util.MDLogTag;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import p149l.f7j0;
import p149l.fc90;
import p149l.p3j;
import p149l.ts2;

/* JADX INFO: loaded from: classes6.dex */
public class PottImageMovieFilterManager extends f7j0 {
    private static final int TOTAL_CNT = 375;
    PottParameter allParameterInfo;
    Map<String, Object> parameters;
    PottAssetCfg pottAssetCfg;
    PottMVMapProgramGroup pottMVMapProgramGroup;
    PottMVTailerProgramGroup tailerProgramGroup;
    PottMVTitleProgramGroup titleProgramGroup;
    List<PottMVTemplateProgramGroup> pottMVTemplateList = new ArrayList();
    Map<String, List<Template>> templateMap = new HashMap();
    Map<String, Integer> templateIndex = new HashMap();
    List<EsTemplateProgramGroup> groupList = new ArrayList();
    String[] templateTypeArray = {"9:16", "3:4", "1:1", "4:3", "16:9"};
    float[] templateRatioArray = {0.5625f, 0.75f, 1.0f, 1.3333334f, 1.7777778f};
    private int totalFrameCount = 0;
    MixProgramGroupRenderFilter mixFilter = null;

    private boolean initAllEffectGroup() {
        if (this.allParameterInfo == null) {
            MDLog.m7391e(MDLogTag.FILTER_TAG, "Initall Effect Error , Parameter is null");
            return false;
        }
        PottAssetCfg pottAssetCfgLoadPottAssetFile = JsonConfigParseHelpler.loadPottAssetFile(this.allParameterInfo.configResourcePath + "/config.json");
        this.pottAssetCfg = pottAssetCfgLoadPottAssetFile;
        if (pottAssetCfgLoadPottAssetFile == null) {
            return true;
        }
        for (MVSegmentCfg mVSegmentCfg : pottAssetCfgLoadPottAssetFile.getAssets()) {
            String str = this.allParameterInfo.configResourcePath + "/" + mVSegmentCfg.getFolder();
            List<Template> templateList = mVSegmentCfg.getTemplateList();
            if (mVSegmentCfg.getType().equalsIgnoreCase("template")) {
                initTemplateCfg(templateList, str);
            } else if (mVSegmentCfg.getType().equalsIgnoreCase("tailer")) {
                initTailerCfg(templateList, str, this.allParameterInfo.mapType);
            } else if (mVSegmentCfg.getType().equalsIgnoreCase("title")) {
                initTitleCfg(templateList, str, this.allParameterInfo.mapType);
            }
        }
        if (this.allParameterInfo.imageList != null && this.templateMap.size() > 0) {
            return initNormalTemplate();
        }
        MDLog.m7391e(MDLogTag.FILTER_TAG, " 传入参数错误，未传入用户图片列表，或配置文件有问下周");
        return false;
    }

    private boolean initNormalTemplate() {
        if (this.allParameterInfo == null) {
            return false;
        }
        for (int i = 0; i < this.allParameterInfo.imageList.size(); i++) {
            String str = this.allParameterInfo.imageList.get(i);
            BitmapFactory.Options options = new BitmapFactory.Options();
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeFile(str, options);
            int i2 = options.outWidth;
            int i3 = options.outHeight;
            String[] strArr = this.templateTypeArray;
            String str2 = strArr[strArr.length - 1];
            int i4 = 0;
            while (true) {
                float[] fArr = this.templateRatioArray;
                if (i4 >= fArr.length) {
                    break;
                }
                float f = fArr[i4];
                float f2 = (i2 * 1.0f) / i3;
                if (this.templateMap.containsKey(this.templateTypeArray[i4]) && f >= f2) {
                    str2 = this.templateTypeArray[i4];
                    break;
                }
                i4++;
            }
            new Random();
            if (this.templateMap.size() > 0) {
                List<Template> list = this.templateMap.get(str2);
                if (list == null) {
                    Set<String> setKeySet = this.templateMap.keySet();
                    if (setKeySet.size() > 0) {
                        str2 = (String) setKeySet.toArray()[0];
                        list = this.templateMap.get(setKeySet.toArray()[0]);
                    }
                }
                if (list == null || list.size() <= 0) {
                    MDLog.m7391e(MDLogTag.FILTER_TAG, "Get template failed , no template is perfect !!");
                    return false;
                }
                Integer num = this.templateIndex.get(str2);
                if (num == null) {
                    num = 0;
                }
                this.templateIndex.put(str2, Integer.valueOf((num.intValue() + 1) % list.size()));
                Template template = list.get(num.intValue());
                MDLog.m7389d(MDLogTag.FILTER_TAG, "image width = " + i2 + " height=" + i3 + " Index=" + num);
                StringBuilder sb = new StringBuilder("choos template type=");
                sb.append(template.getType());
                sb.append(" name=");
                sb.append(template.getSubFolder());
                MDLog.m7389d(MDLogTag.FILTER_TAG, sb.toString());
                PottMVTemplateProgramGroup pottMVTemplateProgramGroup = new PottMVTemplateProgramGroup();
                if (this.allParameterInfo.userLocationList.size() > 0 && i < this.allParameterInfo.userLocationList.size()) {
                    pottMVTemplateProgramGroup.setUseLocationPath(this.allParameterInfo.userLocationList.get(i));
                } else if (this.allParameterInfo.userLocationBmpList.size() > 0 && this.allParameterInfo.userLocationBmpList.size() > i) {
                    pottMVTemplateProgramGroup.setUserLocationBmp(this.allParameterInfo.userLocationBmpList.get(i));
                }
                pottMVTemplateProgramGroup.setLocalBitmapPath(str);
                initSingleGroup(pottMVTemplateProgramGroup, template.baseFolder, template.getFadeoutStartFrmNo() * 40, template.getTotalNum() * 40);
                this.pottMVTemplateList.add(pottMVTemplateProgramGroup);
            }
        }
        return true;
    }

    private void initSingleGroup(EsTemplateProgramGroup esTemplateProgramGroup, String str, long j, long j2) {
        if (esTemplateProgramGroup == null) {
            return;
        }
        esTemplateProgramGroup.setBaseFolder(str);
        esTemplateProgramGroup.setTemplateTailerTimeInMs(j);
        esTemplateProgramGroup.setTemplateTotalTimeInMs(j2);
        int i = this.totalFrameCount;
        if (i == 0) {
            this.totalFrameCount = (int) (((long) i) + (j2 / 40));
        } else {
            this.totalFrameCount = (int) (((long) i) + ((j2 / 40) - 5));
        }
        esTemplateProgramGroup.setErrorListener(null);
        this.groupList.add(esTemplateProgramGroup);
    }

    private void initTailerCfg(List<Template> list, String str, String str2) {
        EsTemplateProgramGroup esTemplateProgramGroup;
        for (Template template : list) {
            String str3 = str + "/" + template.getSubFolder();
            if (template.getType().equalsIgnoreCase("map")) {
                PottMVMapProgramGroup pottMVMapProgramGroup = new PottMVMapProgramGroup();
                this.pottMVMapProgramGroup = pottMVMapProgramGroup;
                pottMVMapProgramGroup.setTravelList(this.allParameterInfo.traveledLocations);
                this.pottMVMapProgramGroup.setMapType(str2);
                esTemplateProgramGroup = this.pottMVMapProgramGroup;
                MDLog.m7389d(MDLogTag.FILTER_TAG, "Init map of tailer Template");
            } else if (template.getType().equalsIgnoreCase("end")) {
                PottMVTailerProgramGroup pottMVTailerProgramGroup = new PottMVTailerProgramGroup();
                this.tailerProgramGroup = pottMVTailerProgramGroup;
                pottMVTailerProgramGroup.setUserHeadIcondPath(this.allParameterInfo.userHeadIcondPath);
                this.tailerProgramGroup.setUserNickNamePath(this.allParameterInfo.userNickNamePath);
                this.tailerProgramGroup.setUserIdPath(this.allParameterInfo.userIdPath);
                this.tailerProgramGroup.setUserHeadIconBitmap(this.allParameterInfo.userHeadIconBitmap);
                this.tailerProgramGroup.setUserNickNameBitmap(this.allParameterInfo.userNickNameBitmap);
                this.tailerProgramGroup.setUserIdBitmap(this.allParameterInfo.userIdBitmap);
                esTemplateProgramGroup = this.tailerProgramGroup;
                MDLog.m7389d(MDLogTag.FILTER_TAG, "Init end  of tailer Template");
                int i = 380 - this.totalFrameCount;
                if (i > 0) {
                    template.setFadeoutStartFrmNo(i - (template.getTotalNum() - template.getFadeoutStartFrmNo()));
                    template.setTotalNum(i);
                }
            } else {
                esTemplateProgramGroup = null;
            }
            initSingleGroup(esTemplateProgramGroup, str3, template.getFadeoutStartFrmNo() * 40, template.getTotalNum() * 40);
        }
    }

    private void initTemplateCfg(List<Template> list, String str) {
        for (Template template : list) {
            template.baseFolder = str + "/" + template.getSubFolder();
            if (this.templateMap.containsKey(template.getType())) {
                this.templateMap.get(template.getType()).add(template);
            } else {
                ArrayList arrayList = new ArrayList();
                arrayList.add(template);
                this.templateMap.put(template.getType(), arrayList);
            }
        }
        MDLog.m7389d(MDLogTag.FILTER_TAG, "Init normale Template + " + this.templateMap.toString());
    }

    private void initTitleCfg(List<Template> list, String str, String str2) {
        if (list.size() > 0) {
            Template template = list.get(0);
            String str3 = str + "/" + template.getSubFolder();
            PottMVTitleProgramGroup pottMVTitleProgramGroup = new PottMVTitleProgramGroup();
            this.titleProgramGroup = pottMVTitleProgramGroup;
            pottMVTitleProgramGroup.setUserHeadIcondPath(this.allParameterInfo.userHeadIcondPath);
            this.titleProgramGroup.setUserNickNamePath(this.allParameterInfo.userNickNamePath);
            this.titleProgramGroup.setUserIdPath(this.allParameterInfo.userIdPath);
            this.titleProgramGroup.setUserHeadIconBitmap(this.allParameterInfo.userHeadIconBitmap);
            this.titleProgramGroup.setUserNickNameBitmap(this.allParameterInfo.userNickNameBitmap);
            this.titleProgramGroup.setUserIdBitmap(this.allParameterInfo.userIdBitmap);
            this.titleProgramGroup.setWorldCityCnt(this.allParameterInfo.worldCityCnt);
            this.titleProgramGroup.setCountryCnt(this.allParameterInfo.countryCnt);
            this.titleProgramGroup.setMapType(str2);
            this.titleProgramGroup.setChinaCityCnt(this.allParameterInfo.chinaCityCnt);
            this.titleProgramGroup.setChinaProvinceCnt(this.allParameterInfo.chinaProvinceCnt);
            initSingleGroup(this.titleProgramGroup, str3, template.getFadeoutStartFrmNo() * 40, template.getTotalNum() * 40);
            MDLog.m7389d(MDLogTag.FILTER_TAG, "Init Title Template");
        }
    }

    @Override // p149l.f7j0
    public void destroy() {
        super.destroy();
        this.allParameterInfo = null;
        this.pottAssetCfg = null;
        if (this.tailerProgramGroup != null) {
            this.titleProgramGroup.destroy();
            this.titleProgramGroup = null;
        }
        List<PottMVTemplateProgramGroup> list = this.pottMVTemplateList;
        if (list != null) {
            list.clear();
        }
        PottMVMapProgramGroup pottMVMapProgramGroup = this.pottMVMapProgramGroup;
        if (pottMVMapProgramGroup != null) {
            pottMVMapProgramGroup.destroy();
            this.pottMVMapProgramGroup = null;
        }
        PottMVTailerProgramGroup pottMVTailerProgramGroup = this.tailerProgramGroup;
        if (pottMVTailerProgramGroup != null) {
            pottMVTailerProgramGroup.destroy();
            this.tailerProgramGroup = null;
        }
        Map<String, Object> map = this.parameters;
        if (map != null) {
            map.clear();
            this.parameters = null;
        }
        this.templateMap.clear();
        this.groupList.clear();
        this.mixFilter = null;
    }

    public int getTotalFrameCount() {
        return TOTAL_CNT;
    }

    @Override // p149l.f7j0
    public ts2 getVideoProcessFilter() {
        MixProgramGroupRenderFilter mixProgramGroupRenderFilter = new MixProgramGroupRenderFilter();
        this.mixFilter = mixProgramGroupRenderFilter;
        PottMVTitleProgramGroup pottMVTitleProgramGroup = this.titleProgramGroup;
        if (pottMVTitleProgramGroup != null) {
            mixProgramGroupRenderFilter.addRenderGroup(pottMVTitleProgramGroup);
        }
        Iterator<PottMVTemplateProgramGroup> it = this.pottMVTemplateList.iterator();
        while (it.hasNext()) {
            this.mixFilter.addRenderGroup(it.next());
        }
        PottMVMapProgramGroup pottMVMapProgramGroup = this.pottMVMapProgramGroup;
        if (pottMVMapProgramGroup != null) {
            this.mixFilter.addRenderGroup(pottMVMapProgramGroup);
        }
        PottMVTailerProgramGroup pottMVTailerProgramGroup = this.tailerProgramGroup;
        if (pottMVTailerProgramGroup != null) {
            this.mixFilter.addRenderGroup(pottMVTailerProgramGroup);
        }
        return this.mixFilter;
    }

    @Override // p149l.f7j0
    public void resetInternalStatusInEglThread() {
        super.resetInternalStatusInEglThread();
        Iterator<EsTemplateProgramGroup> it = this.groupList.iterator();
        while (it.hasNext()) {
            it.next().resetStatus();
        }
        MixProgramGroupRenderFilter mixProgramGroupRenderFilter = this.mixFilter;
        if (mixProgramGroupRenderFilter != null) {
            mixProgramGroupRenderFilter.resetGroupStatus();
        }
    }

    public boolean setAllParameterInfo(PottParameter pottParameter) {
        this.allParameterInfo = pottParameter;
        return initAllEffectGroup();
    }

    @Override // p149l.f7j0
    public void setFrameRate(int i) {
    }

    @Override // p149l.f7j0
    public void setProcessErrorListener(fc90 fc90Var) {
        super.setProcessErrorListener(fc90Var);
        Iterator<EsTemplateProgramGroup> it = this.groupList.iterator();
        while (it.hasNext()) {
            it.next().setErrorListener(fc90Var);
        }
    }

    public void setTransferFieldImage(Bitmap bitmap, Bitmap bitmap2) {
    }

    @Override // p149l.f7j0
    public void lockCoverFrame(Bitmap bitmap, p3j.InterfaceC19124a interfaceC19124a) {
    }
}
