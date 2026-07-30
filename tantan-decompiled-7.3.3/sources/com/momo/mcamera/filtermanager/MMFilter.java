package com.momo.mcamera.filtermanager;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.TextUtils;
import com.momo.mcamera.filtermanager.filterext.BitmapBlendFilter;
import com.momo.mcamera.mask.MaskStore;
import com.momo.mcamera.mask.StickerAdjustFilter;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import p153l.h5w;
import p153l.hqf0;
import p153l.jt2;
import p153l.qv40;

/* JADX INFO: loaded from: classes6.dex */
public class MMFilter implements Serializable {
    public static final long serialVersionUID = 8953832831202944607L;
    private transient Context context;
    public String mFilterName;
    public String mImageUri;
    private List<MMProcessUnit> mProcessUnits;

    public MMFilter(Context context) {
        this.mProcessUnits = new ArrayList();
        this.context = context;
    }

    public static Bitmap getBitmapByPath(String str, Context context) {
        return str.startsWith("light_room_filters") ? MMPresetFilterStore.getBitmapWithPath(str, context) : BitmapFactory.decodeFile(str);
    }

    public static jt2 getFilterByUnit(MMProcessUnit mMProcessUnit, Context context) {
        jt2 jt2Var = null;
        try {
            Class<?> cls = Class.forName(mMProcessUnit.getFilterName());
            jt2 jt2Var2 = (jt2) cls.newInstance();
            try {
                HashMap<String, Object> filterMap = mMProcessUnit.getFilterMap();
                if (filterMap != null) {
                    for (String str : filterMap.keySet()) {
                        cls.getDeclaredMethod(str, ClassUtil.getUsefulClass(filterMap.get(str))).invoke(jt2Var2, filterMap.get(str));
                    }
                }
                if (mMProcessUnit.getTexturePath1() != null && (jt2Var2 instanceof h5w)) {
                    ((h5w) jt2Var2).setLookupBitmap(getBitmapByPath(mMProcessUnit.getTexturePath1(), context));
                }
                return jt2Var2;
            } catch (ClassNotFoundException e) {
                e = e;
                jt2Var = jt2Var2;
                e.printStackTrace();
                return jt2Var;
            } catch (IllegalAccessException e2) {
                e = e2;
                jt2Var = jt2Var2;
                e.printStackTrace();
                return jt2Var;
            } catch (InstantiationException e3) {
                e = e3;
                jt2Var = jt2Var2;
                e.printStackTrace();
                return jt2Var;
            } catch (NoSuchMethodException e4) {
                e = e4;
                jt2Var = jt2Var2;
                e.printStackTrace();
                return jt2Var;
            } catch (InvocationTargetException e5) {
                e = e5;
                jt2Var = jt2Var2;
                e.printStackTrace();
                return jt2Var;
            }
        } catch (ClassNotFoundException e6) {
            e = e6;
        } catch (IllegalAccessException e7) {
            e = e7;
        } catch (InstantiationException e8) {
            e = e8;
        } catch (NoSuchMethodException e9) {
            e = e9;
        } catch (InvocationTargetException e10) {
            e = e10;
        }
    }

    public static List<jt2> getFilterGroupByUnits(Collection<MMProcessUnit> collection, Context context) {
        ArrayList arrayList = new ArrayList();
        for (MMProcessUnit mMProcessUnit : collection) {
            if (mMProcessUnit.isDecoration()) {
                StickerAdjustFilter stickerAdjustFilter = new StickerAdjustFilter(context);
                stickerAdjustFilter.enableSelfRender = true;
                stickerAdjustFilter.addMaskModel(MaskStore.getInstance().getMask(context, mMProcessUnit.getResourceName()));
                arrayList.add(stickerAdjustFilter);
            } else {
                try {
                    Class<?> cls = Class.forName(mMProcessUnit.getFilterName());
                    jt2 jt2Var = (jt2) cls.newInstance();
                    HashMap<String, Object> filterMap = mMProcessUnit.getFilterMap();
                    if (filterMap != null) {
                        for (String str : filterMap.keySet()) {
                            cls.getDeclaredMethod(str, ClassUtil.getUsefulClass(filterMap.get(str))).invoke(jt2Var, filterMap.get(str));
                        }
                    }
                    if (mMProcessUnit.getTexturePath1() != null) {
                        if (jt2Var instanceof h5w) {
                            if (mMProcessUnit.getTexturePath1().startsWith("light_room_filters")) {
                                ((h5w) jt2Var).setAssetResourcesId(context, mMProcessUnit.getTexturePath1());
                            } else {
                                ((h5w) jt2Var).setLookUpPath(mMProcessUnit.getTexturePath1());
                            }
                        } else if (jt2Var instanceof BitmapBlendFilter) {
                            ((BitmapBlendFilter) jt2Var).setBlendBitmap(getBitmapByPath(mMProcessUnit.getTexturePath1(), context));
                        }
                    }
                    arrayList.add(jt2Var);
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                } catch (IllegalAccessException e2) {
                    e2.printStackTrace();
                } catch (InstantiationException e3) {
                    e3.printStackTrace();
                } catch (NoSuchMethodException e4) {
                    e4.printStackTrace();
                } catch (InvocationTargetException e5) {
                    e5.printStackTrace();
                }
            }
        }
        if (arrayList.size() == 0) {
            arrayList.add(new qv40());
        }
        return arrayList;
    }

    public hqf0 getFilterGroup() {
        return new hqf0(getFilterGroupByUnits(getProcessUnits(), this.context));
    }

    public String getFilterName() {
        if (!TextUtils.isEmpty(this.mFilterName)) {
            this.mFilterName.replace(".", "_");
            String[] strArrSplit = this.mFilterName.split("_");
            if (strArrSplit.length > 1) {
                return strArrSplit[1];
            }
        }
        return this.mFilterName;
    }

    public String getKey() {
        return ".....";
    }

    public List<MMProcessUnit> getProcessUnits() {
        return this.mProcessUnits;
    }

    public void setProcessUnits(List<MMProcessUnit> list) {
        this.mProcessUnits = list;
    }

    public MMFilter() {
    }
}
