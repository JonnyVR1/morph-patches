package org.fourthline.cling.binding.staging;

import java.net.URI;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.fourthline.cling.model.ValidationException;
import org.fourthline.cling.model.meta.Action;
import org.fourthline.cling.model.meta.Device;
import org.fourthline.cling.model.meta.Service;
import org.fourthline.cling.model.meta.StateVariable;
import org.fourthline.cling.model.types.ServiceId;
import org.fourthline.cling.model.types.ServiceType;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes3.dex */
public class MutableService {
    public URI controlURI;
    public URI descriptorURI;
    public URI eventSubscriptionURI;
    public ServiceId serviceId;
    public ServiceType serviceType;
    public List<MutableAction> actions = new ArrayList();
    public List<MutableStateVariable> stateVariables = new ArrayList();

    public Service build(Device device) throws ValidationException {
        return device.newInstance(this.serviceType, this.serviceId, this.descriptorURI, this.controlURI, this.eventSubscriptionURI, createActions(), createStateVariables());
    }

    public Action[] createActions() {
        Action[] actionArr = new Action[this.actions.size()];
        Iterator<MutableAction> it = this.actions.iterator();
        int i = 0;
        while (it.hasNext()) {
            actionArr[i] = it.next().build();
            i++;
        }
        return actionArr;
    }

    public StateVariable[] createStateVariables() {
        StateVariable[] stateVariableArr = new StateVariable[this.stateVariables.size()];
        Iterator<MutableStateVariable> it = this.stateVariables.iterator();
        int i = 0;
        while (it.hasNext()) {
            stateVariableArr[i] = it.next().build();
            i++;
        }
        return stateVariableArr;
    }
}
