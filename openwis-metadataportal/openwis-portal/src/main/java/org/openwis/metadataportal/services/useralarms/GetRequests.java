package org.openwis.metadataportal.services.useralarms;

import jeeves.server.context.ServiceContext;

import org.openwis.dataservice.useralarms.UserAlarmReferenceType;

public class GetRequests extends AbstractUserAlarmGetService {

   @Override
   protected UserAlarmReferenceType getReferenceType() {
      return UserAlarmReferenceType.REQUEST;
   }

   @Override
   protected String getUserName(ServiceContext ctx) {
      return ctx.getUserSession().getUsername();
   }

}
